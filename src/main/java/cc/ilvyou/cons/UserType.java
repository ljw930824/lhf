package cc.ilvyou.cons;

import lombok.Data;

/**
 * Created by jiaweiluo on 16/7/30.
 */
public enum UserType {


    ADMIN(1, "管理员"),

    USER(2, "用户");

    /**
     * @Fields : 类型
     */
    private int type;
    /**
     * @Fields : 描述
     */
    private String descr;

    UserType(int type, String descr) {
        this.type = type;
        this.descr = descr;
    }

    public String getDescr() {
        return descr;
    }

    public int getType() {
        return type;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public void setType(int type) {
        this.type = type;
    }
}
