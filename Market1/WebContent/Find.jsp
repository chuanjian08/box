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
<!-- 查询界面 -->
   <form action="">
     <table width=300px height=300px border=1>
     <c:forEach items="${prod}" var="p">
     <tr>
     <td><c:out value="${p.name}"></c:out></td>
     </tr>
     <tr>
     <td><c:out value="${p.address}"></c:out></td>
     </tr>
     <tr>
     <td><c:out value="${p.price}"></c:out></td>
     </tr>
     <tr>
     <td><img src=img/${p.imagine}></td>
     </tr>
      </c:forEach>
     </table>
   </form>


</body>
</html>