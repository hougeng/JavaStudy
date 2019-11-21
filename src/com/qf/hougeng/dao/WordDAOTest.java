package com.qf.hougeng.dao;

import com.qf.hougeng.bean.Word;
import com.qf.hougeng.dao.impl.WordDAOImpl;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * @Classname WordDAOTest
 * @Description TODO
 * @Date 2019/11/21 8:59
 * @Created by Hougeng
 */
//public class WordDAOTest {
//    private WordDAO wordDAO;
//
//    @Before
//    public void before() {
//        wordDAO = new WordDAO();
//    }
//
//    @Test
////    测试数据表插入】
//    public void TestAdd() throws SQLException {
//        wordDAO.add(12,"pc","电脑","工具","测试");
//        System.out.println("Test OK");
//        }
//    @Test
////测试通过对象传值
//    public void TestAddByObject() throws SQLException {
//        Word word = new Word();
//        word.setId(13);
//        word.setEnglish("database");
//        word.setChinese("数据库");
//        word.setType("计算机");
//        word.setComm("测试使用");
//
//        wordDAO.add(word);
//    }
//
//    @Test //测试英中转换
//    public void TestGetChineseByEng() throws SQLException {
//        String database = wordDAO.getChineseByEng("database");
//        System.out.println("database = " + database);
//    }
//
//    @Test //先写测试用例,再写具体的实现代码,这种模式叫做测试驱动开发(TDD)
//    public void testGetList() {
//        List<Word> list = wordDAO.getList();
//        System.out.println("list = " + list);
//    }
//
//    @Test  //演示了一个删除操作
//    public void testDelete(){
//        wordDAO.delete(2);
//    }
//
//}

public class WordDAOTest {

    private WordDAOImpl wordDAO;

    @Before
    public void before(){
        wordDAO = new WordDAOImpl();
    }

    @Test
    /*
    测试数据库表的插入
     */
    public void testAdd() throws SQLException {
        wordDAO.add(12,"pc","电脑","工具","测试");
    }

    @Test //测试通过对象传值
    public void testAddByObject() throws SQLException {
//        创建一个Word对象,并且通过set方法赋值
        Word word = new Word();
        word.setId(13);
        word.setEnglish("database");
        word.setChinese("数据库");
        word.setType("计算机");
        word.setComm("测试使用");

//        演示通过对象插入Word对象
        wordDAO.add(word);
    }

    @Test //测试传入英文单词得到中文释义,如果查不到,返回为null
    public void testGetChineseByEng() throws SQLException {
        String database = wordDAO.getChineseByEng("database");
        System.out.println("database = " + database);
    }

    @Test //先写测试用例,再写具体的实现代码,这种模式叫做测试驱动开发(TDD)
    public void testGetList() {
        List<Word> list = wordDAO.getList();
        System.out.println("list = " + list);
    }

    @Test  //演示了一个删除操作
    public void testDelete(){
        wordDAO.delete(2);
    }
}
