package photo_online.pojo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName t_album_clz
 */
@TableName(value ="t_album_clz")
@Data
public class Album implements Serializable {
    /**
     * 分区
     */
    @TableId(type = IdType.AUTO)
    private Integer albumId;

    /**
     * 分区命名
     */
    private String albumZoneName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}