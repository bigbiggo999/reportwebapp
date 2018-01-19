<%@ page import="com.cl.util.Crud" %>
<%@ page import="com.cl.model.Manager" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/19
  Time: 10:34
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
    Integer MNo=Integer.valueOf(request.getParameter("MNo"));
    String MPwd = request.getParameter("MPwd");
    session.setAttribute("MNo",request.getParameter("MNo"));
    session.setAttribute("MPwd",MPwd);
    Crud crud=new Crud();
    Manager manager = crud.selectManager(MNo);
    if(manager==null){
%>
    <jsp:forward page="error.jsp" />
<%
}
    else{
        String pwd = manager.getMPwd();
        if(pwd.equals(MPwd)){
%>
            <jsp:forward page="manBorrow.jsp" />
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
