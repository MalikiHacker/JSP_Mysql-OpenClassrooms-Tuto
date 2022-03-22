<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bases de la Jstl</title>
</head>
<body>
	<c:set var="pseudo" value="Mateo21" scope="page" />
	<p><c:out value="${pseudo}"></c:out></p>
	modifier le nom de la variable
	<c:set var="pseudo" scope="page" >Def0rDie</c:set>
	<p><c:out value="${pseudo}"></c:out></p>
	Modifier l'attribut d'un bean
	<c:set target="${auteur}" property="prenom" value = "Maliki"/>
	<p><c:out value="${auteur.prenom}"></c:out></p>
</body>
</html>