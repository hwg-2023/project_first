package photo_online.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import photo_online.mapper.AlbumBuiltMapper;
import photo_online.pojo.model.Album;
import photo_online.service.AlbumBuiltService;

import javax.annotation.Resource;

@Service
public class AlbumBuiltServiceImpl extends ServiceImpl<AlbumBuiltMapper, Album> implements AlbumBuiltService {
    @Resource
    AlbumBuiltMapper albumBuiltMapper;

    @Override
    public Object built(Album album) {
        return albumBuiltMapper.insert(album);
    }
}
