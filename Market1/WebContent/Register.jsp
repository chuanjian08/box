<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ShowUser" method='post'>
		<table width=200px height=200px border=1>
			<tr>
				<td>xxxx超市欢迎你</td>
			</tr>
			<tr>
				<td>用户名<input type="text" name="username"></td>
			</tr>
			<tr>
				<td>密码<input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="text" name="numb" placeholder="请输入验证码"></td>
			</tr>
			<tr>
				<td><img src="CheckCodeServlet1" οnclick=location.href="CheckCodeServlet1" ></td>
			</tr>
			<tr>
				<td><input type=submit name=but1 value='注册'> 
				<input type=submit name=but2 value='登录'></td>
			</tr>
		</table>
	</form>
</body>
</html>