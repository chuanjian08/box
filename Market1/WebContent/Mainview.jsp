<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>欢迎光临${param.username}</h1>
  
   <center>
   <form action="Mainview"  method='post'>
    <tr><td>产品信息查询</td></tr>
    <tr>
      <td>产品名称<input type="text" name="uname"></td>
      <td><input type="submit" name="btn1" value="查询">
          <input type="button" name="btn2" value="添加" onclick=location.href='Add.jsp'>
      </td>
    </tr>
    <table width=200px height=200px border=1>
    <tr>
     <td><input type=checkbox name=check /> </td>
     <td>产品名称</td>
     <td>产品产地</td>
     <td>产品价格</td>
    </tr>
   <c:forEach items="${list1}" var="c">
     <tr>
     <td><input type="checkbox" name="check" value="${c.name}"/> </td>
     <td><c:out value="${c.name}"></c:out></td>
     <td><c:out value="${c.address}"></c:out></td>
     <td><c:out value="${c.price}"></c:out></td>
     </tr>
    
      </c:forEach>
    </table>
   
    <input type="button" name="btn4" value="查看" onclick=location.href='Mainview1'>
     <input type="submit" name="btn3" value="删除">
   </form>   
    <a href='Page?pagesize=1&&pagenow=1' >首页</a>
    <a href='Page?i=-1'>上一页</a>
    <a href='Page?i=1'>下一页</a>
    <a href='Page?pagesize='>尾页</a>
   </center>
</body>

</html>
