package photo_online.mapper;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface RegisterMapper {
    Object register(String userAccount);
    boolean addUser(String userAccount, String userPassword);
}
