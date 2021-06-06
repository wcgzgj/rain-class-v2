package rainclassv2.service;

import rainclassv2.req.LoginReq;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/7 上午1:50
 * @Version 1.0
 **/
public interface UserService {
    /**
     * 登录
     * @param req
     * @return
     */
    boolean login(LoginReq req);
}
