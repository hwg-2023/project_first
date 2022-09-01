package photo_online.service;

import photo_online.common.R;
import photo_online.pojo.dto.UpdateDto;

public interface UpdateService {
    R<String> ban(UpdateDto updateDto);
}
