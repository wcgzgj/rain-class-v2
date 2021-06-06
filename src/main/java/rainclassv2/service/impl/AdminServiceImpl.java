package rainclassv2.service.impl;

import org.springframework.stereotype.Service;
import rainclassv2.mapper.AdminMapper;
import rainclassv2.pojo.Admin;
import rainclassv2.pojo.AdminExample;
import rainclassv2.service.AdminService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName AdminServiceImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/7 上午1:15
 * @Version 1.0
 **/
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    /**
     * 根据登录名，查询用户
     * @param loginname
     * @return
     */
    @Override
    public Admin selectByLoginname(String loginname) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andLoginnameEqualTo(loginname);

        List<Admin> admins = adminMapper.selectByExample(adminExample);
        if (admins==null || admins.size()==0) {
            return null;
        }
        return admins.get(0);
    }
}
