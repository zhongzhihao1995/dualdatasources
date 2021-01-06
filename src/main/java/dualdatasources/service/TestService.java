package dualdatasources.service;

import dualdatasources.db.entity.BusinessIdDO;
import dualdatasources.db.entity.CoreIdDO;
import dualdatasources.db.mapper.BusinessIdMapper;
import dualdatasources.db.mapper.CoreIdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tony
 * @date 2021/1/6 15:02
 */
@Service
public class TestService {
    @Autowired
    private CoreIdMapper coreIdMapper;
    @Autowired
    private BusinessIdMapper businessIdMapper;

    public void method1() {
        // 查询业务和核心数据
        BusinessIdDO businessId = businessIdMapper.selectById(1);
        System.out.println(businessId);
        List<CoreIdDO> coreId = coreIdMapper.selectById(1);
        System.out.println(coreId);

    }
}
