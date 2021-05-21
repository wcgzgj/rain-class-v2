package rainclassv2.service.impl;

import org.springframework.stereotype.Service;
import rainclassv2.mapper.DemoMapper;
import rainclassv2.pojo.Demo;
import rainclassv2.service.DemoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DemoListImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/21 下午2:46
 * @Version 1.0
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMapper demoMapper;

    @Override
    public List<Demo> getList() {
        List<Demo> demos = demoMapper.selectByExample(null);
        return demos;
    }
}
