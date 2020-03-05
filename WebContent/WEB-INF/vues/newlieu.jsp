<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css" %></style>
<%@ include file="Menu.jsp"%>
<title>Formualire Lieu</title>
</head>
<body>
<form action="/IntiFormation/newlieu" method="post">
<input type="text" name="ville" placeholder="Saisir la ville">
<input type="text" name="adress" placeholder="L'adresse du lieu">



<input type="submit" value="valider">
</form>

</body>
</html>