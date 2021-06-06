package rainclassv2.util;

/**
 * @ClassName StringUtil
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/6 下午7:41
 * @Version 1.0
 **/
public class StringUtil {
    public static boolean isEmpty(String str) {
        if (str==null || str.length()==0) {
            return true;
        }
        return false;
    }
}
