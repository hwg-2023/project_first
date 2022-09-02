package photo_online.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import photo_online.common.R;
import photo_online.mapper.RegisterMapper;
import photo_online.pojo.model.User;
import photo_online.service.RegisterService;

import javax.annotation.Resource;

@Service
public class RegisterServiceImpl extends ServiceImpl<RegisterMapper, User> implements RegisterService {
    @Resource
    RegisterMapper registerMapper;

    @Override
    public R<String> register(User user) {
        String userAccount = user.getUserAccount();
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(User::getUserAccount,userAccount);
        User user1 = registerMapper.selectOne(lambdaQueryWrapper);
        if (null == user1){
            Integer result = registerMapper.insert(user);
            if (result == 1){
                return R.success1("注册成功");
            }else {
                return R.error("注册失败");
            }
        }
        return R.error("用户名已存在，请登录");
    }
}
