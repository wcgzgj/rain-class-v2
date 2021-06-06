package rainclassv2.service.impl;

import rainclassv2.exception.BusinessException;
import rainclassv2.exception.BusinessExceptionCode;
import rainclassv2.pojo.Admin;
import rainclassv2.pojo.Student;
import rainclassv2.pojo.Teacher;
import rainclassv2.req.LoginReq;
import rainclassv2.service.AdminService;
import rainclassv2.service.StudentService;
import rainclassv2.service.TeacherService;
import rainclassv2.service.UserService;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/7 上午1:51
 * @Version 1.0
 **/
public class UserServiceImpl implements UserService {

    @Resource
    private AdminService adminService;

    @Resource
    private TeacherService teacherService;

    @Resource
    private StudentService studentService;

    @Override
    public boolean login(LoginReq req) {

        String password=null;
        boolean flag=true;
        /**
         * 获取登录的用户类型
         * teacher  student  admin
         */
        String type = req.getType();
        if ("teacher".equals(type)) {
            Teacher teacher = teacherService.selectByLoginname(req.getLoginname());
            if (teacher==null) {
                flag=false;
            } else {
                password=req.getPassword();
            }
        } else if ("student".equals(type)) {
            Student student = studentService.selectByLoginname(req.getLoginname());
            if (student==null) {
                flag=false;
            } else {
                password=req.getPassword();
            }
        } else if ("admin".equals(type)) {
            Admin admin = adminService.selectByLoginname(req.getLoginname());
            if (admin==null) {
                flag=false;
            } else {
                password=req.getPassword();
            }
        }
        if (flag && Objects.equals(password,req.getPassword())) {
            return true;
        }
        throw new BusinessException(BusinessExceptionCode.LOGIN_USER_ERROR);
    }
}
