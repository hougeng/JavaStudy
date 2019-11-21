package com.qf.hougeng.servlet;

/**
 * @Classname DeleteServlet
 * @Description TODO
 * @Date 2019/11/21 15:05
 * @Created by Hougeng
 */
import com.qf.hougeng.service.WordService;
import com.qf.hougeng.service.WordServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 定义一个DeleteServlet用来处理删除请求
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

//        先获取要删除的Id
        String id = req.getParameter("id");
        WordService wordService=new WordServiceImpl();
        wordService.delete(Integer.parseInt(id));
        writer.println(" (Delete OK123!)");

        //演示重定向,无须刷新页面,直接打开一个新的请求
        resp.sendRedirect("/list");
    }
}
