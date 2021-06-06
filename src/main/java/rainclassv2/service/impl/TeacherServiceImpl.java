package rainclassv2.service.impl;

import org.springframework.stereotype.Service;
import rainclassv2.mapper.TeacherMapper;
import rainclassv2.pojo.Teacher;
import rainclassv2.pojo.TeacherExample;
import rainclassv2.service.TeacherService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TeacherServiceImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/7 上午1:15
 * @Version 1.0
 **/
@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherMapper teacherMapper;

    /**
     * 根据登录名，查询用户
     * @param loginname
     * @return
     */
    @Override
    public Teacher selectByLoginname(String loginname) {
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andLoginnameEqualTo(loginname);

        List<Teacher> teachers = teacherMapper.selectByExample(teacherExample);
        if (teachers==null || teachers.size()==0) {
            return null;
        }
        return teachers.get(0);
    }
}
