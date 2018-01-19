<%@ page import="com.cl.util.Crud" %>
<%@ page import="java.util.List" %>
<%@ page import="com.cl.model.Borrow" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.cl.model.Books" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/19
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生借书信息</title>
</head>
<body>
<%
    Crud crud =new Crud();
    Integer SNo =Integer.valueOf((String)session.getAttribute("SNo"));
    out.print("<br/><br/><center>"+crud.selectStudent(SNo).getSName()+"::的借阅信息</center>");
    %>

    <table align="center" border="2 solid blue" style="width: 800px;border-collapse: collapse;border-color: aqua;">
        <tr>
            <th>已借书籍</th>
            <th>借出时间</th>
        </tr>
        <%

            List<Borrow> borrows = crud.selectBorrowBySNo(SNo);
            Iterator<Borrow> borrowIterator = borrows.iterator();
            Borrow borrow;
            while (borrowIterator.hasNext()){
                borrow=borrowIterator.next();
                out.print("<tr>");
                out.print("<td>"+crud.selectBooks(borrow.getISBN()).getBName()+"</td>");
                out.print("<td>"+borrow.getTime()+"</td>");
                out.print("</tr>");
            }
        %>
    </table>

<hr>
<h3 align="center">可借书籍</h3>
<table align="center" border="2 solid blue" style="width:800px;border-collapse: collapse;background-color: beige">
    <tr>
        <th>书籍编号</th>
        <th>书籍名</th>
        <th>作者</th>
    </tr>
    <%
        List<Books> books = crud.selectAllBooks();
        Iterator<Books> booksIterator = books.iterator();
        Books books1;
        while (booksIterator.hasNext()){
            books1 = booksIterator.next();
            out.print("<tr>");
            out.print("<td>"+books1.getISBN()+"</td>");
            out.print("<td>"+books1.getBName()+"</td>");
            out.print("<td>"+books1.getAuthor()+"</td>");
            out.print("</tr>");
        }
    %>

</table>
</body>
</html>
