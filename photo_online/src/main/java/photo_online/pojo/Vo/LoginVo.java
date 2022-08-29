package photo_online.pojo.Vo;

import lombok.Data;


@Data
public class LoginVo {
    //登录返回
    private Integer id;
    private String userName;
    private Integer gender;
    private String email;
}
