package cc.ilvyou.kits;

import java.security.MessageDigest;

/**
 * Author: @author HYS . <br>
 * Date: 2015-9-12 上午11:34:13 . <br>
 * Function: md5加密工具
 */
public class MD5Kit {
	/**
	 * @Title : encrypt
	 * @Description : md5加密
	 */
	public static String encrypt(String inStr) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++) {
			byteArray[i] = (byte) charArray[i];
		}
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = md5Bytes[i] & 0xff;
			if (val < 16) {
				hexValue.append("0");
			}
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();
	}
}