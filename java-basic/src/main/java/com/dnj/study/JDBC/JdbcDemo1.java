package com.dnj.study.JDBC;

import java.sql.*;

/**
 * @ClassName JdbcDemo1
 * @Description TODO
 * @Author dnj
 * @Date 2020/12/14
 **/
public class JdbcDemo1 {
    private final static String JDBC_DRIVER = "com.mysql.jdbc.driver";
    private final static String DB_URL = "jdbc:mysql://localhost:3306/student_manager";
    private final static String USER_NAME="root";
    private final static String PASSWORD="123456";

    public static void main(String[] args)throws ClassNotFoundException, SQLException{
        //1.加载jdbc驱动
        Class.forName(JDBC_DRIVER);
        //2.建立数据库连接
        Connection conn = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
        //3.实例化statement对象
        Statement statement = conn.createStatement();
        //4.拼sql语句
        String sql = "SELECT * FROM t_student";
        //5.执行crud语句
        ResultSet rs = statement.executeQuery(sql);
        //6.处理结果集
        while (rs.next()){
            int classId = rs.getInt("class_id");
            String studentName = rs.getString("student_name");
            short gender = rs.getShort(6);
            Object birthday = rs.getObject("birthdat");
            System.out.println(classId + "," + studentName + "," + gender + "," + birthday);
        }
        //7.关闭连接
        rs.close();
        statement.close();
        conn.close();
    }
}
