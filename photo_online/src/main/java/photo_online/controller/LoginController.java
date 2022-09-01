package photo_online.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import photo_online.common.R;
import photo_online.pojo.dto.LoginDto;
import photo_online.pojo.model.User;
import photo_online.service.LoginService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
@RequestMapping("/enter")
public class LoginController {
    @Resource
    LoginService loginService;

    @RequestMapping("login")
    public R<User> login(@RequestBody LoginDto loginDto){
        return loginService.login(loginDto);
    }

    @RequestMapping("layout")
    public R<String> layout(HttpServletRequest request){
        request.getSession().removeAttribute("loginD");
        return R.success("退出成功");
    }


}
