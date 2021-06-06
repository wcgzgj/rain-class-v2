package rainclassv2.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * @ClassName ClassSaveReq
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/6 下午7:15
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClassSaveReq {
    private Long id;

    @NotEmpty(message = "【名称】不能为空")
    private String classname;

    private Long teacherid;

    @NotEmpty(message = "【开始时间】不能为空")
    private String starttime;

    private String code;

    @NotEmpty(message = "【上课地点】不能为空")
    private String place;

    private String notice;

    @NotEmpty(message = "【课程类型】不能为空")
    private String type;

    @NotEmpty(message = "【学分】不能为空")
    private Integer credit;

    private String desc;

    private Date createtime;
}
