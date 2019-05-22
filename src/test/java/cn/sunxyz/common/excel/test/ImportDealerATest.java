package cn.sunxyz.common.excel.test;

import cn.sunxyz.common.excel.core.ExcelUtils;
import cn.sunxyz.common.excel.core.IExcelUtil;
import cn.sunxyz.common.excel.entity.Dealer;
import cn.sunxyz.common.excel.menu.Menu;
import cn.sunxyz.dao.MySqlJDBC;
import cn.sunxyz.model.DealerA;
import cn.sunxyz.model.DtBbDealers;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.List;
import java.util.Map;

/**
 * @author Neo.fang
 * @creatTime 2019/5/21 0021
 */
public class ImportDealerATest {


    @Test
    public void getCategory(){
        FileInputStream fileIn = null;
        List<DealerA> list = null;
        try {
            fileIn = new FileInputStream("C:\\Users\\Administrator\\Desktop\\经销商信息.xls");
            IExcelUtil<DealerA> util = new ExcelUtils<>();//创建excel工具类
            list = util.build(DealerA.class).importExcel("大乘", fileIn);// 导入
            System.out.println(JSON.toJSONString(list));
        } catch (FileNotFoundException e) {
            System.out.println("获取数据失败");
        }

        //hahah(list);
    }

    public void hahah(List<DealerA> list){
        Connection conn = MySqlJDBC.getConn();
//        Map map = MySqlJDBC.selectRegion(conn, "中原");
//        MySqlJDBC.selectSector(conn, "东部");
//        MySqlJDBC.selectSSQ(conn, "北京");

        list.stream().forEach(dealer -> {
            MySqlJDBC.insertDealer(conn, dealer);
        });

    }
}
