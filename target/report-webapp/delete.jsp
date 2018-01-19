<%@ page import="com.cl.util.Crud" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/19
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>删除记录</title>
</head>
<body>
<%
    Crud crud = new Crud();
    request.setCharacterEncoding("utf-8");
    Integer SNo = Integer.valueOf(request.getParameter("SNo"));
    Integer ISBN = Integer.valueOf(request.getParameter("ISBN"));
    crud.deleteBorrow(SNo,ISBN);
%>
<jsp:forward page="manBorrow.jsp"/>
</body>
</html>
