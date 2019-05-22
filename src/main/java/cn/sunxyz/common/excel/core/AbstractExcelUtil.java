package cn.sunxyz.common.excel.core;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

/**
 * 
* 定义需要重写的细节
* @author 神盾局
* @date 2016年8月9日 下午3:26:55
* 
* @param <T>
 */
public abstract class AbstractExcelUtil<T> implements IExcelUtil<T>{
	
	public abstract void createHeader(HSSFWorkbook wb, HSSFSheet sheet);
	
	public abstract void createRow(HSSFWorkbook wb,Object t,HSSFSheet sheet);
	
	public abstract int mergedRegio(Object t,HSSFSheet sheet,int rowStart);
	
	/**
	 * 
	* 负责调度 将excel 数据转化为list
	* @param sheet
	* @return  List<?> 返回类型  
	* @throws
	 */
	public abstract List<T> dispatch(XSSFSheet sheet);

}
