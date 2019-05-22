package cn.sunxyz.common.excel.entity;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelID;

import java.util.Date;

/**
 * @author Neo.fang
 * @creatTime 2019/5/21 0021
 */
public class Dealer {

    @ExcelID
    @ExcelAttribute(name="经销商代码",column="A")
    private String A;
    @ExcelAttribute(name="经销商代码",column="B")
    private String B;
    @ExcelAttribute(name="经销商代码",column="E")
    private String E;
    @ExcelAttribute(name="经销商代码",column="F")
    private String F;
    @ExcelAttribute(name="经销商代码",column="H")
    private String H;

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getE() {
        return E;
    }

    public void setE(String e) {
        E = e;
    }

    public String getF() {
        return F;
    }

    public void setF(String f) {
        F = f;
    }

    public String getH() {
        return H;
    }

    public void setH(String h) {
        H = h;
    }

    @ExcelAttribute(name="经销商代码",column="J")
    private String DEALER_CODE; // 16||B||服务站或经销商的业务代码，特定情况下可以修改，只作为业务标识，不作为数据标识
    @ExcelAttribute(name="经销商全称",column="I")
    private String DEALER_NAME; // 128||C||服务站(经销商)名称
    @ExcelAttribute(name="经销商简称",column="D")
    private String DEALER_SHORT_NAME; // 128||C||服务站(经销商)简称
    @ExcelAttribute(name="省份",column="C")
    private String PROVINCE; // 8||null||省份，来源：区域定义表
    @ExcelAttribute(name="授权责任区域",column="G")
    private String CITY;  // 8||null||城市，来源：区域定义表，授权责任区域
    @ExcelAttribute(name="加盟日期",column="K")
    private Date JOIN_TIME; // 0||null||加盟日期
    @ExcelAttribute(name="法人名称",column="L")
    private String INCORPORATOR; // 32||C||法人代表
    @ExcelAttribute(name="法人手机",column="M")
    private String INCORPORATOR_MOB; // 32||B||法人手机
    @ExcelAttribute(name="电话",column="N")
    private String INCORPORATOR_TEL; // 32||B||电话
    @ExcelAttribute(name="销售地址",column="O")
    private String ADDRESS; // 128||C||注册地址


    public String getDEALER_CODE() {
        return DEALER_CODE;
    }

    public void setDEALER_CODE(String DEALER_CODE) {
        this.DEALER_CODE = DEALER_CODE;
    }

    public String getDEALER_NAME() {
        return DEALER_NAME;
    }

    public void setDEALER_NAME(String DEALER_NAME) {
        this.DEALER_NAME = DEALER_NAME;
    }

    public String getDEALER_SHORT_NAME() {
        return DEALER_SHORT_NAME;
    }

    public void setDEALER_SHORT_NAME(String DEALER_SHORT_NAME) {
        this.DEALER_SHORT_NAME = DEALER_SHORT_NAME;
    }

    public String getPROVINCE() {
        return PROVINCE;
    }

    public void setPROVINCE(String PROVINCE) {
        this.PROVINCE = PROVINCE;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public Date getJOIN_TIME() {
        return JOIN_TIME;
    }

    public void setJOIN_TIME(Date JOIN_TIME) {
        this.JOIN_TIME = JOIN_TIME;
    }

    public String getINCORPORATOR() {
        return INCORPORATOR;
    }

    public void setINCORPORATOR(String INCORPORATOR) {
        this.INCORPORATOR = INCORPORATOR;
    }

    public String getINCORPORATOR_MOB() {
        return INCORPORATOR_MOB;
    }

    public void setINCORPORATOR_MOB(String INCORPORATOR_MOB) {
        this.INCORPORATOR_MOB = INCORPORATOR_MOB;
    }

    public String getINCORPORATOR_TEL() {
        return INCORPORATOR_TEL;
    }

    public void setINCORPORATOR_TEL(String INCORPORATOR_TEL) {
        this.INCORPORATOR_TEL = INCORPORATOR_TEL;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }
}
