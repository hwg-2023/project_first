package photo_online.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import photo_online.common.R;
import photo_online.pojo.vo.FormVo;
import photo_online.service.AlbumStoreService;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("upload")
public class UploadImg {
    @Resource
    AlbumStoreService albumStoreService;

    @RequestMapping("image")
    public R<String> image(@RequestParam(value = "file")MultipartFile multipartFile, @RequestParam(value = "albumId") String albumId ,@RequestParam(value = "albumName") String albumName ){
        FormVo formVo = new FormVo();
        formVo.setMultipartFile(multipartFile);
        formVo.setAlbumId(albumId);
        formVo.setAlbumName(albumName);
        return albumStoreService.image(formVo);
    }
}
