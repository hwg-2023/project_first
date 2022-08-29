package photo_online.mapper;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface LoginMapper {
    Object login(String userAccount);
}
