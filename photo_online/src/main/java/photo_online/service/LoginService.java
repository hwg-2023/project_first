package photo_online.service;

import com.baomidou.mybatisplus.extension.service.IService;
import photo_online.common.R;
import photo_online.pojo.dto.LoginDto;
import photo_online.pojo.model.User;


public interface LoginService extends IService<User> {
    R<User> login( LoginDto loginDto);
}
