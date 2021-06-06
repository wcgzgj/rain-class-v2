package rainclassv2.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName ClassQueryResp
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/6 下午7:48
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClassQueryResp {
    private Long id;

    private String classname;

    private Long teacherid;

    private String starttime;

    private String code;

    private String place;

    private String notice;

    private String type;

    private Integer credit;

    private String desc;
}
