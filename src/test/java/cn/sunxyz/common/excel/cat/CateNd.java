package cn.sunxyz.common.excel.cat;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelElement;
import cn.sunxyz.common.excel.annotation.ExcelID;

import java.util.Set;

/**
 * Created by JT on 2018/05/29.
 */
public class CateNd {

    @ExcelID
    @ExcelAttribute(name="二级",column="B")
    private String nameNd;

    @ExcelElement
    private Set<CateRd> cateRds;


    public String getNameNd() {
        return nameNd;
    }

    public void setNameNd(String nameNd) {
        this.nameNd = nameNd;
    }

    public Set<CateRd> getCateRds() {
        return cateRds;
    }

    public void setCateRds(Set<CateRd> cateRds) {
        this.cateRds = cateRds;
    }
}
