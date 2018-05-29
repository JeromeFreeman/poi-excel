package cn.sunxyz.common.excel.cat;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelID;

/**
 * Created by JT on 2018/05/29.
 */
public class CateRd {

    @ExcelID
    @ExcelAttribute(name="三级",column="C")
    private String nameRd;

//    private Integer lev = 3;


    public String getNameRd() {
        return nameRd;
    }

    public void setNameRd(String nameRd) {
        this.nameRd = nameRd;
    }

//    public Integer getLev() {
//        return lev;
//    }
//
//    public void setLev(Integer lev) {
//        this.lev = lev;
//    }
}
