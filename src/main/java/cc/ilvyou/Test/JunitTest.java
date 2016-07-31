package cc.ilvyou.Test;

import cc.ilvyou.dao.business.IUserDao;
import cc.ilvyou.entity.business.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by jiaweiluo on 16/8/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JunitTest {

    @Autowired
    public IUserDao userDao;

    @Test
    public void testSaveUser(){
        User user = new User();
        user.setId(3);
        user.setName("ljw");
        user.setFullname("wjn");
        user.setEmail("8973249@qq.com");
        userDao.save(user);
    }

    @Test
    public void testSearchUserName(){

        System.out.println(userDao.searchUserName(2));

    }

    @Test
    public void testDeteleUser(){
        userDao.delete(2);
    }

    @Test
    public void testFindAll(){
        List<User> list = userDao.findAll();
        User user = list.get(0);
        System.out.println(user.getEmail());
    }

}
