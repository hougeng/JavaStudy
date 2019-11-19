package com.qf.hougeng.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Classname DBUtil
 * @Description TODO
 * @Date 2019/11/19 20:54
 * @Created by Hougeng
 */

//*
// 提供一个工具类来连接对象Connection*/
public class DBUtil {
    private static Connection connection;
    static  {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            setConnection(DriverManager.getConnection("jdbc:mysql://localhost:3306/wordmanager","root","2810666"));
        } catch ( Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    private static void setConnection(Connection connection) {
        DBUtil.connection =connection;
    }

    public void after() {
        try
        {
            getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
