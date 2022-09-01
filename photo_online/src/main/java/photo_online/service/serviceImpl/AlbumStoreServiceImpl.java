package photo_online.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;
import photo_online.common.R;
import photo_online.mapper.AlbumStoreMapper;
import photo_online.pojo.model.AlbumStore;
import photo_online.pojo.vo.FormVo;
import photo_online.service.AlbumStoreService;
import photo_online.utils.UploadImageUtil;
import org.apache.commons.lang.StringUtils;

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

    @Override
    public R<String> image(FormVo formVo) {
        MultipartFile multipartFile = formVo.getMultipartFile();
        String albumUrl = UploadImageUtil.upload(multipartFile);
        if (StringUtils.isBlank(albumUrl)){
            return R.error("上传图片为空");
        }
        AlbumStore albumStore = new AlbumStore();
        albumStore.setAlbumName(formVo.getAlbumName());
        albumStore.setAlbumZone(Integer.valueOf(formVo.getAlbumId()));
        albumStore.setAlbumUrl(albumUrl);
        Integer result = albumStoreMapper.insert(albumStore);
        if (result == 1){
            return R.success("上传成功");
        }
        return R.error("上传失败");

    }
}




