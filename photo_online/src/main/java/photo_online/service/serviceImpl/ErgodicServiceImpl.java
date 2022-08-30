package photo_online.service.serviceImpl;

import org.springframework.stereotype.Service;
import photo_online.mapper.ErgodicMapper;
import photo_online.pojo.model.AlbumClz;
import photo_online.service.ErgodicService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ErgodicServiceImpl implements ErgodicService {
    @Resource
    ErgodicMapper ergodicMapper;

    @Override
    public List<AlbumClz> ergodic() {
        return ergodicMapper.ergodic();

    }
}
