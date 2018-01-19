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
    Crud crud = new Crud();
    request.setCharacterEncoding("utf-8");
    Integer SNo = Integer.valueOf(request.getParameter("SNo"));
    String SName = request.getParameter("SName");
    String SPwd = request.getParameter("SPwd");
    Integer SAge =Integer.valueOf(request.getParameter("SAge"));
    String SSex = request.getParameter("SSex");
    crud.insertStudent(SNo,SName,SPwd,SAge,SSex);
%>
<jsp:forward page="stuList.jsp"/>
</body>
</html>
