<%--
  Created by IntelliJ IDEA.
  User: liyeh
  Date: 2019/11/21
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>单词测试页面</title>
</head>
<body>
<h2>单词测试页面</h2>
<form action="/check" method="post">
    英文: <input type="text" name="english"><br/>
    中文: <input type="text" name="chinese"><br/>
    <input type="submit" name="提交">
</form>
</body>
</html>
