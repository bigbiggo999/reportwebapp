<%@ page import="com.cl.util.Crud" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/19
  Time: 09:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>登录界面</title>
    <style type="text/css">
        body{
            background-image: url(/img/bg.jpg);
            background-size:cover;
        }
    </style>
</head>
<body>
<h1 align="center">浙工商图书借阅管理系统 0.1v</h1>
<br/><br/><br/><br/>
<hr>
<div align="center">
    <a href="student.jsp">学生登录页面</a>
    <a href="manager.jsp">管理员登录页面</a>
    <p>当前图书馆库存量:&nbsp&nbsp&nbsp<%
        Crud crud=new Crud();
        out.print(crud.selectAllBooksNum());
        out.print("<br/>默认借书时长:&nbsp&nbsp60天,请按时归还");
    %></p>

</div>

</body>
</html>
