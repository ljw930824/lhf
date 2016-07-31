package cc.ilvyou.entity.business;

import cc.ilvyou.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by jiaweiluo on 16/7/30.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User extends BaseEntity{

    private String name;

    private String fullname;

    private String email;
}
