<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Mainview">
		<table width=300px height=300px border=1>
			<tr>
				<td>产品名称</td>
				<td><input type=text name=name1></td>
				<td>产品价格</td>
				<td><input type=text name=price></td>
			</tr>
			<tr>
				<td>产品产地</td>
				<td colspan='3'><input type=text name=address></td>
			</tr>
			<tr>
				<td>产品图片</td>
				<td colspan='3'><input type=file name=imagine></td>
			</tr>
			<tr>
				<td><input type=submit name=but1 value='确定'></td>
				<td><input type=submit name=but2 value='返回'></td>
			</tr>

		</table>


	</form>
</body>
</html>