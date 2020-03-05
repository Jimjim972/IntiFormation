<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css" %></style>
<%@ include file="Menu.jsp"%>
<title>Formulaire</title>
</head>
<body>
<form action="/IntiFormation/ajoutformation" method="post">
<input type="text" name="theme" placeholder="saisir le thème de la formation">
<div class="dropdown">
<select>
  <p data-toggle="dropdown">Choisir le lieu</p>
 
  <div class="dropdown-menu" name="lieux">
  <c:forEach items="${lieux}" var="lieu">
      <option value ="${lieu.idLieu}">${lieu.ville }</option>
    </div>
 </c:forEach>
 </select>
 </div>
<input type="submit" value="valider">
</form>

</body>
</html>