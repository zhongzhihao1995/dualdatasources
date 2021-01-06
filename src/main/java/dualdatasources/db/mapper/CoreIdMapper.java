package dualdatasources.db.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import dualdatasources.constant.DBConstants;
import dualdatasources.db.entity.CoreIdDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@DS(DBConstants.DATASOURCE_CORE)
public interface CoreIdMapper {

    List<CoreIdDO> selectById(@Param("id") Integer id);

}
