<%@ page import="com.cl.util.Crud" %>
<%@ page import="com.cl.util.RestDays" %>
<%@ page import="java.util.List" %>
<%@ page import="com.cl.model.Student" %>
<%@ page import="com.cl.model.Borrow" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/19
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员管理页面</title>
</head>
<body>
<%
    Crud crud = new Crud();
    Integer MNo =Integer.valueOf((String)session.getAttribute("MNo"));
    out.print("<center>"+crud.selectManager(MNo).getMName()+"的管理页面</center>");
    List<Borrow> borrows = crud.selectAllBorrow();
%>
<table align="center" border="2 solid blue" style="width:800px;border-collapse: collapse;background-color: beige">
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>所借书籍名</th>
        <th>所借书籍ISBN</th>
        <th>借阅开始时间</th>
        <th>剩余借阅时间</th>
    </tr>
    <%
        Iterator<Borrow> borrowIterator = borrows.iterator();
        Borrow borrow;
        while(borrowIterator.hasNext()) {
            borrow = borrowIterator.next();
            out.print("<tr>");
            out.print("<td>"+borrow.getSNo()+"</td>");
            out.print("<td>"+crud.selectStudent(borrow.getSNo()).getSName()+"</td>");
            out.print("<td>"+crud.selectBooks(borrow.getISBN()).getBName()+"</td>");
            out.print("<td>"+borrow.getISBN()+"</td>");
            out.print("<td>"+borrow.getTime()+"</td>");
            out.print("<td>"+(60L-RestDays.restDaysGet(borrow.getTime()))+"天</td>");

            out.print("</tr>");
        }
    %>

</table>
<div style="float: left">
<form action="delete.jsp" method="post" style="margin-left: 250px;">
    <table>
        <tr>
            <td>删除记录</td>
        </tr>
        <tr>
            <td>学号</td>
            <td><input type="text" name="SNo"></td>
        </tr>
        <tr>
            <td>ISBN</td>
            <td><input type="text" name="ISBN"></td>
        </tr>
        <tr>
            <td><input type="submit" value="删除"></td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
</div>
<div style="float: left;">
<form action="addBorrow.jsp" method="post" style="margin-left: 250px">
    <table>
        <tr>
            <td>新增记录</td>
        </tr>
        <tr>
            <td>学号</td>
            <td><input type="text" name="SNo"></td>
        </tr>
        <tr>
            <td>ISBN</td>
            <td><input type="text" name="ISBN"></td>
        </tr>
        <tr>
            <td>借出时间</td>
            <td><input type="date" name="time" ></td>
        </tr>
        <tr>
            <td><input type="submit" value="添加"></td>
            <td><input type="reset" value="重置" ></td>
        </tr>
    </table>
</form>
</div>
<hr width="1300px" size="3px" color="red">
<div style="float: left">
    <form action="addBooks.jsp" method="post" style="margin-left: 250px;">
        <table>
            <tr>
                <td>新增图书</td>
            </tr>
            <tr>
                <td>ISBN</td>
                <td><input type="text" name="ISBN"></td>
            </tr>
            <tr>
                <td>书名</td>
                <td><input type="text" name="BName"></td>
            </tr>
            <tr>
                <td>作者</td>
                <td><input type="text" name="author"></td>
            </tr>
            <tr>
                <td>剩余量</td>
                <td><input type="text" name="rest"></td>
            </tr>
            <tr>
                <td><input type="submit" value="添加"></td>
                <td><input type="reset" value="重置"></td>
            </tr>
        </table>
    </form>
</div>
<div style="float: left">
    <form action="addStudent.jsp" method="post" style="margin-left: 250px">
        <table>
            <tr>
                <td>新增学生</td>
            </tr>
            <tr>
                <td>学号</td>
                <td><input type="text" name="SNo"></td>
            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="SName"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="SPwd" ></td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="SAge"></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="text" name="SSex"></td>
            </tr>
            <tr>
                <td><input type="submit" value="添加"></td>
                <td><input type="reset" value="重置" ></td>
            </tr>
        </table>
    </form>
</div>
<div style="float: left">
<table>
    <tr>
        <td style="width: 50px;"></td>
        <td><a href="stuList.jsp">学生信息页面</a> </td>
        <td><a href="booksList.jsp">图书信息页面</a></td>
    </tr>
</table>
</div>
</body>
</html>
