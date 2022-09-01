package photo_online.pojo.dto;

import lombok.Data;

@Data
public class SearchPageDto {
    //分区标识
    private String albumZone;
    //分页下标
    private Integer index;
}
