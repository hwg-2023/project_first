package photo_online.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import photo_online.mapper.AlbumStoreMapper;
import photo_online.pojo.model.AlbumStore;
import photo_online.service.AlbumStoreService;

import javax.annotation.Resource;

/**
* @author 无边萧木望东流
* @description 针对表【t_album】的数据库操作Service实现
* @createDate 2022-08-30 10:15:52
*/
@Service
public class AlbumStoreServiceImpl extends ServiceImpl<AlbumStoreMapper, AlbumStore>
    implements AlbumStoreService {
    @Resource
    AlbumStoreMapper albumStoreMapper;

    @Override
    public Object store(AlbumStore albumStore) {
        return albumStoreMapper.insert(albumStore);
    }
}




