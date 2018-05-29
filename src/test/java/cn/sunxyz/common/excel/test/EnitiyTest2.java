package cn.sunxyz.common.excel.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.sunxyz.common.excel.cat.Category;
import cn.sunxyz.common.excel.util.ExcelUtil3;
import com.sun.deploy.net.HttpResponse;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

import cn.sunxyz.common.excel.config.ElementTypePath;
import cn.sunxyz.common.excel.core.ExcelUtils;
import cn.sunxyz.common.excel.core.IExcelUtil;
import cn.sunxyz.common.excel.entity.Clazz;
import cn.sunxyz.common.excel.entity.School;
import cn.sunxyz.common.excel.entity.Student;

public class EnitiyTest2 {
	
	private Logger logger = LoggerFactory.getLogger(EnitiyTest2.class); 
	
	@Test
	public void exportExcel(){
		

		Set<Student> students = new HashSet<>();
		Student student = new Student();
		student.setId("121");
		student.setAge(8);
		student.setName("小明");
		students.add(student);
		
		Map<String,String> sMap = new HashMap<>();
		sMap.put("性别", "男");
		sMap.put("地址", "济南");
		Student student2 = new Student();
		student2.setId("122");
		student2.setAge(9);
		student2.setName("小李");
		student2.setMap(sMap);
		students.add(student2);
		
		
		Set<Clazz> clazzs = new HashSet<>();
		
		Clazz clazz = new Clazz();
		clazz.setId("11");
		clazz.setName("一年级");
		clazz.setStudents(students);
		clazzs.add(clazz);
		
		Clazz clazz2 = new Clazz();
		clazz2.setId("12");
		clazz2.setName("二年级");
		clazz2.setStudents(students);
		clazzs.add(clazz2);
		
		Clazz clazz3 = new Clazz();
		clazz3.setId("13");
		clazz3.setName("三年级");
		clazz3.setStudents(students);
		clazzs.add(clazz3);
		
		Clazz clazz4 = new Clazz();
		clazz4.setId("14");
		clazz4.setName("四年级");
		clazz4.setStudents(students);
		clazzs.add(clazz4);
		
		List<School> list = new ArrayList<>();
		
		School school = new School();
		school.setId("1");
		school.setName("中山");
		school.setClazzs(clazzs);
		list.add(school);
		
		Map<String,String> map = new HashMap<>();
		map.put("1", "红星小学");
		map.put("2", "TOP");
		School school1 = new School();
		school1.setId("2");
		school1.setName("红星");
		school1.setClazzs(clazzs);
		school1.setMap(map);
		list.add(school1);

//		IExcelUtil
        FileOutputStream output = null;
        try {
        	output = new FileOutputStream("e:\\success3.xls");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
		IExcelUtil<School> eu = new ExcelUtils<>();
		eu.build(School.class).exportExcel(list, "学校信息", output);

//ExcelUtil3
//下面是如何调用上面的工具类
//
//        String[] fieldName = new String[]{"主体名称", "主体标识码","状态","失败原因"};
//        String[] columnIt = new String[]{"principalName", "code","statues","failReason"};
//        try {
//        response.setContentType("text/html; charset=utf-8");
//        response.setContentType("application/octet-stream");
//        response.addHeader("Content-Disposition", "attachment;filename=" + new String("导出数据.xls".getBytes("GB2312"), "ISO-8859-1"));
//        ExcelUtil3.exportExcel(list, fieldName, columnIt, "数据", list.size(), response.getOutputStream());
//        } catch (Exception e) {
//        e.printStackTrace();
//        }
//
//        注：这里的result格式为List<Map<String, Object>>



	}
	
	
	@Test
	public void importExcel(){
		FileInputStream fis = null;  
        try {
            fis = new FileInputStream("D:\\success1.xls");
            IExcelUtil<School> util = new ExcelUtils<>();//创建excel工具类  
            List<School> list = util.build(School.class).importExcel("学校信息", fis);// 导入  
            logger.info(JSON.toJSONString(list));  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();
        }
	}

	@Test
	public void importCategory(){
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\cate.xls");
			IExcelUtil<Category> util = new ExcelUtils<>();//创建excel工具类
			List<Category> list = util.build(Category.class).importExcel("Sheet1", fis);// 导入
			logger.info(JSON.toJSONString(list));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


	@Test
	public void test(){

		Set<Student> students = new HashSet<>();
		Student student = new Student();;
		student.setId("121");
		student.setAge(8);
		student.setName("小明");
		students.add(student);

		Map<String,String> sMap = new HashMap<>();
		sMap.put("性别", "男");
		sMap.put("地址", "济南");
		Student student2 = new Student();;
		student2.setId("122");
		student2.setAge(9);
		student2.setName("小李");
		student2.setMap(sMap);
		students.add(student2);


		Set<Clazz> clazzs = new HashSet<>();

		Clazz clazz = new Clazz();
		clazz.setId("11");
		clazz.setName("一年级");
		clazz.setStudents(students);
		clazzs.add(clazz);

		Clazz clazz2 = new Clazz();
		clazz2.setId("12");
		clazz2.setName("二年级");
		clazz2.setStudents(students);
		clazzs.add(clazz2);

		Clazz clazz3 = new Clazz();
		clazz3.setId("13");
		clazz3.setName("三年级");
		clazzs.add(clazz3);

		Clazz clazz4 = new Clazz();
		clazz4.setId("14");
		clazz4.setName("四年级");
		clazz4.setStudents(students);
		clazzs.add(clazz4);

		List<School> list = new ArrayList<>();

		School school = new School();
		school.setId("1");
		school.setName("中山");
		school.setClazzs(clazzs);
		list.add(school);

		Map<String,String> map = new HashMap<>();
		map.put("1", "红星小学");
		map.put("2", "TOP");
		School school1 = new School();
		school1.setId("2");
		school1.setName("红星");
		school1.setClazzs(clazzs);
		school1.setMap(map);
		list.add(school1);

		FileOutputStream output = null;
		try {
			output = new FileOutputStream("D:\\success1.xls");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		IExcelUtil<School> eu = new ExcelUtils<>();
		eu.build(School.class).exportExcel(list, "学校信息", output);
	}

}
