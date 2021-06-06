package rainclassv2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import rainclassv2.mapper.ClassMapper;
import rainclassv2.req.ClassQueryReq;
import rainclassv2.req.ClassSaveReq;
import rainclassv2.resp.ClassQueryResp;
import rainclassv2.resp.CommonResp;
import rainclassv2.resp.PageResp;
import rainclassv2.service.ClassService;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @ClassName ClassController
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/6 下午7:13
 * @Version 1.0
 **/
@RestController
@RequestMapping("/class")
public class ClassController {

    private static final Logger LOG= LoggerFactory.getLogger(ClassController.class);

    @Resource
    private ClassService classService;

    /**
     * 课程新增/更新接口
     * 如果有 id ，说明是更新
     * 如果无 id ，说明是新增
     * @param req
     * @return
     */
    @PostMapping("/save")
    public CommonResp save(@RequestBody @Valid ClassSaveReq req) {


        CommonResp commonResp = new CommonResp();

        return commonResp;
    }


    @RequestMapping("/list")
    public CommonResp list(ClassQueryReq req) {
        PageResp<ClassQueryResp> pageResp = classService.list(req);
        CommonResp commonResp = new CommonResp();
        if (pageResp.getList()!=null) {
            commonResp.setContent(pageResp);
        } else {
            commonResp.setSuccess(false);
            commonResp.setMessage("【错误】课程查询错误");
        }
        return commonResp;
    }



}
