<%@ page import="com.cl.model.Books" %>
<%@ page import="com.cl.util.Crud" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/19
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书信息页面</title>
</head>
<body>
<table align="center" border="2 solid blue" style="width:800px;border-collapse: collapse;background-color: beige">
    <tr>
        <th>ISBN</th>
        <th>书名</th>
        <th>作者</th>
        <th>剩余量</th>
    </tr>
    <%
        Crud crud = new Crud();
        List<Books> books = crud.selectAllBooks();
        Iterator<Books> booksIterator = books.iterator();
        Books books1;
        while(booksIterator.hasNext()) {
            books1 = booksIterator.next();
            out.print("<tr>");
            out.print("<td>"+books1.getISBN()+"</td>");
            out.print("<td>"+books1.getBName()+"</td>");
            out.print("<td>"+books1.getAuthor()+"</td>");
            out.print("<td>"+books1.getRest()+"</td>");
            out.print("</tr>");
        }
    %>
</table>
<p><a href="manBorrow.jsp">返回管理员主页</a> </p>
</body>
</html>
