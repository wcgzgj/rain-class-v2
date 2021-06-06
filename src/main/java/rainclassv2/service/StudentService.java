package rainclassv2.service;
import rainclassv2.pojo.Student;

public interface StudentService {

    /**
     * 根据登录名，查询用户
     * @param loginname
     * @return
     */
    Student selectByLoginname(String loginname);

}
