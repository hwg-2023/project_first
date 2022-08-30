package photo_online.service;

import com.baomidou.mybatisplus.extension.service.IService;
import photo_online.pojo.model.Album;

public interface AlbumBuiltService extends IService<Album> {
    Object built(Album album);
}
