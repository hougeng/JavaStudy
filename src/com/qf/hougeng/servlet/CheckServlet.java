package com.qf.hougeng.servlet;

import com.qf.hougeng.dao.impl.WordDAOImpl;
import com.qf.hougeng.dao.impl.WordDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 定义第一个Servlet专门用来出来/check请求,默认的Servlet继承于HttpServlet
 */
@WebServlet("/check")
public class CheckServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    /*
    在Servlet默认要覆写doGet和doPost方法,他们用来处理用户的get和post请求
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("CheckServlet.doPost");
//        Request对象用来放置前端用户传来的请求,包括参数

//        因为utf-8是国际编码,默认情况下可以接受任意语言,通常用来解决乱码问题
        req.setCharacterEncoding("utf-8");

//        req.getParameter()用来获取前端传入的参数
        String english = req.getParameter("english");
        String chinese = req.getParameter("chinese");

        WordDAOImpl wordDAO=new WordDAOImpl();
        //根据用户传入的英文,查出数据库中对于的中文
        String chineseByEng = wordDAO.getChineseByEng(english);

//      把用户输入的中文chinese,和数据库中查询的中文chineseByEng相比较,如果相同,则回答正确,如果不同则回答错误
        if (chinese.equals(chineseByEng)) {
//            如果用户回答的中文和数据库中的中文一样,那么就跳转到ok.jsp页面
            req.getRequestDispatcher("ok.jsp").forward(req,resp);
        } else {//否则就跳转到失败页面
            req.getRequestDispatcher("fail.jsp").forward(req,resp);
        }
        System.out.println("chinese = " + chinese);
        System.out.println("english = " + english);
    }
}