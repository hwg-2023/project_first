package photo_online.mapper;

import org.apache.ibatis.annotations.Mapper;
import photo_online.pojo.model.AlbumClz;

import java.util.List;

@Mapper
public interface ErgodicMapper {
    List<AlbumClz> ergodic();
}
