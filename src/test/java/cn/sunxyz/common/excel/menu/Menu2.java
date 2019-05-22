package cn.sunxyz.common.excel.menu;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelElement;
import cn.sunxyz.common.excel.annotation.ExcelID;

import java.util.Set;

/**
 * @author Neo.fang
 * @creatTime 2019/4/13 0013
 */
public class Menu2 {

    /**资源名称*/
    @ExcelID
    @ExcelAttribute(name="name2",column="F")
    private String name;
    /**菜单类型*/
    @ExcelAttribute(name="type2",column="G")
    private String type;
    /**路径编码*/
    @ExcelAttribute(name="path2",column="H")
    private String path;
    /**资源权限*/
    @ExcelAttribute(name="permission2",column="I")
    private String permission;
    /**前端资源路径*/
    @ExcelAttribute(name="component2",column="J")
    private String component;

    @ExcelElement
    private Set<Menu3> menu3;

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

    public Set<Menu3> getMenu3() {
        return menu3;
    }

    public void setMenu3(Set<Menu3> menu3) {
        this.menu3 = menu3;
    }
}
