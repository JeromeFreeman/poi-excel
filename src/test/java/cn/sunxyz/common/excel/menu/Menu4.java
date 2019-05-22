package cn.sunxyz.common.excel.menu;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelID;

/**
 * @author Neo.fang
 * @creatTime 2019/4/13 0013
 */
public class Menu4 {


    /**资源名称*/
    @ExcelID
    @ExcelAttribute(name="name4",column="P")
    private String name;
    /**菜单类型*/
    @ExcelAttribute(name="type4",column="Q")
    private String type;
    /**路径编码*/
    @ExcelAttribute(name="path4",column="R")
    private String path;
    /**资源权限*/
    @ExcelAttribute(name="permission4",column="S")
    private String permission;
    /**前端资源路径*/
    @ExcelAttribute(name="component4",column="T")
    private String component;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }
}
