package photo_online.service;

import com.baomidou.mybatisplus.extension.service.IService;
import photo_online.pojo.model.AlbumStore;

import java.util.List;

public interface AlbumSearchService extends IService<AlbumStore> {
    List<AlbumStore> search(String content);
}
