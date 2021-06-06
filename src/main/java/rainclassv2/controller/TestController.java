package rainclassv2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rainclassv2.pojo.Test;
import rainclassv2.resp.CommonResp;
import rainclassv2.service.TestService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/6 下午10:30
 * @Version 1.0
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/list")
    public CommonResp list() {
        List<Test> all = testService.getAll();
        CommonResp commonResp = new CommonResp();
        commonResp.setContent(all);
        return commonResp;
    }

}
