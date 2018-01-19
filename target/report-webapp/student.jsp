<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/19
  Time: 09:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>学生登录页面</title>
    <script language="javascript">
        function isValid(form){
            if(form.SName.value=="") {
                alert("用户名不能为空");
                return false;
            }
            else if(form.SPwd.value==""){
                alert("密码不能为空");
                return false;
            }
            else {
                return true;
            }
        }
    </script>
</head>
<body>
<div style="align-items: center">
<form action="dologin1.jsp" name="studentForm" method="post" onSubmit="return isValid(this);">
<table>
    <tr>
        <td>学号</td>
        <td><input type="text" name="SNo" size="20"></td>
    </tr>
    <tr>
        <td>密码</td>
        <td><input type="password" name="SPwd" size="20"></td>
    </tr>
    <tr>
        <td><input type="submit" value="登录"></td>
        <td><input type="reset" value="重置"></td>
    </tr>
</table>
</form>
</div>
</body>
</html>
