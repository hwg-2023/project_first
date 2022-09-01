package photo_online.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;
import photo_online.common.R;
import photo_online.pojo.model.AlbumStore;
import photo_online.pojo.vo.FormVo;

/**
* @author 无边萧木望东流
* @description 针对表【t_album】的数据库操作Service
* @createDate 2022-08-30 10:15:52
*/
public interface AlbumStoreService extends IService<AlbumStore> {
    Object store(AlbumStore albumStore);

    R<String> image(FormVo formVo);

}
