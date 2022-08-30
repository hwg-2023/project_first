package photo_online.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import photo_online.pojo.dto.RegisterDto;
import photo_online.service.RegisterService;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("enter")
public class RegisterController {
    @Resource
    RegisterService registerService;

    @RequestMapping("register")
    public Object register(@RequestBody RegisterDto registerDto){
        return registerService.register(registerDto);
    }

}
