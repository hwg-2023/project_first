package photo_online.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import photo_online.mapper.RegisterMapper;
import photo_online.pojo.model.User;
import photo_online.service.RegisterService;

import javax.annotation.Resource;

@Service
public class RegisterServiceImpl extends ServiceImpl<RegisterMapper, User> implements RegisterService {
    @Resource
    RegisterMapper registerMapper;

    @Override
    public Object register(User user) {
        return registerMapper.insert(user);
    }
}
