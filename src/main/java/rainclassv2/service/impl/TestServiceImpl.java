package rainclassv2.service.impl;

import org.springframework.stereotype.Service;
import rainclassv2.mapper.TestMapper;
import rainclassv2.pojo.Test;
import rainclassv2.service.TestService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestServiceImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/5/21 下午2:37
 * @Version 1.0
 **/
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public List<Test> getList() {
        List<Test> list = testMapper.getList();
        return list;
    }
}
