package photo_online.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import photo_online.pojo.model.AlbumClz;
import photo_online.service.ErgodicService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("search")
public class ErgodicController {
    @Resource
    ErgodicService ergodicService;

    @RequestMapping("ergodic")
    public List<AlbumClz> ergodic(){
        return ergodicService.ergodic();
    }
}
