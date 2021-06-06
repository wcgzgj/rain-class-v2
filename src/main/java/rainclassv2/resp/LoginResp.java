package rainclassv2.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * @ClassName LoginResp
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/7 上午1:52
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginResp {
    private Long id;
    private String token;
    private String realname;
    private String loginname;
}
