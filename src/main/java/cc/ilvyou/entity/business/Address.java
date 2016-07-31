package cc.ilvyou.entity.business;

import cc.ilvyou.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by jiaweiluo on 16/7/30.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Address extends BaseEntity{

    private Long userid;

    private Integer proviceid;

    private String provice;

    private Integer cityid;

    private String city;

}
