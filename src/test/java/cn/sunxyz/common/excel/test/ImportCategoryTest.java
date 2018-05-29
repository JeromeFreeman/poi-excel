package cn.sunxyz.common.excel.test;

import cn.sunxyz.common.excel.cat.CateNd;
import cn.sunxyz.common.excel.cat.CateRd;
import cn.sunxyz.common.excel.cat.Category;
import cn.sunxyz.common.excel.core.ExcelUtils;
import cn.sunxyz.common.excel.core.IExcelUtil;
import cn.sunxyz.common.util.IdGenFactory;
import cn.sunxyz.dao.MySqlJDBC;
import cn.sunxyz.model.TgMgCategoryDO;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.List;
import java.util.Set;

/**
 * Created by JT on 2018/05/29.
 */
public class ImportCategoryTest {

    private Logger logger = LoggerFactory.getLogger(ImportCategoryTest.class);

    @Test
    public void getCategory(){
        FileInputStream fileIn = null;
        List<Category> list = null;
        try {
            fileIn = new FileInputStream("D:\\cate.xls");
            IExcelUtil<Category> util = new ExcelUtils<>();//创建excel工具类
            list = util.build(Category.class).importExcel("Sheet1", fileIn);// 导入
            logger.info(JSON.toJSONString(list));
        } catch (FileNotFoundException e) {
            System.out.println("获取数据失败");
        }

        importCategory(list);
    }

    private void importCategory(List<Category> list){
        Connection conn = MySqlJDBC.getConn();

        for (Category category:list) {
            //一级循环
            TgMgCategoryDO categoryDO = new TgMgCategoryDO();
            Long idSt = IdGenFactory.getId();
            categoryDO.setId(idSt);
            categoryDO.setLev(1);
            categoryDO.setPid(-1L);
            categoryDO.setFr("-1," + idSt);
            categoryDO.setName(category.getNameSt());
            categoryDO.setTimestamp(System.currentTimeMillis());
            categoryDO.setValidStatus(1);
            categoryDO.setMgCategoryStatus("DISPALY");
            MySqlJDBC.insertStmt(conn, categoryDO);

            Set<CateNd> cateNds = category.getCateNds();
            for (CateNd cateNd:cateNds) {
                //二级循环
                TgMgCategoryDO categoryDOnd = new TgMgCategoryDO();
                Long idNd = IdGenFactory.getId();
                categoryDOnd.setId(idNd);
                categoryDOnd.setLev(1);
                categoryDOnd.setPid(idSt);
                categoryDOnd.setFr("-1,"+ idSt + "," + idNd);
                categoryDOnd.setName(cateNd.getNameNd());
                categoryDOnd.setTimestamp(System.currentTimeMillis());
                categoryDOnd.setValidStatus(1);
                categoryDOnd.setMgCategoryStatus("DISPALY");
                MySqlJDBC.insertStmt(conn, categoryDOnd);

                Set<CateRd> cateRds = cateNd.getCateRds();
                for (CateRd cateRd:cateRds) {
                    //三级循环
                    TgMgCategoryDO categoryDOrd = new TgMgCategoryDO();
                    Long idRd = IdGenFactory.getId();
                    categoryDOrd.setId(idRd);
                    categoryDOrd.setLev(1);
                    categoryDOrd.setPid(idNd);
                    categoryDOrd.setFr("-1,"+ idSt + "," + idNd + "," + idRd);
                    categoryDOrd.setName(cateRd.getNameRd());
                    categoryDOrd.setTimestamp(System.currentTimeMillis());
                    categoryDOrd.setValidStatus(1);
                    categoryDOrd.setMgCategoryStatus("DISPALY");
                    MySqlJDBC.insertStmt(conn, categoryDOrd);
                }
            }
        }

        MySqlJDBC.closeRes(conn);

    }



}
