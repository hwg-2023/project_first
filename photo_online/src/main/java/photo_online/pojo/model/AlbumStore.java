package photo_online.pojo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName t_album
 */
@TableName(value ="t_album")
@Data
public class AlbumStore implements Serializable {
    /**
     * 主键，唯一标识
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 上传图片url
     */
    private String albumUrl;

    /**
     * 上传图片分区
     */
    private Integer albumZone;

    /**
     * 上传图片命名
     */
    private String albumName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}