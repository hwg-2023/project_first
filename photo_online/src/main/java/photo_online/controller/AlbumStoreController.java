package photo_online.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import photo_online.pojo.model.AlbumStore;
import photo_online.service.AlbumStoreService;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("album")
public class AlbumStoreController {
    @Resource
    AlbumStoreService albumStoreService;

    @RequestMapping("store")
    public Object store(@RequestBody AlbumStore albumStore){
        return albumStoreService.store(albumStore);
    }
}
