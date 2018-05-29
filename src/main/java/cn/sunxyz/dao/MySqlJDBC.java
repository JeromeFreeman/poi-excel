package cn.sunxyz.dao;

import cn.sunxyz.common.util.IdGenFactory;
import cn.sunxyz.model.TgMgCategoryDO;

import java.sql.*;

/**
 * Created by JT on 2018/05/29.
 */
public class MySqlJDBC {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/test?serverTimezone=Hongkong&useUnicode=true&characterEncoding=utf8&useSSL=false";

    static final String USER = "root";
    static final String PASS = "root";

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

    public static void selectStmt(Connection conn, String name){
        PreparedStatement pstmt = null;
        String sql;
        sql = "select * from user WHERE  NAME = ?";
        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, name);

            ResultSet resultSet = pstmt.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nameA = resultSet.getString("name");

                System.out.print("ID: " + id);
                System.out.print("名称: " + nameA);
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
