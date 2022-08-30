package photo_online.service.serviceImpl;

import org.springframework.stereotype.Service;
import photo_online.common.R;
import photo_online.mapper.LoginMapper;
import photo_online.pojo.Vo.LoginVo;
import photo_online.pojo.dto.LoginDto;
import photo_online.pojo.model.User;
import photo_online.service.LoginService;
import javax.annotation.Resource;



@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    LoginMapper loginMapper;

    @Override
    public Object login(LoginDto loginDto) {
        String userAccount = loginDto.getUserAccount();
        User user = (User)loginMapper.login(userAccount);
        if (null == user){
            return R.error("用户名不存在");
        }
        if (loginDto.getUserPassword().equals(user.getUserPassword())){
            LoginVo loginVo = new LoginVo();
            loginVo.setId(user.getId());
            loginVo.setUserName(user.getUserName());
            loginVo.setGender(user.getGender());
            loginVo.setEmail(user.getEmail());
            return R.success(loginVo);
        }
        return R.error("密码错误");

    }
}
