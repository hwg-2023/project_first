package photo_online.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import photo_online.common.R;
import photo_online.pojo.dto.UpdateDto;
import photo_online.service.UpdateService;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("update")
public class UpdateController {
    @Resource
    UpdateService updateService;

    @RequestMapping("ban")
    public R<String> ban(@RequestBody UpdateDto updateDto){
        if (updateDto.getIsDelete() == 1){
            updateDto.setIsDelete(0);
        }else {
            updateDto.setIsDelete(1);
        }
        return updateService.ban(updateDto);
    }
}
