package com.qf.hougeng.dao;

import com.qf.hougeng.bean.Word;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.time.chrono.JapaneseEra.values;

/**
 * @Classname WordDAO
 * @Description TODO
 * @Date 2019/11/20 8:52
 * @Created by Hougeng
 */
////定义一个WordDAO来操作数据库文件
//public class WordDAO {
////    private Connection connection=DBUtil.getConnection();
//    public WordDAO() {
//        connection = DBUtil.getConnection();
//    }
//    private Connection connection ;
////    定义一个方法，对word进行添加
//    public void add(int id,String english,String chinese,String type,String comm) throws SQLException{
////        定义一个sql的预编译语法
//        String sql = "insert into word(id,english,chinese,type,comm) values (?,?,?,?,?)";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        int index=1;
//
////        给预编译参数进行传值
//        preparedStatement.setObject(index++,id);
//        preparedStatement.setObject(index++,english);
//        preparedStatement.setObject(index++,chinese);
//        preparedStatement.setObject(index++,type);
//        preparedStatement.setObject(index++,comm);
//
////        执行sql
//        preparedStatement.executeUpdate();
//    }
//    /*
//通过对象传值来插入数据
// */
//    public void add(Word word) throws SQLException {
////        定义一个sql的预编译语法
//        String sql = "insert into word(id,english,chinese,type,comm) values (?,?,?,?,?)";
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        int index=1;
////        给预编译参数进行传值
//        preparedStatement.setObject(index++,word.getId());
//        preparedStatement.setObject(index++,word.getEnglish());
//        preparedStatement.setObject(index++,word.getChinese());
//        preparedStatement.setObject(index++,word.getType());
//        preparedStatement.setObject(index++,word.getComm());
////      执行sql
//        preparedStatement.executeUpdate();
//    }
//
//
//
//    /*
//    定义一个方法,通过英文得到中文
//     */
////    public String getChineseByEng(String english) throws SQLException {
//    public String getChineseByEng(String english)  {
//        String sql = "select chinese from word where english=?";
////        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//////       给preparestatement传参
////        preparedStatement.setObject(1,english);
//        PreparedStatement preparedStatement = null;
//        try {
//            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setObject(1, english);
//
////        ResultSet resultSet = preparedStatement.executeQuery();
////        if (resultSet.next()) {
////            return resultSet.getObject(1).toString();
//            ResultSet resultSet = preparedStatement.executeQuery();
//            if (resultSet.next()) {
//                return resultSet.getObject(1).toString();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        //       给preparestatement传参
//        return null;
//    }
//    /*
//定义一个方法,从数据库表中拿出对象,放入到Word对象中,最后以List方式返回
// */
//    public List<Word> getList() {
//        List<Word> list = new ArrayList<>();
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from word");
//            while (resultSet.next()) {
//                Word word=new Word();
//                word.setId(resultSet.getInt(1));
//                word.setEnglish(resultSet.getString(2));
//                word.setChinese(resultSet.getString(3));
//                word.setType(resultSet.getString("type"));
//                word.setComm(resultSet.getString("comm"));
//                list.add(word);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
////定义删除方法
//    public void delete(int id) {
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("delete from word where id=?");
//            preparedStatement.setObject(1,id);
//            int i = preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}

public interface WordDAO {
    //    定义一个方法,对word进行添加
    void add(int id, String english, String chinese, String type, String comm) throws SQLException;

    /*
        演示通过对象传值来插入数据
         */
    void add(Word word) throws SQLException;

    /*
        定义一个方法,通过英文得到中文
         */
    String getChineseByEng(String english);

    /*
        定义一个方法,从数据库表中拿出对象,放入到Word对象中,最后以List方式返回
         */
    List<Word> getList();

    void delete(int id);
}

