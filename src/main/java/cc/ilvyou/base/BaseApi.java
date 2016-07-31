package cc.ilvyou.base;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BaseApi {
	/**
	 * @Fields : 上传根目录
	 */
	public static String UPLOAD_PATH = "uploads";
	/**
	 * @Fields : 用户目录前缀
	 */
	public static String USER_UPLOAD_PATH_PREFIX = "u";

	/**
	 * @Fields : 列表每页显示条数
	 */
	protected int LIMIT = 10;
	@Autowired
	protected HttpServletRequest request;

	/**
	 * @Title : getPageQuery
	 * @Description : 获取分页参数
	 */
	protected <T> PageQuery<T> getPageQuery(int start) {
		PageQuery<T> pageQuery = new PageQuery<T>();
		pageQuery.setStart(start);
		pageQuery.setLimit(LIMIT);
		pageQuery.getCondition().put("start",
				(start - 1) * pageQuery.getLimit());
		pageQuery.getCondition().put("limit", pageQuery.getLimit());
		return pageQuery;
	}
}
