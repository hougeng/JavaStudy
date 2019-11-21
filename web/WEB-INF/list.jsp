<%@ page import="com.qf.hougeng.bean.Word" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: liyeh
  Date: 2019/11/21
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>列表输出</title>
</head>
<body>
<h1>这个是List页面</h1>

<table border="1">
    <tr>
        <td>ID</td>
        <td>英文</td>
        <td>中文</td>
        <td>类别</td>
        <td>备注</td>
    </tr>

    <%
        //从后段拿到List数据,进行前端的展示
        List<Word> list = (List<Word>) request.getAttribute("list");

        //通过循环遍历,打印出每一行数据到table中
        for (Word word : list) {
            out.write("<tr>");
            out.write("<td>"+word.getId()+"</td>");
            out.write("<td>"+word.getEnglish()+"</td>");
            out.write("<td>"+word.getChinese()+"</td>");
            out.write("<td>"+word.getType()+"</td>");
            out.write("<td>"+word.getComm()+"</td>");
            out.write("</tr>");
        }
    %>

</table>
</body>
</html>
