package cn.sunxyz.common.excel.test;

import cn.sunxyz.common.excel.area.Areand;
import cn.sunxyz.common.excel.area.Areast;
import cn.sunxyz.common.excel.area.Region;
import cn.sunxyz.common.excel.cat.Category;
import cn.sunxyz.common.excel.core.ExcelUtils;
import cn.sunxyz.common.excel.core.IExcelUtil;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Neo.fang@carlt.com.cn
 * @creatTime 2018/8/28 0028
 */
public class ImportAreaTest {

    private Logger logger = LoggerFactory.getLogger(ImportCategoryTest.class);

//    "D:\\data\\area.xls"

    private List<Region> list;

    @Test
    public void getArea(){
        FileInputStream fileIn = null;
//        List<Region> list = null;
        try {
            fileIn = new FileInputStream("D:\\data\\area.xls");
            IExcelUtil<Region> util = new ExcelUtils<>();//创建excel工具类
            list = util.build(Region.class).importExcel("Sheet1", fileIn);// 导入
            logger.info(JSON.toJSONString(list));
        } catch (FileNotFoundException e) {
            System.out.println("获取数据失败");
        }

        beTree();
    }

    private void beTree() {
        // 过滤出一级列表
        List<Region> listC = conditionFilter(list, a -> a.getLevelType().equals("1.0"));
        logger.info(JSON.toJSONString(listC));

        List<Areast> areasts = new ArrayList<>();
        for (Region region:listC){
            Areast areast = new Areast();
            areast.setId(region.getId());
            areast.setName(region.getName());
            areast.setPinyin(region.getPinyin());
            Set<Areast> areastSet = loop(region.getId());
            areast.setChildSet(areastSet);
            areasts.add(areast);
        }

        logger.info(JSON.toJSONString(areasts));
    }

    private Set<Areast> loop(String pid) {
        List<Region> listC = conditionFilter(list, a -> a.getParentId().equals(pid));

        if (listC == null || listC.size() == 0){
            return null;
        }

        Set<Areast> areasts = new HashSet<>();
        for (Region region:listC){
            Areast areast = new Areast();
            areast.setId(region.getId());
            areast.setName(region.getName());
            areast.setPinyin(region.getPinyin());
            Set<Areast> areastSet = loop(region.getId());
            areast.setChildSet(areastSet);
            areasts.add(areast);
        }
        return areasts;
    }

    public List<Region> conditionFilter(List<Region> list, Predicate<Region> predicate){
        return list.stream().filter(predicate).collect(Collectors.toList());
    }


}
