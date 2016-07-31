package cc.ilvyou.service.business;

import cc.ilvyou.dao.business.IUserDao;
import cc.ilvyou.entity.business.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by jiaweiluo on 16/7/31.
 */
@Service
public class UserServiceImp implements IUserService{

    @Autowired
    public IUserDao userDao;

    @Override
    public Serializable saveUser(User user){

        return userDao.save(user);

    }

}
