package cc.ilvyou.service.business;

import cc.ilvyou.entity.business.User;

import java.io.Serializable;

/**
 * Created by jiaweiluo on 16/7/31.
 */
public interface IUserService {

    Serializable saveUser(User user);

}
