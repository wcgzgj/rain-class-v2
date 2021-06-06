package rainclassv2;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import rainclassv2.config.RainClassV2Application;
import rainclassv2.req.ClassQueryReq;
import rainclassv2.resp.ClassQueryResp;
import rainclassv2.resp.PageResp;
import rainclassv2.service.ClassService;
import rainclassv2.service.TestService;
import rainclassv2.util.SnowFlake;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootTest(classes = RainClassV2Application.class)
class RainClassV2ApplicationTests {




    @Resource
    private SnowFlake snowFlake;

    @Resource
    private ClassService classService;

    @Resource
    private TestService testService;

    @Resource
    private RedisTemplate redisTemplate;

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

    @Test
    public void redisTest() {
        /**
         * token: 手动生成的 token 作为 redis 的 key
         *
         * JSONObject.toJSON(userLoginResp): 作为 redis 的 value,
         * 这个 value 需要序列化，可以让 userLoginResp 实现Serializable接口，
         * 也可以像下面一样，将其转成 JSON 字符串
         *
         * 3600*24: 设置超时时间
         */
        redisTemplate.opsForValue().set("msg","hahaha",100, TimeUnit.SECONDS);

        Object msg = redisTemplate.opsForValue().get("msg");
        System.out.println(msg);
    }

}
