package cc.ilvyou.kits;

/**
 * Created by jiaweiluo on 16/7/30.
 */
public class StrKit {
    /**
     * @Title : contains
     * @Description : 是否包含
     */
    public static boolean contains(String str, String s) {
        return !isBlank(str) && str.contains(s);
    }

    /**
     * @Title : isBlank
     * @Description : 是否为空
     */
    public static boolean isBlank(String str) {
        return null == str || "".equals(str.trim());
    }

    /**
     * @Title : isBlank
     * @Description : 是否为空
     */
    public static boolean isBlank(String str, String... strs) {
        if (isBlank(str)) {
            return true;
        }
        boolean isBlank = false;
        for (String s : strs) {
            isBlank = isBlank(s);
            if (isBlank) {
                return isBlank;
            }
        }
        return isBlank;
    }

    public static String replace(String str, String oldStr, String newStr) {
        return isBlank(str) ? "" : str.replace(oldStr, newStr);
    }
}
