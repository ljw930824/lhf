package cc.ilvyou.base;

import com.google.common.collect.Maps;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Author: @author ljw . <br>
 * Date: 2015-9-13 上午10:28:44 . <br>
 * Function: 分页
 */
@Data
public class PageQuery<T> {
	/**
	 * @Fields : 总记录数
	 */
	private int total;
	/**
	 * @Fields : 起始页
	 */
	private int start;
	/**
	 * @Fields : 总页数
	 */
	private int size;
	/**
	 * @Fields : 每页显示数量
	 */
	private int limit = 8;
	/**
	 * @Fields : 返回结果
	 */
	private List<T> list;
	/**
	 * @Fields : 查询条件
	 */
	private Map<String, Object> condition = Maps.newHashMap();
}
