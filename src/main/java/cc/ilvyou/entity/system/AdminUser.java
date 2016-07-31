package cc.ilvyou.entity.system;

import cc.ilvyou.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by jiaweiluo on 16/7/30.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AdminUser extends BaseEntity {

    private String username;

    private String pwd;

}
