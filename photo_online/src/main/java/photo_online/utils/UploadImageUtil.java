package photo_online.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/*
 *上传图片所用到的工具类
 * */
public class UploadImageUtil {

    // 定义一个目标路径，就是我们要把图片上传的位置
    private static String BASE_PATH = "E:\\image\\test_img";

    // 定义访问图片路径
    private static final String SERVER_PATH = "http://localhost:8082/";

    public static String upload(MultipartFile file) {

        String filename = file.getOriginalFilename();

        String uuid = UUID.randomUUID().toString().replace("-", "");

        String newFileName = uuid + '-' + filename;

        File image = new File(BASE_PATH, newFileName);

        try {
            file.transferTo(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(SERVER_PATH);
        return SERVER_PATH + newFileName;
    }
}