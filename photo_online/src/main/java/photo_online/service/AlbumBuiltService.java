package photo_online.service;

import com.baomidou.mybatisplus.extension.service.IService;
import photo_online.pojo.model.AlbumClz;

public interface AlbumBuiltService extends IService<AlbumClz> {
    Object built(AlbumClz albumClz);
}
