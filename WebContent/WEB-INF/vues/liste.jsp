<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css"><%@ include file="bootstrap.min.css" %></style>
<%@ include file="Menu.jsp"%>
</head>
<body>
<table class="table table-sm">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Formation</th>
    </tr>
  </thead>
<c:forEach items="${formations}" var="formation">
<tbody>
    <tr>
      <td>${formation.id}</td>
      <td>${formation.theme}</td>
    </tr>
</tbody>
</c:forEach>
</table>

</body>
</html>