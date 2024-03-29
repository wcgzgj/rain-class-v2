package rainclassv2.util;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName CopyUtil
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/21 下午3:02
 * @Version 1.0
 **/
public class CopyUtil {
    /**
     * 单体复制
     * 传入Class对象，是因为这样能传入类型信息
     * 这样最后创建的对象，就不用强制类型转换了
     */
    public static<T> T copy(Object source, Class<T> clazz) {
        if (source == null) {
            return null;
        }
        T obj = null;
        try {
            obj = clazz.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        /**
         * 要忽略属性值为为空的属性
         * 第三个参数，是获取所有值为空的属性的名称数组
         */
        BeanUtils.copyProperties(source, obj,getNullPropertyName(source));

        return obj;
    }

    /**
     * 列表复制
     */
    public static <T> List<T> copyList(List source, Class<T> clazz) {
        List<T> target = new ArrayList<>();
        if (!CollectionUtils.isEmpty(source)){
            for (Object c: source) {
                T obj = copy(c, clazz);
                target.add(obj);
            }
        }
        return target;
    }

    /**
     * 找出所有属性值为null的属性名
     * @param source
     * @return
     */
    private static String[] getNullPropertyName(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<String>();
        for(java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) {
                emptyNames.add(pd.getName());
            }
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}
