<%@ page import="com.cl.model.Student" %>
<%@ page import="com.cl.util.Crud" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/19
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息页面</title>
</head>
<body>
<table align="center" border="2 solid blue" style="width:800px;border-collapse: collapse;background-color: beige">
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>密码</th>
        <th>年龄</th>
        <th>性别</th>
    </tr>
    <%
        Crud crud = new Crud();
        List<Student> students = crud.selectAllStudent();
        Iterator<Student> studentIterator = students.iterator();
        Student student;
        while(studentIterator.hasNext()) {
            student = studentIterator.next();
            out.print("<tr>");
            out.print("<td>"+student.getSNo()+"</td>");
            out.print("<td>"+student.getSName()+"</td>");
            out.print("<td>"+student.getSPwd()+"</td>");
            out.print("<td>"+student.getSAge()+"</td>");
            out.print("<td>"+student.getSSex()+"</td>");
            out.print("</tr>");
        }
    %>
</table>
<p><a href="manBorrow.jsp">返回管理员主页</a> </p>
</body>
</html>
