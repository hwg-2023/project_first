package photo_online.mapper;

import org.apache.ibatis.annotations.Mapper;
import photo_online.pojo.dto.UpdateDto;

@Mapper
public interface UpdateMapper {
    Integer ban(UpdateDto updateDto);
}
