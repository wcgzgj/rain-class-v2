package rainclassv2.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rainclassv2.pojo.Admin;
import rainclassv2.pojo.Student;
import rainclassv2.pojo.Teacher;
import rainclassv2.req.LoginReq;
import rainclassv2.resp.CommonResp;
import rainclassv2.resp.LoginResp;
import rainclassv2.service.AdminService;
import rainclassv2.service.StudentService;
import rainclassv2.service.TeacherService;
import rainclassv2.service.UserService;
import rainclassv2.util.CopyUtil;
import rainclassv2.util.SnowFlake;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.xml.stream.FactoryConfigurationError;
import java.util.Objects;
import java.util.Spliterator;
import java.util.concurrent.TimeUnit;

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

    /**
     * redis 工具
     */
    @Resource
    private RedisTemplate redisTemplate;


    @Resource
    private UserService userService;

    @Resource
    private SnowFlake snowFlake;


    @PostMapping("/login")
    public CommonResp login(@Valid LoginReq req) {

        CommonResp commonResp = new CommonResp();
        boolean login = userService.login(req);
        LoginResp loginResp = CopyUtil.copy(req, LoginResp.class);

        String token = snowFlake.toString();
        loginResp.setToken(token);
        //将登陆信息，存入redis
        redisTemplate.opsForValue().set(token,JSON.toJSONString(loginResp),3600*24, TimeUnit.SECONDS);

        //写不下去了，以后再说吧....
        return null;
    }


}
