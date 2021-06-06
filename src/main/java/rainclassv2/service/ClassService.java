package rainclassv2.service;

import rainclassv2.req.ClassQueryReq;
import rainclassv2.resp.ClassQueryResp;
import rainclassv2.resp.PageResp;

import java.util.List;

/**
 * @ClassName ClassService
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/6 下午7:20
 * @Version 1.0
 **/
public interface ClassService {

    /**
     * 展示课程信息
     * @return
     */
    PageResp<ClassQueryResp> list(ClassQueryReq req);


}
