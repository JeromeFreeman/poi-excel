package cn.sunxyz.common.excel.area;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelID;

/**
 * @author Neo.fang@carlt.com.cn
 * @creatTime 2018/8/28 0028
 */
public class Region {

    /**
     * 
     */
    @ExcelID
    @ExcelAttribute(name="id",column="A")
    private String id;


    /**
     * 
     */
    @ExcelAttribute(name="name",column="B")
    private String name;


    /**
     * 
     */
    @ExcelAttribute(name="parentId",column="C")
    private String parentId;


    /**
     * 
     */
    @ExcelAttribute(name="shortName",column="D")
    private String shortName;


    /**
     * 
     */
    @ExcelAttribute(name="levelType",column="E")
    private String levelType;


    /**
     * 
     */
    @ExcelAttribute(name="cityCode",column="F")
    private String cityCode;


    /**
     * 
     */
    @ExcelAttribute(name="zipCode",column="G")
    private String zipCode;


    /**
     * 
     */
    @ExcelAttribute(name="mergerName",column="H")
    private String mergerName;


    /**
     * 
     */
    @ExcelAttribute(name="lng",column="I")
    private String lng;


    /**
     * 
     */
    @ExcelAttribute(name="lat",column="J")
    private String lat;


    /**
     * 
     */
    @ExcelAttribute(name="pinyin",column="K")
    private String pinyin;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getMergerName() {
        return mergerName;
    }

    public void setMergerName(String mergerName) {
        this.mergerName = mergerName;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
}
