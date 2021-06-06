package rainclassv2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import rainclassv2.config.RainClassV2Application;
import rainclassv2.req.ClassQueryReq;
import rainclassv2.resp.ClassQueryResp;
import rainclassv2.resp.PageResp;
import rainclassv2.service.ClassService;
import rainclassv2.service.TestService;
import rainclassv2.util.SnowFlake;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = RainClassV2Application.class)
class RainClassV2ApplicationTests {




    @Resource
    private SnowFlake snowFlake;

    @Resource
    private ClassService classService;

    @Resource
    private TestService testService;

    @Test
    void contextLoads() {
    }

    @Test
    public void nextIdTest() {
        long id = snowFlake.nextId();
        System.out.println(id);
    }

    @Test
    public void classServiceTest() {
        ClassQueryReq req = new ClassQueryReq();

        req.setSize(5);
        req.setPage(1);
        req.setClassname("数据结构");
        PageResp<ClassQueryResp> list = classService.list(req);

        System.out.println(list);
    }

    @Test
    public void testServiceTest() {
        List<rainclassv2.pojo.Test> all = testService.getAll();
        System.out.println(all);
    }

}
