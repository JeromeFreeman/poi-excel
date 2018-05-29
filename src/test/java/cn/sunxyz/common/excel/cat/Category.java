package cn.sunxyz.common.excel.cat;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelElement;
import cn.sunxyz.common.excel.annotation.ExcelID;

import java.util.Set;

/**
 * Created by JT on 2018/05/29.
 */
public class Category {

    @ExcelID
    @ExcelAttribute(name="一级",column="A")
    private String nameSt;

    @ExcelElement
    private Set<CateNd> cateNds;


    public String getNameSt() {
        return nameSt;
    }

    public void setNameSt(String nameSt) {
        this.nameSt = nameSt;
    }

    public Set<CateNd> getCateNds() {
        return cateNds;
    }

    public void setCateNds(Set<CateNd> cateNds) {
        this.cateNds = cateNds;
    }
}
