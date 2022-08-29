package photo_online.service.serviceImpl;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import photo_online.common.R;
import photo_online.mapper.RegisterMapper;
import photo_online.pojo.dto.RegisterDto;
import photo_online.pojo.model.User;
import photo_online.service.RegisterService;

import javax.annotation.Resource;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    RegisterMapper registerMapper;

    @Override
    public Object Register(RegisterDto registerDto) {

        String userAccount = registerDto.getUserAccount();
        String userPassword = registerDto.getUserPassword();

        //验证不为空
        if (userAccount == null || userPassword == null){
            return R.error("0");
        }

        //验证账户不能重复
        User userExist = (User) registerMapper.register(userAccount);
        if (userExist != null){
            return R.error("该用户已存在，请勿重复注册");
        }

        //加密
        String SALT = "xxx";
        String userSolvedPwd = DigestUtils.md5DigestAsHex((SALT + userPassword).getBytes());

        //添加用户信息至数据库表中
        boolean save =  registerMapper.addUser(userAccount, userSolvedPwd);
        if (!save){
            return R.error("注册失败，请重试！");
        }
        return R.success(1);
    }
}
