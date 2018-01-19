<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/19
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>管理员登录</title>
    <script language="javascript">
        function isValid(form){
            if(form.MNo.value=="") {
                alert("用户名不能为空");
                return false;
            }
            else if(form.MPwd.value==""){
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
<form action="dologin2.jsp" name="managerForm" method="post" onSubmit="return isValid(this);">
    <table>
        <tr>
            <td>管理员编号</td>
            <td><input type="text" name="MNo" size="20"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="MPwd" size="20"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"></td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
</body>
</html>
