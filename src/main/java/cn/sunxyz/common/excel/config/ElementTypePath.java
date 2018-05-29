package cn.sunxyz.common.excel.config;

import org.modelmapper.ModelMapper;

import java.util.HashMap;

/**
 * 
* 包类元素
* @author 神盾局
* @date 2016年8月4日 上午10:31:33
*
 */
public enum ElementTypePath {

	SET("java.util.Set"),MAP("java.util.Map"),LIST("java.util.List"),OBJECT("");

	private String path;
	
	private ElementTypePath(String path){
		this.path = path;
	}
	
	/**
	 * 
	* 获取元素
	* @param path
	* @return  ElementTypePath 返回类型
	* @throws
	 */
	public static ElementTypePath getElementTypePath(String path){
//		ModelMapper modelMapper = new ModelMapper();
//		D d = (D) modelMapper.map(path.getClass(), c.getClass());
//		copyObject(path.getClass(),destinationType);
		for(ElementTypePath elementTypePath:ElementTypePath.values()){
			if(elementTypePath.path.equals(path)){
				return elementTypePath;
			}
		}
		return OBJECT;
	}

//	public static <D> D copyObject(Object source, Class<D> destinationType) {
//		if (null == source) {
//			return null;
//		}
//		ModelMapper model = new ModelMapper();
//		return model.map(source, destinationType);
//	}

	@SuppressWarnings("static-access")
	@Override
	public String toString() {
		return this.valueOf(path).getPath();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	

}
