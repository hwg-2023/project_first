package photo_online.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import photo_online.service.AlbumSearchService;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("album")
public class AlbumSearchController {
    @Resource
    AlbumSearchService albumSearchService;

    @RequestMapping("search")
    public Object search(String content){
        return albumSearchService.search(content);
    }
}
