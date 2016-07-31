package cc.ilvyou.base;

import java.io.Serializable;
import java.util.List;

/**
 * Created by jiaweiluo on 16/7/31.
 */
public interface BaseDao<T>  {

    /**
     * 保存对象.
     * @param entity 要保存的对象
     * @return 生成ID
     * @author ljw 2016-7-30
     */
    Serializable save(T entity);

    /**
     * 更新对象.
     * @param entity 要更新的对象
     * @author ljw 2016-7-30
     */
    void update(T entity);

    /**
     * 删除对象.
     * @param id 要删除的对象.
     * @author ljw 2016-7-30
     */
    void delete(Integer id);

    /**
     * 根据实体类类型和ID获取对象.
     * @param <T> 目标对象类型
     * @param id 目标对象ID
     * @return 要获取的对象
     * @author ljw 2016-7-30
     */
     T search(Serializable id);

    /**
     * 根据实体类类型和ID获取对象.
     * @param <T> 目标对象类型
     * @return 要获取的对象
     * @author ljw 2016-7-30
     */
    <T>List<T> findAll();



}
