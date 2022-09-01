package photo_online.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import photo_online.common.R;
import photo_online.mapper.LoginMapper;
import photo_online.pojo.dto.LoginDto;
import photo_online.pojo.model.User;
import photo_online.service.LoginService;
import javax.annotation.Resource;
import java.util.List;


@Service
public class LoginServiceImpl extends ServiceImpl<LoginMapper,User> implements LoginService {
    @Resource
    LoginMapper loginMapper;

    @Override
    public R<User> login(LoginDto loginDto) {
        String userAccount = loginDto.getUserAccount();
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(User::getUserAccount,userAccount);
        User user = loginMapper.selectOne(lambdaQueryWrapper);
        if (null == user){
            return R.error("用户名不存在");
        }
        if (!user.getUserPassword().equals(loginDto.getUserPassword())){
            return R.error("密码错误");
        }
        if (user.getIsDelete() == 0){
            return R.error("账号已被禁用");
        }

        return R.success(user);

    }
}
