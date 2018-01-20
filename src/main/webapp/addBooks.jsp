<%@ page import="com.cl.util.Crud" %>
<%@ page import="com.cl.model.Books" %><%--
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
    Books books = crud.selectBooks(ISBN);
    if(books==null){
        crud.insertBooks(ISBN,BName,author,rest);
    }else{
        crud.updateBooks(ISBN,BName,author,rest+crud.selectBooks(ISBN).getRest());
    }
%>
<jsp:forward page="booksList.jsp"/>
</body>
</html>
