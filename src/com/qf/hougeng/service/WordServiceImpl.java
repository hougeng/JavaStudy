package com.qf.hougeng.service;

import com.qf.hougeng.bean.Word;
import com.qf.hougeng.dao.WordDAO;
import com.qf.hougeng.dao.impl.WordDAOImpl;

import java.sql.SQLException;
import java.util.List;

/**
 * @Classname WordServiceImpl
 * @Description TODO
 * @Date 2019/11/21 15:14
 * @Created by Hougeng
 */
public class WordServiceImpl implements WordService {
    //    因为要在Service调动DAO的数据,所以在Service要声明一个DAO对象,然后在构造器构建即可
    private WordDAO wordDAO;

    public WordServiceImpl() {
        this.wordDAO = new WordDAOImpl();
    }

    @Override
    public void add(Word word) throws SQLException {

    }

    @Override
    public String getChineseByEng(String english) {
        return null;
    }

    @Override
    public List<Word> getList() {
        return wordDAO.getList();
    }

    @Override
    public void delete(int id) {
        wordDAO.delete(id);
    }
}
