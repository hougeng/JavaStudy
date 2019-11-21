package com.qf.hougeng.service;

import com.qf.hougeng.bean.Word;

import java.sql.SQLException;
import java.util.List;

/**
 * @Classname WordService
 * @Description TODO
 * @Date 2019/11/21 15:13
 * @Created by Hougeng
 */
public interface WordService {

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
