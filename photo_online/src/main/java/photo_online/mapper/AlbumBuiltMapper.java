package photo_online.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import photo_online.pojo.model.Album;

@Mapper
public interface AlbumBuiltMapper extends BaseMapper<Album> {
}
