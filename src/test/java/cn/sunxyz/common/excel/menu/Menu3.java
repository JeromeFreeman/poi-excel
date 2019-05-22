package cn.sunxyz.common.excel.menu;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelElement;
import cn.sunxyz.common.excel.annotation.ExcelID;

import java.util.Set;

/**
 * @author Neo.fang
 * @creatTime 2019/4/13 0013
 */
public class Menu3 {

    /**资源名称*/
    @ExcelID
    @ExcelAttribute(name="name3",column="K")
    private String name;
    /**菜单类型*/
    @ExcelAttribute(name="type3",column="L")
    private String type;
    /**路径编码*/
    @ExcelAttribute(name="path3",column="M")
    private String path;
    /**资源权限*/
    @ExcelAttribute(name="permission3",column="N")
    private String permission;
    /**前端资源路径*/
    @ExcelAttribute(name="component3",column="O")
    private String component;

    @ExcelElement
    private Set<Menu4> menu4;

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

    public Set<Menu4> getMenu4() {
        return menu4;
    }

    public void setMenu4(Set<Menu4> menu4) {
        this.menu4 = menu4;
    }
}
