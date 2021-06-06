package rainclassv2.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rainclassv2.pojo.Teacher;
import rainclassv2.req.LoginReq;
import rainclassv2.resp.CommonResp;
import rainclassv2.service.AdminService;
import rainclassv2.service.StudentService;
import rainclassv2.service.TeacherService;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/26 上午11:28
 * @Version 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private AdminService adminService;

    @Resource
    private TeacherService teacherService;

    @Resource
    private StudentService studentService;

    /**
     * redis 工具
     */
    @Resource
    private RedisTemplate redisTemplate;


    @PostMapping("/login")
    public CommonResp login(@Valid LoginReq req) {
        /**
         * 获取登录的用户类型
         * teacher  student  admin
         */
        String type = req.getType();
        if ("teacher".equals(type)) {

        } else if ("student".equals(type)) {

        } else if ("admin".equals(type)) {

        }

        return null;
    }


}
