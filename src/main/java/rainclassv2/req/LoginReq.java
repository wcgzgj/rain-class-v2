package rainclassv2.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * @ClassName LoginReq
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/7 上午1:23
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginReq {
    @NotEmpty(message = "【登录名】不能为空")
    private String loginname;
    @NotEmpty(message = "【密码】不能为空")
    private String password;
    @NotEmpty(message = "【类型】不能为空")
    private String type;
}
