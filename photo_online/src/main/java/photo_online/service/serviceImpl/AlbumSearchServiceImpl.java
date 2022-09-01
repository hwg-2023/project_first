package photo_online.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


import photo_online.mapper.AlbumSearchMapper;
import photo_online.pojo.model.AlbumStore;
import photo_online.service.AlbumSearchService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AlbumSearchServiceImpl extends ServiceImpl<AlbumSearchMapper, AlbumStore>
        implements AlbumSearchService {
    @Resource
    AlbumSearchMapper albumSearchMapper;

    @Override
    public List<AlbumStore> search(String content) {
        LambdaQueryWrapper<AlbumStore> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(AlbumStore::getAlbumName , content);
        //进行模糊搜索
        return albumSearchMapper.selectList(lambdaQueryWrapper);
    }
}
