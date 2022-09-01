package photo_online.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import photo_online.pojo.dto.GlobalSearchDto;
import photo_online.pojo.model.AlbumStore;
import photo_online.service.AlbumSearchService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("album")
public class AlbumSearchController {
    @Resource
    AlbumSearchService albumSearchService;

    //全局图片搜索
    @RequestMapping("search")
    public List<AlbumStore> search(@RequestBody GlobalSearchDto globalSearchDto){
        String content = globalSearchDto.getContent();
        return albumSearchService.search(content);
    }
}
