package rainclassv2.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import rainclassv2.mapper.ClassMapper;
import rainclassv2.pojo.Class;
import rainclassv2.pojo.ClassExample;
import rainclassv2.req.ClassQueryReq;
import rainclassv2.resp.ClassQueryResp;
import rainclassv2.resp.PageResp;
import rainclassv2.service.ClassService;
import rainclassv2.util.CopyUtil;
import rainclassv2.util.SnowFlake;
import rainclassv2.util.StringUtil;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName ClassServiceImpl
 * @Description 课程业务类
 * @Author FARO_Z
 * @Date 2021/6/6 下午7:21
 * @Version 1.0
 **/
@Service
public class ClassServiceImpl implements ClassService {

    private static final Logger LOG= LoggerFactory.getLogger(ClassServiceImpl.class);

    @Resource
    private ClassMapper classMapper;

    @Resource
    private SnowFlake snowFlake;


    @Override
    public PageResp<ClassQueryResp> list(ClassQueryReq req) {
        //页码
        int page = req.getPage();
        //每页条数
        int size = req.getSize();
        //课程编号
        String code = req.getCode();
        //课程名称
        String classname = req.getClassname();

        //多查询条件容器
        ClassExample classExample = null;


        if (StringUtil.isEmpty(code) && StringUtil.isEmpty(classname)) {
            //没有任何查询条件，说明是全查
        } else {
            //按照条件，进行查询
            classExample = new ClassExample();
            ClassExample.Criteria criteria = classExample.createCriteria();
            criteria.andClassnameLike("%"+classname+"%");
            if (!StringUtil.isEmpty(code)) {
                criteria.andCodeEqualTo(code);
            }
        }

        PageHelper.startPage(page,size);
        List<Class> classes = classMapper.selectByExample(classExample);
        PageInfo<Class> pageInfo = new PageInfo<>(classes);

        PageResp<ClassQueryResp> pageResp = new PageResp<>();

        List<ClassQueryResp> classQueryResps = CopyUtil.copyList(classes, ClassQueryResp.class);
        pageResp.setList(classQueryResps);
        pageResp.setTotal(pageInfo.getTotal());
        return pageResp;
    }
}
