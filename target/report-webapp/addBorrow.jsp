<%@ page import="com.cl.util.Crud" %>
<%@ page import="com.cl.model.Borrow" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/19
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增记录</title>
</head>
<body>

<%
    Crud crud = new Crud();
    request.setCharacterEncoding("utf-8");
    Integer SNo = Integer.valueOf(request.getParameter("SNo"));
    Integer ISBN = Integer.valueOf(request.getParameter("ISBN"));
    String time = request.getParameter("time");
    crud.insertBorrow(SNo,ISBN,time);
%>
<jsp:forward page="manBorrow.jsp"/>

</body>
</html>
