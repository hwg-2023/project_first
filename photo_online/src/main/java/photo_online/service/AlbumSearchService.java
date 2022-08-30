package photo_online.service;

import com.baomidou.mybatisplus.extension.service.IService;
import photo_online.pojo.model.AlbumStore;

public interface AlbumSearchService extends IService<AlbumStore> {
    Object search(String content);
}
