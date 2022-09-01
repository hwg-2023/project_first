package photo_online.service.serviceImpl;

import org.springframework.stereotype.Service;
import photo_online.common.R;
import photo_online.mapper.UpdateMapper;
import photo_online.pojo.dto.UpdateDto;
import photo_online.service.UpdateService;

import javax.annotation.Resource;

@Service
public class UpdateServiceImpl implements UpdateService {
    @Resource
    UpdateMapper updateMapper;

    @Override
    public R<String> ban(UpdateDto updateDto) {

        Integer result = updateMapper.ban(updateDto);
        if (result == 1){
            return R.success("状态更改成功");
        }
        return R.error("状态更改失败");
    }
}
