package photo_online.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import photo_online.pojo.model.User;


@Mapper
public interface LoginMapper extends BaseMapper<User> {
}
