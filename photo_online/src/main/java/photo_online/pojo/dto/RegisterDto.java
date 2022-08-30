package photo_online.pojo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class RegisterDto implements Serializable {

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;

    private static final long serialVersionUID = 1099781884472970851L;

}
