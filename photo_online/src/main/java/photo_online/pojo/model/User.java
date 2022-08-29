package photo_online.pojo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName t_user
 */
@TableName(value ="t_user")
@Data
public class User implements Serializable {
    /**
     * 主键id，唯一标识
     */
    @TableId
    private Integer id;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 用户账号，登录标识
     */
    private String userAccount;

    /**
     * 用户密码，登录标识
     */
    private String userPassword;

    /**
     * 用户性别
     */
    private Integer gender;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户电话号码，用来找回密码，所以必须要有
     */
    private String phone;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}