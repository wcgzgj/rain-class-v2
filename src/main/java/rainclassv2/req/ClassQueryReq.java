package rainclassv2.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName ClassQueryReq
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/6 下午7:23
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClassQueryReq extends PageReq {

    private Long id;

    private String classname;

    private String starttime;

    private String code;

    private String type;
}
