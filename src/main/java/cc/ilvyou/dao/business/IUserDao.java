package cc.ilvyou.dao.business;

import cc.ilvyou.base.BaseDao;
import cc.ilvyou.entity.business.User;

import java.io.Serializable;

/**
 * Created by jiaweiluo on 16/7/31.
 */
public interface IUserDao extends BaseDao<User>{

    String searchUserName(Serializable id);

}
