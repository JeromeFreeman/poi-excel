package cn.sunxyz.dao;

import cn.sunxyz.common.util.IdGenFactory;
import cn.sunxyz.model.DealerA;
import cn.sunxyz.model.TgMgCategoryDO;
import jdk.nashorn.internal.objects.NativeUint8Array;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by JT on 2018/05/29.
 */
public class MySqlJDBC {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://47.96.107.73:3306/carlt_dc?characterEncoding=utf8&zeroDateTimeBehavior=convertToNull";

    static final String USER = "carlt";
    static final String PASS = "carlt123";

    public static void main(String[] args) {
//        Connection conn = getConn();
//        insertStmt(conn,4,"restsssssss", new BigDecimal("36.50"));
//        selectStmt(conn, "restsssssss");

//        closeRes(conn);

        System.out.println(IdGenFactory.getId());
    }

    public static Connection getConn(){
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public static void insertMenu(Connection conn, MenuDTO menuDTO){
        PreparedStatement pstmt = null;
        String sql;
        sql = "INSERT INTO sys_menu\n" +
                "(id, " +
                "permission, " +
                "name, " +
                "type, " +
                "path, " +
                "url, " +
                "parent_id, " +
                "parent_ids, " +
                "enabled, " +
                "sort, " +
                "icon, " +
                "redirect, " +
                "cacheable, " +
                "require_auth, " +
                "component, " +
                "remarks, " +
                "create_by, " +
                "create_date, " +
                "update_by, " +
                "update_date, " +
                "del_flag) \n" +
                "VALUES \n" +
                "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setLong(1, menuDTO.getId()); // 给SQL中第一个问号赋变量id的值
            pstmt.setString(2, menuDTO.getPermission());
            pstmt.setString(2, menuDTO.getName());
            pstmt.setString(2, menuDTO.getType());
            pstmt.setString(2, menuDTO.getPermission());
            pstmt.setString(2, menuDTO.getPermission());
            pstmt.setString(2, menuDTO.getPermission());
            pstmt.setString(2, menuDTO.getPermission());
            pstmt.setString(2, menuDTO.getPermission());
            pstmt.setString(2, menuDTO.getPermission());
            pstmt.setString(2, menuDTO.getPermission());
            pstmt.setString(2, menuDTO.getPermission());
            pstmt.setString(2, menuDTO.getPermission());
            pstmt.setString(2, menuDTO.getPermission());
            pstmt.setString(2, menuDTO.getPermission());

            int update = pstmt.executeUpdate();
            System.out.println(update);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt != null){
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void insertStmt(Connection conn, TgMgCategoryDO categoryDO){
        PreparedStatement pstmt = null;
        String sql;
        sql = "        INSERT INTO TG_MG_CATEGORY(\n" +
                "        ID\n" +
                "        ,LEV\n" +
                "        ,PID\n" +
                "        ,FR\n" +
                "        ,NAME\n" +
                "        ,TIMESTAMP\n" +
                "        ,VALID_STATUS\n" +
                "        ,MG_CATEGORY_STATUS\n" +
                "        )VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setLong(1, categoryDO.getId()); // 给SQL中第一个问号赋变量id的值
            pstmt.setInt(2, categoryDO.getLev());
            pstmt.setLong(3, categoryDO.getPid());
            pstmt.setString(4, categoryDO.getFr());
            pstmt.setString(5, categoryDO.getName());
            pstmt.setLong(6, categoryDO.getTimestamp());
            pstmt.setInt(7, categoryDO.getValidStatus());
            pstmt.setString(8, categoryDO.getMgCategoryStatus());


            int update = pstmt.executeUpdate();
            System.out.println(update);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt != null){
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void insertDealer (Connection conn, DealerA dealerA){
        PreparedStatement pstmt = null;
        String sql;
        sql = "INSERT INTO dt_bb_dealers_copy4\n" +
                "(COMPANY_ID, \n" +
                "DEALER_ID, \n" +
                "DEALER_COMPANY_ID, \n" +
                "DEALER_CODE, \n" +
                "DEALER_NAME, \n" +
                "DEALER_SHORT_NAME, \n" +
                "DEALER_ID_K3, \n" +
                "DEALER_LEVEL, \n" +
                "AUTHORIZED_BCD, \n" +
                "JOIN_TIME, \n" +
                "BIZ_STATUS, \n" +
                "COUNTRY, \n" +
                "PROVINCE, \n" +
                "CITY, \n" +
                "COUNTY, \n" +
                "CHECKED_TO_DATE, \n" +
                "INCORPORATOR, \n" +
                "REGISTERED_CAPITAL, \n" +
                "MARGIN, \n" +
                "FAX_NO, \n" +
                "INCORPORATOR_TEL, \n" +
                "INCORPORATOR_MOB, \n" +
                "HOT_LINE, \n" +
                "EMAIL, \n" +
                "DLR_REGION_ID, \n" +
                "DLR_REGION_NAME, \n" +
                "DLR_SECTOR_ID, \n" +
                "DLR_SECTOR_NAME, \n" +
                "REVOKE_DATE, \n" +
                "ADDRESS, \n" +
                "WEBSITE, \n" +
                "ZIP_CODE, \n" +
                "REMARK, \n" +
                "DEALER_LOCK, \n" +
                "EMP_LOCK, \n" +
                "VERSION, \n" +
                "CREATED_BY, \n" +
                "CREATED_TIME, \n" +
                "UPDATED_BY, \n" +
                "UPDATED_TIME, \n" +
                "ENJOY_POLICY_END_DATE, \n" +
                "ENJOY_POLICY_QUOTA, \n" +
                "ENJOY_POLICY_ALREADY,\n" +
                "BANK_NAME, BANK_ACCOUNT, \n" +
                "TAX_NO, \n" +
                "REGISTERED_NO, \n" +
                "LINKMAN_PHONE, \n" +
                "LINKMAN_NAME, \n" +
                "ENJOY_POLICY_PRICE, \n" +
                "BIZ_HOURS, \n" +
                "REGISTERED_ADDRESS, \n" +
                "STORE_TYPE)" +
                "VALUES \n" +
                "(?, ?, ?, ?, ?, ?, ?, NULL, ?, ?, 11080010, NULL, ?, ?, ?, ?, ?, NULL, ?, NULL, ?, ?, NULL, NULL, " +
                "?, ?, ?, ?, ?, ?, NULL, NULL, NULL, NULL, NULL, ?, 0, '2019-05-22 10:39:04', 1001, '2019-05-22 10:43:56', '0000-00-00 00:00:00', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, ?);";
        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setBigDecimal(1, new BigDecimal("1001"));
            pstmt.setBigDecimal(2, new BigDecimal("1024"));
            pstmt.setBigDecimal(3, new BigDecimal("2032"));
            pstmt.setString(4, dealerA.getDEALER_CODE());
            pstmt.setString(5, dealerA.getDEALER_NAME());
            pstmt.setString(6, dealerA.getDEALER_SHORT_NAME());
            pstmt.setString(7, "0");
            pstmt.setBigDecimal(8, new BigDecimal("11070005"));
            pstmt.setDate(9, new Date(System.currentTimeMillis()));

            Map map = selectSSQ(conn, dealerA.getPROVINCE());
            BigDecimal id = null;
            if (map.get("id") != null){
                id = new BigDecimal(map.get("id")+"");
            }
            System.out.println(dealerA.getPROVINCE());
            pstmt.setBigDecimal(10, id);//省市区
            pstmt.setString(11, null);
            pstmt.setString(12, null);
            pstmt.setDate(13, new Date(System.currentTimeMillis()));
            pstmt.setString(14, dealerA.getINCORPORATOR());// 法人代表
            String MARGIN = null;
            if (!org.springframework.util.StringUtils.isEmpty(dealerA.getF())){
                MARGIN = dealerA.getF();
            }
            pstmt.setString(15,  MARGIN);// 保证金
            pstmt.setString(16, dealerA.getINCORPORATOR_TEL());// 法人
            pstmt.setString(17, dealerA.getINCORPORATOR_MOB());// 法人

            Map region = selectRegion(conn, dealerA.getB());//战区
            BigDecimal rid = null;
            if (map.get("id") != null){
                rid = new BigDecimal(region.get("id")+"");
            }
            pstmt.setBigDecimal(18, rid);
            pstmt.setString(19, region.get("name") + "");

            Map sector = selectSector(conn, dealerA.getB());//战区
            BigDecimal sid = null;
            if (map.get("id") != null){
                sid = new BigDecimal(sector.get("id")+"");
            }

            pstmt.setBigDecimal(20, sid);
            pstmt.setString(21, sector.get("name") + "");

            pstmt.setDate(22, new Date(System.currentTimeMillis()));
            pstmt.setString(23, dealerA.getADDRESS());
            pstmt.setBigDecimal(24, new BigDecimal("0"));

            pstmt.setBigDecimal(25, new BigDecimal("11060010"));

            int update = pstmt.executeUpdate();
            System.out.println(update);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt != null){
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static Map selectRegion(Connection conn, String name){
        PreparedStatement pstmt = null;
        String sql;
        sql = "SELECT * FROM dt_bb_dlr_region WHERE DLR_REGION_NAME = ?";
        HashMap<Object, Object> map = new HashMap<>();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                BigDecimal id = resultSet.getBigDecimal("DLR_REGION_ID");
                System.out.print("id: " + id);
                String regionName = resultSet.getString("DLR_REGION_NAME");
                System.out.print("name: " + regionName);

                map.put("id", id);
                map.put("name", regionName);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt != null){
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    public static Map selectSector(Connection conn, String name){
        PreparedStatement pstmt = null;
        String sql;
        sql = "SELECT * FROM dt_bb_dlr_sector WHERE DLR_SECTOR_NAME LIKE ?";
        HashMap<Object, Object> map = new HashMap<>();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name+"%");
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                BigDecimal id = resultSet.getBigDecimal("DLR_SECTOR_ID");
                System.out.print("id: " + id);
                String sectorName = resultSet.getString("DLR_SECTOR_NAME");
                System.out.print("name: " + sectorName);

                map.put("id", id);
                map.put("name", sectorName);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt != null){
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    public static Map selectSSQ(Connection conn, String name){
        PreparedStatement pstmt = null;
        String sql;
        sql = "select * from dt_bb_regions WHERE REGION_NAME LIKE ?";
        HashMap<Object, Object> map = new HashMap<>();
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + name+"%");
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                BigDecimal id = resultSet.getBigDecimal("REGION_ID");
                System.out.print("id: " + id);
                String regionName = resultSet.getString("REGION_NAME");
                System.out.print("name: " + regionName);

                map.put("id", id);
                map.put("name", regionName);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt != null){
                    pstmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    //关闭资源
    public static void closeRes(Connection conn){

            // 关闭资源
            try{
                if(conn!=null) {
                    conn.close();
                }
            }catch(SQLException se){
                se.printStackTrace();
            }
        }


}
