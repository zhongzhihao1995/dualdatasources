package dualdatasources.db.entity;

import lombok.Data;

/**
 * 用户 DO
 */
@Data
public class BusinessIdDO {

    /**
     * 用户编号
     */
    private Integer id;
    /**
     * 账号
     */
    private String fullName;

    private String idNum;


}
