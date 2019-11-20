package com.qf.hougeng.bean;

/**
 * @Classname Word
 * @Description TODO
 * @Date 2019/11/20 9:01
 * @Created by Hougeng
 */

/*定义一个Bean，用来接收或传递word表中的数据
* */
public class Word {
    private Integer id;
    private String english;
    private String chinese;
    private String type;
    private String comm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                        ",english='" + english + '\'' +
                        ", chinese='" + chinese + '\'' +
                        ", type='" + type + '\'' +
                        ", comm='" + comm + '\'' +
                        '}';
    }

}
