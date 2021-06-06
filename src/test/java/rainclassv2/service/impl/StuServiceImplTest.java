package rainclassv2.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import rainclassv2.config.RainClassV2Application;
import rainclassv2.service.StuService;

import javax.annotation.Resource;


@SpringBootTest(classes = RainClassV2Application.class)
class StuServiceImplTest {

    @Resource
    private StuService stuService;

    @Test
    void login() {
        boolean res = stuService.login("19180319", "123");
        System.out.println(res);
    }
}