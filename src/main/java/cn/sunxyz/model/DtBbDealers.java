/**
 * <p>新大洋--经销商表实体类</p>
 * <p>Copyright:Copyright (c) 2014</p>
 * <p>Company:吉利易云科技 </p>
 * <p>Date:2014-07-22</p> 
 * @author lijiang
 * @version 1.0
 */
package cn.sunxyz.model;

import java.util.Date;

public class DtBbDealers {

	/**
	 * 账套号
	 */
	private Integer FSYSTEMID;
	
	private String CLIENT_NO;
	
	private Integer CLIENT_TYPE;
	private Integer IS_SELECTED;
	
	private String ID_K3;

	/**
	 * 详细地址
	 */
	private String ADDRESS; // 128||C||详细地址

	/**
	 * 授权商圈:1107
	 */
	private Integer AUTHORIZED_BCD; // 8||null||授权商圈:1107

	/**
	 * 营业状态:1108
	 */
	private Integer BIZ_STATUS; // 8||null||营业状态:1108

	/**
	 * 验收日期
	 */
	private Date CHECKED_TO_DATE; // 0||null||验收日期

	/**
	 * 城市，来源：区域定义表
	 */
	private Integer CITY; // 8||null||城市，来源：区域定义表

	/**
	 * 公司ID号。实体的唯一标识，用户识别数据主体，在本模型中，4S站、2S站、网点、分工厂、手拉手服务站统称为经销商，经销商代码是有上端统一确定的，
	 * 下端无法更改，公司ID号为0的数据表示是共享数据
	 */
	private Integer COMPANY_ID; // 8||null||公司ID号。实体的唯一标识，用户识别数据主体，在本模型中，4S站、2S站、网点、分工厂、手拉手服务站统称为经销商，经销商代码是有上端统一确定的，下端无法更改，公司ID号为0的数据表示是共享数据

	/**
	 * 合同编号
	 */
	private String CONTRACT_NO; // 1||null||合同编号

	/**
	 * 国家，来源：区域定义表
	 */
	private Integer COUNTRY; // 8||null||国家，来源：区域定义表

	/**
	 * 来源：区域定义表
	 */
	private Integer COUNTY; // 8||null||来源：区域定义表

	/**
	 * 系统保留字段，记录数据创建用户，用于审计，无业务含义，如果是单据，可以作为制单人使用
	 */
	private Integer CREATED_BY; // 8||null||系统保留字段，记录数据创建用户，用于审计，无业务含义，如果是单据，可以作为制单人使用

	/**
	 * 系统保留字段，记录数据创建时间，用于系统审计，无实际业务含义
	 */
	private Date CREATED_TIME; // 0||null||系统保留字段，记录数据创建时间，用于系统审计，无实际业务含义

	/**
	 * 服务站或经销商的业务代码，特定情况下可以修改，只作为业务标识，不作为数据标识
	 */
	private String DEALER_CODE; // 16||B||服务站或经销商的业务代码，特定情况下可以修改，只作为业务标识，不作为数据标识

	/**
	 * 表示属于哪个经销商公司实体
	 */
	private Integer DEALER_COMPANY_ID; // 8||null||表示属于哪个经销商公司实体

	/**
	 * 服务站(经销商)ID号
	 */
	private Integer DEALER_ID; // 8||null||服务站(经销商)ID号

	/**
	 * 经销商ID号(K3)
	 */
	private String DEALER_ID_K3; // 16||B||经销商ID号(K3)

	/**
	 * 经销商锁定
	 */
	private Integer DEALER_LOCK; // 1||null||经销商锁定

	/**
	 * 服务站(经销商)名称
	 */
	private String DEALER_NAME; // 128||C||服务站(经销商)名称

	/**
	 * 服务站(经销商)简称
	 */
	private String DEALER_SHORT_NAME; // 128||C||服务站(经销商)简称

	/**
	 * 销售大区ID号
	 */
	private Integer DLR_REGION_ID; // 4||null||销售大区ID号

	/**
	 * 大区经理
	 */
	private Integer DLR_REGION_MANAGER; // 8||null||大区经理
	private String DLR_REGION_MANAGER_NAME;

	/**
	 * 大区名称
	 */
	private String DLR_REGION_NAME; // 64||C||大区名称

	/**
	 * 大区经理电话
	 */
	private String DLR_REGION_TEL; // 32||C||大区经理电话

	/**
	 * 销售区域ID号
	 */
	private Integer DLR_SECTOR_ID; // 4||null||销售区域ID号

	/**
	 * 区域经理
	 */
	private Integer DLR_SECTOR_MANAGER; // 8||null||区域经理
	private String DLR_SECTOR_MANAGER_NAME;

	/**
	 * 区域名称
	 */
	private String DLR_SECTOR_NAME; // 64||C||区域名称

	/**
	 * 区域经理电话
	 */
	private String DLR_SECTOR_TEL; // 32||C||区域经理电话

	/**
	 * 电子邮箱
	 */
	private String EMAIL; // 64||B||电子邮箱

	/**
	 * 人员锁定
	 */
	private Integer EMP_LOCK; // 1||null||人员锁定

	private Date END_DATE;

	/**
	 * 传真号码
	 */
	private String FAX_NO; // 32||B||传真号码

	/**
	 * 热线电话
	 */
	private String HOT_LINE; // 32||B||热线电话

	/**
	 * 法人代表
	 */
	private String INCORPORATOR; // 32||C||法人代表

	/**
	 * 法人手机
	 */
	private String INCORPORATOR_MOB; // 32||B||法人手机

	/**
	 * 法人电话
	 */
	private String INCORPORATOR_TEL; // 32||B||法人电话

	private Integer IS_INACTIVE;

	/**
	 * 加盟日期
	 */
	private Date JOIN_TIME; // 0||null||加盟日期
	/**
	 * 加盟日期
	 */
	private Date JOIN_TIME_END; // 0||null||加盟日期

	/**
	 * 保证金额度
	 */
	private Double MARGIN; // 10||null||保证金额度

	private Integer OPTION_ID;

	private Integer PARENT_OPTION_ID;

	/**
	 * 省份，来源：区域定义表
	 */
	private Integer PROVINCE; // 8||null||省份，来源：区域定义表

	private Integer RECORD_ID;

	/**
	 * 注册地址
	 */
	private String REGISTERED_ADDRESS; // 128||C||注册地址

	/**
	 * 注册资金
	 */
	private Double REGISTERED_CAPITAL; // 12||null||注册资金

	/**
	 * 备注
	 */
	private String REMARK; // 512||C||备注

	/**
	 * 退网日期
	 */
	private Date REVOKE_DATE; // 0||null||退网日期

	private Date START_DATE;

	/**
	 * 店面类型:1106
	 */
	private Integer STORE_TYPE; // 8||null||店面类型:1106

	private String UPDATE_STATUS;

	/**
	 * 系统保留字段，记录数据最后更新用户，用于审计，无业务含义
	 */
	private Integer UPDATED_BY; // 8||null||系统保留字段，记录数据最后更新用户，用于审计，无业务含义

	/**
	 * 系统保留字段，记录数据最后时间，用于审计，无业务含义
	 */
	private Date UPDATED_TIME; // 0||null||系统保留字段，记录数据最后时间，用于审计，无业务含义

	/**
	 * 系统保留字段，表示当前数据版本，用于控制业务并发，无其它业务含义
	 */
	private Integer VERSION; // 8||null||系统保留字段，表示当前数据版本，用于控制业务并发，无其它业务含义

	/**
	 * 公司主页
	 */
	private String WEBSITE; // 128||B||公司主页

	/**
	 * 邮政编码
	 */
	private String ZIP_CODE; // 8||B||邮政编码

	/**
	 * 详细地址
	 */
	public String getADDRESS() {

		return ADDRESS;

	}

	/**
	 * 授权商圈:1107
	 */
	public Integer getAUTHORIZED_BCD() {

		return AUTHORIZED_BCD;

	}

	/**
	 * 营业状态:1108
	 */
	public Integer getBIZ_STATUS() {

		return BIZ_STATUS;

	}

	/**
	 * 验收日期
	 */
	public Date getCHECKED_TO_DATE() {

		return CHECKED_TO_DATE;

	}

	/**
	 * 城市，来源：区域定义表
	 */
	public Integer getCITY() {

		return CITY;

	}

	/**
	 * 公司ID号。实体的唯一标识，用户识别数据主体，在本模型中，4S站、2S站、网点、分工厂、手拉手服务站统称为经销商，经销商代码是有上端统一确定的，
	 * 下端无法更改，公司ID号为0的数据表示是共享数据
	 */
	public Integer getCOMPANY_ID() {

		return COMPANY_ID;

	}

	public String getCONTRACT_NO() {
		return CONTRACT_NO;
	}

	/**
	 * 国家，来源：区域定义表
	 */
	public Integer getCOUNTRY() {

		return COUNTRY;

	}

	/**
	 * 来源：区域定义表
	 */
	public Integer getCOUNTY() {

		return COUNTY;

	}

	/**
	 * 系统保留字段，记录数据创建用户，用于审计，无业务含义，如果是单据，可以作为制单人使用
	 */
	public Integer getCREATED_BY() {

		return CREATED_BY;

	}

	/**
	 * 系统保留字段，记录数据创建时间，用于系统审计，无实际业务含义
	 */
	public Date getCREATED_TIME() {

		return CREATED_TIME;

	}

	/**
	 * 服务站或经销商的业务代码，特定情况下可以修改，只作为业务标识，不作为数据标识
	 */
	public String getDEALER_CODE() {

		return DEALER_CODE;

	}

	/**
	 * 表示属于哪个经销商公司实体
	 */
	public Integer getDEALER_COMPANY_ID() {

		return DEALER_COMPANY_ID;

	}

	/**
	 * 服务站(经销商)ID号
	 */
	public Integer getDEALER_ID() {

		return DEALER_ID;

	}

	/**
	 * 经销商ID号(K3)
	 */
	public String getDEALER_ID_K3() {

		return DEALER_ID_K3;

	}

	/**
	 * 经销商锁定
	 */
	public Integer getDEALER_LOCK() {

		return DEALER_LOCK;

	}

	/**
	 * 服务站(经销商)名称
	 */
	public String getDEALER_NAME() {

		return DEALER_NAME;

	}

	/**
	 * 服务站(经销商)简称
	 */
	public String getDEALER_SHORT_NAME() {

		return DEALER_SHORT_NAME;

	}

	/**
	 * 销售大区ID号
	 */
	public Integer getDLR_REGION_ID() {

		return DLR_REGION_ID;

	}

	/**
	 * 大区经理
	 */
	public Integer getDLR_REGION_MANAGER() {

		return DLR_REGION_MANAGER;

	}

	/**
	 * 大区名称
	 */
	public String getDLR_REGION_NAME() {

		return DLR_REGION_NAME;

	}

	/**
	 * 大区经理电话
	 */
	public String getDLR_REGION_TEL() {

		return DLR_REGION_TEL;

	}

	/**
	 * 销售区域ID号
	 */
	public Integer getDLR_SECTOR_ID() {

		return DLR_SECTOR_ID;

	}

	/**
	 * 区域经理
	 */
	public Integer getDLR_SECTOR_MANAGER() {

		return DLR_SECTOR_MANAGER;

	}

	/**
	 * 区域名称
	 */
	public String getDLR_SECTOR_NAME() {

		return DLR_SECTOR_NAME;

	}

	/**
	 * 区域经理电话
	 */
	public String getDLR_SECTOR_TEL() {

		return DLR_SECTOR_TEL;

	}

	/**
	 * 电子邮箱
	 */
	public String getEMAIL() {

		return EMAIL;

	}

	/**
	 * 人员锁定
	 */
	public Integer getEMP_LOCK() {

		return EMP_LOCK;

	}

	public Date getEND_DATE() {
		return END_DATE;
	}

	/**
	 * 传真号码
	 */
	public String getFAX_NO() {

		return FAX_NO;

	}

	/**
	 * 热线电话
	 */
	public String getHOT_LINE() {

		return HOT_LINE;

	}

	/**
	 * 法人代表
	 */
	public String getINCORPORATOR() {

		return INCORPORATOR;

	}

	/**
	 * 法人手机
	 */
	public String getINCORPORATOR_MOB() {

		return INCORPORATOR_MOB;

	}

	/**
	 * 法人电话
	 */
	public String getINCORPORATOR_TEL() {

		return INCORPORATOR_TEL;

	}

	public Integer getIS_INACTIVE() {
		return IS_INACTIVE;
	}

	/**
	 * 加盟日期
	 */
	public Date getJOIN_TIME() {

		return JOIN_TIME;

	}

	public Date getJOIN_TIME_END() {
		return JOIN_TIME_END;
	}

	/**
	 * 保证金额度
	 */
	public Double getMARGIN() {

		return MARGIN;

	}

	public Integer getOPTION_ID() {
		return OPTION_ID;
	}

	public Integer getPARENT_OPTION_ID() {
		return PARENT_OPTION_ID;
	}

	/**
	 * 省份，来源：区域定义表
	 */
	public Integer getPROVINCE() {

		return PROVINCE;

	}

	public Integer getRECORD_ID() {
		return RECORD_ID;
	}

	/**
	 * 注册地址
	 */
	public String getREGISTERED_ADDRESS() {

		return REGISTERED_ADDRESS;

	}

	/**
	 * 注册资金
	 */
	public Double getREGISTERED_CAPITAL() {

		return REGISTERED_CAPITAL;

	}

	/**
	 * 备注
	 */
	public String getREMARK() {

		return REMARK;

	}

	/**
	 * 退网日期
	 */
	public Date getREVOKE_DATE() {

		return REVOKE_DATE;

	}

	public Date getSTART_DATE() {
		return START_DATE;
	}

	/**
	 * 店面类型:1106
	 */
	public Integer getSTORE_TYPE() {

		return STORE_TYPE;

	}

	public String getUPDATE_STATUS() {

		return UPDATE_STATUS;

	}

	/**
	 * 系统保留字段，记录数据最后更新用户，用于审计，无业务含义
	 */
	public Integer getUPDATED_BY() {

		return UPDATED_BY;

	}

	/**
	 * 系统保留字段，记录数据最后时间，用于审计，无业务含义
	 */
	public Date getUPDATED_TIME() {

		return UPDATED_TIME;

	}

	/**
	 * 系统保留字段，表示当前数据版本，用于控制业务并发，无其它业务含义
	 */
	public Integer getVERSION() {

		return VERSION;

	}

	/**
	 * 公司主页
	 */
	public String getWEBSITE() {

		return WEBSITE;

	}

	/**
	 * 邮政编码
	 */
	public String getZIP_CODE() {

		return ZIP_CODE;

	}

	/**
	 * 详细地址
	 */
	public void setADDRESS(String ADDRESS) {

		this.ADDRESS = ADDRESS;

	}

	/**
	 * 授权商圈:1107
	 */
	public void setAUTHORIZED_BCD(Integer AUTHORIZED_BCD) {

		this.AUTHORIZED_BCD = AUTHORIZED_BCD;

	}

	/**
	 * 营业状态:1108
	 */
	public void setBIZ_STATUS(Integer BIZ_STATUS) {

		this.BIZ_STATUS = BIZ_STATUS;

	}

	/**
	 * 验收日期
	 */
	public void setCHECKED_TO_DATE(Date CHECKED_TO_DATE) {

		this.CHECKED_TO_DATE = CHECKED_TO_DATE;

	}

	/**
	 * 城市，来源：区域定义表
	 */
	public void setCITY(Integer CITY) {

		this.CITY = CITY;

	}

	/**
	 * 公司ID号。实体的唯一标识，用户识别数据主体，在本模型中，4S站、2S站、网点、分工厂、手拉手服务站统称为经销商，经销商代码是有上端统一确定的，
	 * 下端无法更改，公司ID号为0的数据表示是共享数据
	 */
	public void setCOMPANY_ID(Integer COMPANY_ID) {

		this.COMPANY_ID = COMPANY_ID;

	}

	public void setCONTRACT_NO(String cONTRACT_NO) {
		CONTRACT_NO = cONTRACT_NO;
	}

	/**
	 * 国家，来源：区域定义表
	 */
	public void setCOUNTRY(Integer COUNTRY) {

		this.COUNTRY = COUNTRY;

	}

	/**
	 * 来源：区域定义表
	 */
	public void setCOUNTY(Integer COUNTY) {

		this.COUNTY = COUNTY;

	}

	/**
	 * 系统保留字段，记录数据创建用户，用于审计，无业务含义，如果是单据，可以作为制单人使用
	 */
	public void setCREATED_BY(Integer CREATED_BY) {

		this.CREATED_BY = CREATED_BY;

	}

	/**
	 * 系统保留字段，记录数据创建时间，用于系统审计，无实际业务含义
	 */
	public void setCREATED_TIME(Date CREATED_TIME) {

		this.CREATED_TIME = CREATED_TIME;

	}

	/**
	 * 服务站或经销商的业务代码，特定情况下可以修改，只作为业务标识，不作为数据标识
	 */
	public void setDEALER_CODE(String DEALER_CODE) {

		this.DEALER_CODE = DEALER_CODE;

	}

	/**
	 * 表示属于哪个经销商公司实体
	 */
	public void setDEALER_COMPANY_ID(Integer DEALER_COMPANY_ID) {

		this.DEALER_COMPANY_ID = DEALER_COMPANY_ID;

	}

	/**
	 * 服务站(经销商)ID号
	 */
	public void setDEALER_ID(Integer DEALER_ID) {

		this.DEALER_ID = DEALER_ID;

	}

	/**
	 * 经销商ID号(K3)
	 */
	public void setDEALER_ID_K3(String DEALER_ID_K3) {

		this.DEALER_ID_K3 = DEALER_ID_K3;

	}

	/**
	 * 经销商锁定
	 */
	public void setDEALER_LOCK(Integer DEALER_LOCK) {

		this.DEALER_LOCK = DEALER_LOCK;

	}

	/**
	 * 服务站(经销商)名称
	 */
	public void setDEALER_NAME(String DEALER_NAME) {

		this.DEALER_NAME = DEALER_NAME;

	}

	/**
	 * 服务站(经销商)简称
	 */
	public void setDEALER_SHORT_NAME(String DEALER_SHORT_NAME) {

		this.DEALER_SHORT_NAME = DEALER_SHORT_NAME;

	}

	/**
	 * 销售大区ID号
	 */
	public void setDLR_REGION_ID(Integer DLR_REGION_ID) {

		this.DLR_REGION_ID = DLR_REGION_ID;

	}

	/**
	 * 大区经理
	 */
	public void setDLR_REGION_MANAGER(Integer DLR_REGION_MANAGER) {

		this.DLR_REGION_MANAGER = DLR_REGION_MANAGER;

	}

	/**
	 * 大区名称
	 */
	public void setDLR_REGION_NAME(String DLR_REGION_NAME) {

		this.DLR_REGION_NAME = DLR_REGION_NAME;

	}

	/**
	 * 大区经理电话
	 */
	public void setDLR_REGION_TEL(String DLR_REGION_TEL) {

		this.DLR_REGION_TEL = DLR_REGION_TEL;

	}

	/**
	 * 销售区域ID号
	 */
	public void setDLR_SECTOR_ID(Integer DLR_SECTOR_ID) {

		this.DLR_SECTOR_ID = DLR_SECTOR_ID;

	}

	/**
	 * 区域经理
	 */
	public void setDLR_SECTOR_MANAGER(Integer DLR_SECTOR_MANAGER) {

		this.DLR_SECTOR_MANAGER = DLR_SECTOR_MANAGER;

	}

	/**
	 * 区域名称
	 */
	public void setDLR_SECTOR_NAME(String DLR_SECTOR_NAME) {

		this.DLR_SECTOR_NAME = DLR_SECTOR_NAME;

	}

	/**
	 * 区域经理电话
	 */
	public void setDLR_SECTOR_TEL(String DLR_SECTOR_TEL) {

		this.DLR_SECTOR_TEL = DLR_SECTOR_TEL;

	}

	/**
	 * 电子邮箱
	 */
	public void setEMAIL(String EMAIL) {

		this.EMAIL = EMAIL;

	}

	/**
	 * 人员锁定
	 */
	public void setEMP_LOCK(Integer EMP_LOCK) {

		this.EMP_LOCK = EMP_LOCK;

	}

	public void setEND_DATE(Date eND_DATE) {
		END_DATE = eND_DATE;
	}

	/**
	 * 传真号码
	 */
	public void setFAX_NO(String FAX_NO) {

		this.FAX_NO = FAX_NO;

	}

	/**
	 * 热线电话
	 */
	public void setHOT_LINE(String HOT_LINE) {

		this.HOT_LINE = HOT_LINE;

	}

	/**
	 * 法人代表
	 */
	public void setINCORPORATOR(String INCORPORATOR) {

		this.INCORPORATOR = INCORPORATOR;

	}

	/**
	 * 法人手机
	 */
	public void setINCORPORATOR_MOB(String INCORPORATOR_MOB) {

		this.INCORPORATOR_MOB = INCORPORATOR_MOB;

	}

	/**
	 * 法人电话
	 */
	public void setINCORPORATOR_TEL(String INCORPORATOR_TEL) {

		this.INCORPORATOR_TEL = INCORPORATOR_TEL;

	}

	public void setIS_INACTIVE(Integer iS_INACTIVE) {
		IS_INACTIVE = iS_INACTIVE;
	}

	/**
	 * 加盟日期
	 */
	public void setJOIN_TIME(Date JOIN_TIME) {

		this.JOIN_TIME = JOIN_TIME;

	}

	public void setJOIN_TIME_END(Date jOIN_TIME_END) {
		JOIN_TIME_END = jOIN_TIME_END;
	}

	/**
	 * 保证金额度
	 */
	public void setMARGIN(Double MARGIN) {

		this.MARGIN = MARGIN;

	}

	public void setOPTION_ID(Integer oPTION_ID) {
		OPTION_ID = oPTION_ID;
	}

	public void setPARENT_OPTION_ID(Integer pARENT_OPTION_ID) {
		PARENT_OPTION_ID = pARENT_OPTION_ID;
	}

	/**
	 * 省份，来源：区域定义表
	 */
	public void setPROVINCE(Integer PROVINCE) {

		this.PROVINCE = PROVINCE;

	}

	public void setRECORD_ID(Integer RECORD_ID) {
		this.RECORD_ID = RECORD_ID;
	}

	/**
	 * 注册地址
	 */
	public void setREGISTERED_ADDRESS(String REGISTERED_ADDRESS) {

		this.REGISTERED_ADDRESS = REGISTERED_ADDRESS;

	}

	/**
	 * 注册资金
	 */
	public void setREGISTERED_CAPITAL(Double REGISTERED_CAPITAL) {

		this.REGISTERED_CAPITAL = REGISTERED_CAPITAL;

	}

	/**
	 * 备注
	 */
	public void setREMARK(String REMARK) {

		this.REMARK = REMARK;

	}

	/**
	 * 退网日期
	 */
	public void setREVOKE_DATE(Date REVOKE_DATE) {

		this.REVOKE_DATE = REVOKE_DATE;

	}

	public void setSTART_DATE(Date sTART_DATE) {
		START_DATE = sTART_DATE;
	}

	/**
	 * 店面类型:1106
	 */
	public void setSTORE_TYPE(Integer STORE_TYPE) {

		this.STORE_TYPE = STORE_TYPE;

	}

	public void setUPDATE_STATUS(String UPDATE_STATUS) {

		this.UPDATE_STATUS = UPDATE_STATUS;

	}

	/**
	 * 系统保留字段，记录数据最后更新用户，用于审计，无业务含义
	 */
	public void setUPDATED_BY(Integer UPDATED_BY) {

		this.UPDATED_BY = UPDATED_BY;

	}

	/**
	 * 系统保留字段，记录数据最后时间，用于审计，无业务含义
	 */
	public void setUPDATED_TIME(Date UPDATED_TIME) {

		this.UPDATED_TIME = UPDATED_TIME;

	}

	/**
	 * 系统保留字段，表示当前数据版本，用于控制业务并发，无其它业务含义
	 */
	public void setVERSION(Integer VERSION) {

		this.VERSION = VERSION;

	}

	/**
	 * 公司主页
	 */
	public void setWEBSITE(String WEBSITE) {

		this.WEBSITE = WEBSITE;

	}

	/**
	 * 邮政编码
	 */
	public void setZIP_CODE(String ZIP_CODE) {

		this.ZIP_CODE = ZIP_CODE;

	}

   
	public Integer getFSYSTEMID() {
		return FSYSTEMID;
	}

	public void setFSYSTEMID(Integer fSYSTEMID) {
		FSYSTEMID = fSYSTEMID;
	}

	public String getCLIENT_NO() {
		return CLIENT_NO;
	}

	public void setCLIENT_NO(String cLIENT_NO) {
		CLIENT_NO = cLIENT_NO;
	}

	public Integer getCLIENT_TYPE() {
		return CLIENT_TYPE;
	}

	public void setCLIENT_TYPE(Integer cLIENT_TYPE) {
		CLIENT_TYPE = cLIENT_TYPE;
	}

	public String getID_K3() {
		return ID_K3;
	}

	public void setID_K3(String iD_K3) {
		ID_K3 = iD_K3;
	}

	public Integer getIS_SELECTED() {
		return IS_SELECTED;
	}

	public void setIS_SELECTED(Integer iS_SELECTED) {
		IS_SELECTED = iS_SELECTED;
	}

	public String getDLR_REGION_MANAGER_NAME() {
		return DLR_REGION_MANAGER_NAME;
	}

	public void setDLR_REGION_MANAGER_NAME(String dLR_REGION_MANAGER_NAME) {
		DLR_REGION_MANAGER_NAME = dLR_REGION_MANAGER_NAME;
	}

	public String getDLR_SECTOR_MANAGER_NAME() {
		return DLR_SECTOR_MANAGER_NAME;
	}

	public void setDLR_SECTOR_MANAGER_NAME(String dLR_SECTOR_MANAGER_NAME) {
		DLR_SECTOR_MANAGER_NAME = dLR_SECTOR_MANAGER_NAME;
	}
	
}
