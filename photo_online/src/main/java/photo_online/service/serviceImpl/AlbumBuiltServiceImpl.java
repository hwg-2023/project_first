package photo_online.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import photo_online.mapper.AlbumBuiltMapper;
import photo_online.pojo.model.AlbumClz;
import photo_online.service.AlbumBuiltService;

import javax.annotation.Resource;

@Service
public class AlbumBuiltServiceImpl extends ServiceImpl<AlbumBuiltMapper, AlbumClz> implements AlbumBuiltService {
    @Resource
    AlbumBuiltMapper albumBuiltMapper;

    @Override
    public Object built(AlbumClz albumClz) {
        return albumBuiltMapper.insert(albumClz);
    }
}
