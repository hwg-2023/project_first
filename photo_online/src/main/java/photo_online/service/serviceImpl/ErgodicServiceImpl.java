package photo_online.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.yulichang.query.MPJQueryWrapper;
import org.springframework.stereotype.Service;
import photo_online.mapper.AlbumStoreMapper;
import photo_online.mapper.ErgodicMapper;
import photo_online.pojo.dto.SearchPageDto;
import photo_online.pojo.model.AlbumClz;
import photo_online.pojo.model.AlbumStore;
import photo_online.pojo.model.User;
import photo_online.service.ErgodicService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ErgodicServiceImpl implements ErgodicService {
    @Resource
    ErgodicMapper ergodicMapper;

    @Resource
    AlbumStoreMapper albumStoreMapper;

    @Override
    public List<AlbumClz> ergodic() {
        return ergodicMapper.ergodic();

    }

    @Override
    public Object pageSearch(SearchPageDto searchPageDto) {
        Integer pageSize = 6;
        String albumZone = searchPageDto.getAlbumZone();
        Integer index = searchPageDto.getIndex();
        Integer albumZone1 = Integer.valueOf(albumZone);
        //简单的构造器
        MPJQueryWrapper<AlbumStore> albumStoreMPJQueryWrapper = new MPJQueryWrapper<>();
        albumStoreMPJQueryWrapper.select("t.id,t.album_url,t.album_name ");
        albumStoreMPJQueryWrapper.leftJoin("t_album_clz t1 on t.album_zone = t1.album_id");
        albumStoreMPJQueryWrapper.eq("t.album_zone",albumZone1);
        Page<AlbumStore> page = new Page<>(index,pageSize);
        return albumStoreMapper.selectPage(page,albumStoreMPJQueryWrapper);

    }

    @Override
    public List<User> userList() {
        return ergodicMapper.userList();
    }
}
