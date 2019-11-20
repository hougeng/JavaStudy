package com.qf.hougeng.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.time.chrono.JapaneseEra.values;

/**
 * @Classname WordDAO
 * @Description TODO
 * @Date 2019/11/20 8:52
 * @Created by Hougeng
 */
//定义一个WordDAO来操作数据库文件
public class WordDAO {
    private Connection connection=DBUtil.getConnection();
//    定义一个方法，对word进行添加
    public void add(int id,String english,String chinese,String type,String comm) throws SQLException{
//        定义一个sql的预编译语法
        String sql = "insert into word(id,english,chinese,type,comm) values (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        int index=1;

//        给预编译参数进行传值
        preparedStatement.setObject(index++,id);
        preparedStatement.setObject(index++,english);
        preparedStatement.setObject(index++,chinese);
        preparedStatement.setObject(index++,type);
        preparedStatement.setObject(index++,comm);

//        执行sql
        preparedStatement.executeUpdate();
    }
}
