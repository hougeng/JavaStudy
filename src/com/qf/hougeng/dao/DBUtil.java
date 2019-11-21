package com.qf.hougeng.dao;

import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.junit.After;
import org.junit.Test;


import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.*;

/**
 * @Classname DBUtil
 * @Description TODO
 * @Date 2019/11/19 20:54
 * @Created by Hougeng
 */

//*
// 提供一个工具类来连接对象Connection*/
//public class DBUtil {
//    private static Connection connection;
//    static DataSource dataSource=null;
//    static {
//        Properties properties = new Properties();
//        try {
////            Class.forName("com.mysql.jdbc.Driver");
////            setConnection(DriverManager.getConnection("jdbc:mysql://localhost:3306/wordmanager", "root", "2810666"));
//            //获取配置信息,将内容保存到properties对象里面
//            properties.load(DBUtil.class.getClassLoader().getResourceAsStream("dbcp.properties"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //得到连接池对象,将配置信息指定给连接池对象
//        try {
//            dataSource = BasicDataSourceFactory.createDataSource(properties);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//        public static Connection getConnection() {
//            try {
//                return dataSource.getConnection();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            return null;
//        }
//
//    public static void setConnection(Connection connection) {
//        DBUtil.connection =connection;
//    }
//
//    public void after() {
//        try
//        {
//            getConnection().close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//}

public class DBUtil {
    private static Connection connection;
    static DataSource dataSource=null;
    static {

        Properties properties = new Properties();
        try {
            //获取配置信息,将内容保存到properties对象里面
            properties.load( DBUtil.class.getClassLoader().getResourceAsStream( "dbcp.properties" ) );
        } catch (IOException e) {
            e.printStackTrace();
        }

        //得到连接池对象,将配置信息指定给连接池对象
        try {
            dataSource = BasicDataSourceFactory.createDataSource( properties );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void setConnection(Connection connection) {
        DBUtil.connection = connection;
    }

    public void after() {
        try {
            getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

