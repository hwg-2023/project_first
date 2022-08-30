package photo_online.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import photo_online.pojo.model.Album;
import photo_online.service.AlbumBuiltService;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("album")
public class AlbumBuiltController {
    @Resource
    AlbumBuiltService albumBuiltService;

    @RequestMapping("built")
    public Object built(@RequestBody Album album){
        return albumBuiltService.built(album);
    }
}
