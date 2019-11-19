package com.qf.hougeng.dao;

import com.mysql.jdbc.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.*;

/**
 * @Classname JDBCTest
 * @Description TODO
 * @Date 2019/11/19 21:05
 * @Created by Hougeng
 */
public class JDBCTest {
    private Connection connection;
    //抽取Statement对象，让多个方法共享
    private static Statement statement;
    /*
    * 初始化代码，把初始化代码放入@Before修饰的方法中*/

    @Before
    public void before() throws SQLException,ClassNotFoundException {
//        注册驱动，连接数据库
        Class.forName("com.mysql.jdbc.Driver");
//        得到数据库连接Connection
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wordmanager","root","2810666");
        System.out.println("connection = " + connection);
//        得到Statement对象
        statement = connection.createStatement();
    }

    @After
    public void after() {
//        关闭statement对象
        try {
            statement.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }

//        关闭connection对象
        try {
            connection.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException{
//        执行sql语句

    }

    /*
使用单元测试演示表的插入
 */
    @Test
    public void testInsert() throws SQLException, ClassNotFoundException {
        String sql = "insert into word(id,english,chinese,comm) values (11,'person','人','仅供测试')";
        executeSql(sql);

    }

    private void executeSql(String sql) throws SQLException {
        statement.executeUpdate(sql);
    }

    @Test
    public void testDelete() throws SQLException {
        String sql = "delete from word where id=2";
        executeSql(sql);
    }

    @Test
    public void testSelect() throws SQLException {
//        通过executeQuery得到结果集ResultSet
        ResultSet resultSet = statement.executeQuery("select * from word");
        //       遍历当前表中所有的值,直到遍历完成
        while (resultSet.next()) {
            System.out.println(resultSet.getObject(1));
            System.out.println(resultSet.getObject(2));
            System.out.println(resultSet.getObject(3));
            System.out.println(resultSet.getObject(4));
            System.out.println(" ================================= ");
        }
    }

//    查询某个单词的翻译，如果有就返回中文，没就返回null
    @Test
    public void testSelectByEnglish() throws SQLException {
        String str ="english";
        ResultSet resultSet = statement.executeQuery("select * from word where english=' "+str+" '");
        if (resultSet.next()){
            System.out.println("resultSet.getObject(\"chinese\") = " + resultSet.getObject("chinese"));
        } else {
            System.out.println("没有查到");
        }
    }

}
