package rainclassv2.service;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import rainclassv2.pojo.Admin;

public interface AdminService {
    /**
     * 根据登录名，查询用户
     * @param loginname
     * @return
     */
    Admin selectByLoginname(String loginname);
}
