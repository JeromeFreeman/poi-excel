package cn.sunxyz.common.excel.test;

import cn.sunxyz.common.excel.cat.CateNd;
import cn.sunxyz.common.excel.cat.CateRd;
import cn.sunxyz.common.excel.core.ExcelUtils;
import cn.sunxyz.common.excel.core.IExcelUtil;
import cn.sunxyz.common.excel.menu.Menu;
import cn.sunxyz.common.excel.menu.Menu2;
import cn.sunxyz.common.excel.menu.Menu3;
import cn.sunxyz.common.excel.menu.Menu4;
import cn.sunxyz.common.util.IdGenFactory;
import cn.sunxyz.dao.MenuDTO;
import cn.sunxyz.dao.MySqlJDBC;
import cn.sunxyz.model.TgMgCategoryDO;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.List;
import java.util.Set;

/**
 * @author Neo.fang
 * @creatTime 2019/4/13 0013
 */
public class ImportMenuTest {

    @Test
    public void getCategory(){
        FileInputStream fileIn = null;
        List<Menu> list = null;
        try {
            fileIn = new FileInputStream("D:\\menu.xls");
            IExcelUtil<Menu> util = new ExcelUtils<>();//创建excel工具类
            list = util.build(Menu.class).importExcel("Sheet1", fileIn);// 导入
            System.out.println(JSON.toJSONString(list));
        } catch (FileNotFoundException e) {
            System.out.println("获取数据失败");
        }

        // importMenu(list);
    }

    private void importMenu(List<Menu> list){
        Connection conn = MySqlJDBC.getConn();

        for (Menu menu:list) {
            //一级循环
            MenuDTO menuDTO = new MenuDTO();
            Long id1 = IdGenFactory.getId();
            MySqlJDBC.insertMenu(conn, menuDTO);

            Set<Menu2> menu2Set = menu.getMenu2();
            for (Menu2 menu2:menu2Set) {
                //二级循环
                MenuDTO menuDTO2 = new MenuDTO();
                Long id2 = IdGenFactory.getId();
                MySqlJDBC.insertMenu(conn, menuDTO2);

                Set<Menu3> menu3Set = menu2.getMenu3();
                for (Menu3 menu3:menu3Set) {
                    //三级循环
                    MenuDTO menuDTO3 = new MenuDTO();
                    Long id3 = IdGenFactory.getId();
                    MySqlJDBC.insertMenu(conn, menuDTO2);

                    Set<Menu4> menu4Set = menu3.getMenu4();
                    for (Menu4 menu4:menu4Set) {
                        //四级循环
                        MenuDTO menuDTO4 = new MenuDTO();
                        Long id4 = IdGenFactory.getId();

                        MySqlJDBC.insertMenu(conn, menuDTO2);
                    }
                }
            }
        }

        MySqlJDBC.closeRes(conn);

    }

    @Test
    public void testEquals(){

    }
}
