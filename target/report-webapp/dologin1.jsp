<%@ page import="com.cl.util.Crud" %>
<%@ page import="com.cl.model.Student" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/19
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
    Integer SNo=Integer.valueOf(request.getParameter("SNo"));
    String SPwd = request.getParameter("SPwd");
    session.setAttribute("SNo",request.getParameter("SNo"));
    session.setAttribute("SPwd",SPwd);
    Crud crud=new Crud();
    Student student = crud.selectStudent(SNo);
    if(student==null){
        %>
        <jsp:forward page="error.jsp" />
<%
    }
    else{
        String pwd = student.getSPwd();
        if(pwd.equals(SPwd)){
            %>
        <jsp:forward page="stuBorrow.jsp" />
<%
        }
        else{
            %>
            <jsp:forward page="error.jsp" />
<%
        }
    }
%>
</body>
</html>
