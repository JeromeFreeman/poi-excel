package cn.sunxyz.common.excel.menu;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelElement;
import cn.sunxyz.common.excel.annotation.ExcelID;

import java.util.Date;
import java.util.Set;

@SuppressWarnings("serial")
public class Menu {
	/**资源名称*/
	@ExcelID
	@ExcelAttribute(name="name1",column="A")
	private String name;
	/**菜单类型*/
	@ExcelAttribute(name="type1",column="B")
	private String type;
	/**路径编码*/
	@ExcelAttribute(name="path1",column="C")
	private String path;
	/**资源权限*/
	@ExcelAttribute(name="permission1",column="D")
	private String permission;
	/**前端资源路径*/
	@ExcelAttribute(name="component1",column="E")
	private String component;

	@ExcelElement
	private Set<Menu2> menu2;

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

	public Set<Menu2> getMenu2() {
		return menu2;
	}

	public void setMenu2(Set<Menu2> menu2) {
		this.menu2 = menu2;
	}
}
