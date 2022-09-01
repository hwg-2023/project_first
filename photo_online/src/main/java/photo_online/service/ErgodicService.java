package photo_online.service;

import photo_online.pojo.dto.SearchPageDto;
import photo_online.pojo.model.AlbumClz;
import photo_online.pojo.model.User;

import java.util.List;

public interface ErgodicService {
    List<AlbumClz> ergodic();

    Object pageSearch(SearchPageDto searchPageDto);

    List<User> userList();
}
