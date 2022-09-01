package photo_online.pojo.vo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class FormVo {
    //文件
    private MultipartFile multipartFile;
    //相片名
    private String albumName;
    //相片分区Id
    private String albumId;
}
