package dualdatasources.db.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import dualdatasources.constant.DBConstants;
import dualdatasources.db.entity.BusinessIdDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@DS(DBConstants.DATASOURCE_BUSINESS)
public interface BusinessIdMapper {

    BusinessIdDO selectById(@Param("id") Integer id);

}
