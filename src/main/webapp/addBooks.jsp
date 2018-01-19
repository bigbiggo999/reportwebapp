<%@ page import="com.cl.util.Crud" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/19
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    Crud crud =new Crud();
    request.setCharacterEncoding("utf-8");
    Integer ISBN = Integer.valueOf(request.getParameter("ISBN"));
    String BName = request.getParameter("BName");
    String author = request.getParameter("author");
    Integer rest = Integer.valueOf(request.getParameter("rest"));
    crud.insertBooks(ISBN,BName,author,rest);
%>
<jsp:forward page="booksList.jsp"/>
</body>
</html>
