package rainclassv2.service;
import rainclassv2.pojo.Teacher;

public interface TeacherService {

    /**
     * 根据登录名，查询用户
     * @param loginname
     * @return
     */
    Teacher selectByLoginname(String loginname);

}
