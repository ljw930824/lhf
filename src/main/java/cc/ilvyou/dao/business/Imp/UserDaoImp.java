package cc.ilvyou.dao.business.Imp;

import cc.ilvyou.dao.business.IUserDao;
import cc.ilvyou.entity.business.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by jiaweiluo on 16/7/31.
 */
@Repository("userDao")
public class UserDaoImp extends JdbcDaoSupport implements IUserDao {

    @Override
    public Serializable save(User user) {
        String sql = "insert into public.user values( ?, ?, ?, ?);";
        this.getJdbcTemplate().update(sql, user.getId(), user.getName(),
                user.getFullname(), user.getEmail());
        return user.getId();
    }

    @Override
    public void update(User user) {
        String sql = "update public.user set name = ?,fullname = ?,email = ? " +
                     "  where id = ?";
        this.getJdbcTemplate().update(sql, user.getName(), user.getFullname(),
                user.getEmail(), user.getId());
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from public.user where id = ? ";
        this.getJdbcTemplate().update(sql, id);
    }

    @Override
    public User search(Serializable id) {
        String sql = "select * from public.user " +
                     "  where id = ?";
        return this.getJdbcTemplate().queryForObject(sql,new UserRowMapper(),id );
    }

    @Override
    public List<User> findAll(){
        String sql = "select * from public.user";
        return this.getJdbcTemplate().query(sql, new UserRowMapper());
    }

    @Override
    public String searchUserName(Serializable id){
        String sql = "select name from public.user" +
                     "  where id = ?";
        return this.getJdbcTemplate().queryForObject(sql,String.class,id);
    }


    class UserRowMapper implements RowMapper<User> {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setFullname(rs.getString("fullname"));
            user.setEmail(rs.getString("email"));
            return user;
        }
    }

}
