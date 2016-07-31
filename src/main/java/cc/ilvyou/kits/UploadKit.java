package cc.ilvyou.kits;


import cc.ilvyou.base.BaseApi;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Author: @author ljw . <br>
 * Date: 2015-9-19 下午12:13:41 . <br>
 * Function: 上传工具
 */
public class UploadKit {
	private static String fileUpload(HttpServletRequest request, String userid,
			MultipartFile multipartFile) {
		String rtnPath = "";
		String path = request.getSession().getServletContext()
				.getRealPath("/" + BaseApi.UPLOAD_PATH);
		String userDir = path + "/" + BaseApi.USER_UPLOAD_PATH_PREFIX + userid;
		// 创建用户目录
		File userDirFile = new File(userDir);
		if (!userDirFile.exists()) {
			userDirFile.mkdir();
		}
		// 重命名后的文件名
		String newName = multipartFile.getOriginalFilename();
		// 上传的图片
		File file = new File(userDir, newName);
		try {
			multipartFile.transferTo(file);
			rtnPath = BaseApi.UPLOAD_PATH + "/"
					+ BaseApi.USER_UPLOAD_PATH_PREFIX + userid + "/" + newName;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtnPath;
	}

	private static String fileUpload(HttpServletRequest request, String userid,
			MultipartFile multipartFile, boolean isHead) {
		String rtnPath = "";
		String path = request.getSession().getServletContext()
				.getRealPath("/" + BaseApi.UPLOAD_PATH);
		String userDir = path + "/" + BaseApi.USER_UPLOAD_PATH_PREFIX + userid;
		// 创建用户目录
		File userDirFile = new File(userDir);
		if (!userDirFile.exists()) {
			userDirFile.mkdir();
		}
		// 重命名后的文件名
		String newName = getName(multipartFile.getOriginalFilename(), isHead);
		// 上传的图片
		File file = new File(userDir, newName);
		try {
			multipartFile.transferTo(file);
			rtnPath = BaseApi.UPLOAD_PATH + "/"
					+ BaseApi.USER_UPLOAD_PATH_PREFIX + userid + "/" + newName;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rtnPath;
	}

	/**
	 * @Title : getName
	 * @Description : 重命名上传的文件
	 */
	private static String getName(String originalFilename, boolean isHead) {
		// 提取出后缀名
		String[] names = originalFilename.split("\\.");
		return (isHead ? "head" : System.currentTimeMillis()) + "."
				+ names[names.length - 1];
	}

	/**
	 * @Title : upload
	 * @Description : 成功返回上传文件路径，失败返回空字符串
	 */
	public static String upload(HttpServletRequest request, String userid,
			MultipartFile multipartFile) {
		return fileUpload(request, userid, multipartFile);
	}

	/**
	 * @Title : uploadHead
	 * @Description :
	 */
	public static String uploadHead(HttpServletRequest request, String userid,
			MultipartFile multipartFile) {
		return fileUpload(request, userid, multipartFile, true);
	}
}
