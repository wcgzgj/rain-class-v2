package rainclassv2.service.impl;

import org.springframework.stereotype.Service;
import rainclassv2.mapper.StudentMapper;
import rainclassv2.pojo.Student;
import rainclassv2.pojo.StudentExample;
import rainclassv2.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName StudentServiceImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/7 上午1:15
 * @Version 1.0
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    /**
     * 根据登录名，查询用户
     * @param loginname
     * @return
     */
    @Override
    public Student selectByLoginname(String loginname) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andLoginnameEqualTo(loginname);

        List<Student> students = studentMapper.selectByExample(studentExample);
        if (students==null || students.size()==0) {
            return null;
        }
        return students.get(0);
    }
}
