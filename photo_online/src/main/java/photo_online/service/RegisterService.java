package photo_online.service;

import com.baomidou.mybatisplus.extension.service.IService;
import photo_online.common.R;
import photo_online.pojo.model.User;

public interface RegisterService extends IService<User> {
    R<String> register(User user);
}
