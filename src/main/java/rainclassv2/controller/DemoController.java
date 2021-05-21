package rainclassv2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rainclassv2.pojo.Demo;
import rainclassv2.service.DemoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/21 下午2:48
 * @Version 1.0
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;

    @RequestMapping("/list")
    public List<Demo> list() {
        List<Demo> list = demoService.getList();
        return list;
    }

}
