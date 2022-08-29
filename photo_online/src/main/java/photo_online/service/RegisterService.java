package photo_online.service;

import photo_online.common.R;
import photo_online.pojo.dto.RegisterDto;
import photo_online.pojo.model.User;

public interface RegisterService {
    Object Register(RegisterDto registerDto);
}
