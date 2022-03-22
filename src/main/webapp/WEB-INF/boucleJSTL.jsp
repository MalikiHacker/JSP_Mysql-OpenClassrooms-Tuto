<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Les boucles en JSTL</title>
</head>
<body>
	<p>equivalent à for(i inferieur ou egal à 10)</p>
	<c:forEach var="i" begin="0" end="10" step="2">
		<p>Un message n`<c:out value="${i}"></c:out> !</p>
	</c:forEach>
	Pour parcourir des tableaux
	<c:forEach items="${ titres }" var="titre" begin="0" end="2">
		<p><c:out value="${ titre }"></c:out></p>
	</c:forEach>
	status.count commence de 1 a titre.lenght
	<c:forEach items="${ titres }" var="titre" varStatus="status">
		<p>N`<c:out value="${ status.count }"/> : <c:out value="${ titre }"></c:out></p>
	</c:forEach>
	par contre status.index commence de 0 a titres.lenght - 1
	status.current indique l'element courant
	status.fisrt (status.last) renvoie true si on est au premier element
	boucles for pour les chaines de characteres
	<c:forTokens var="morceau" items="Un élément/Encore un autre élément/Un dernier pour la route" delims="/ ">
    	<p>${ morceau }</p>
	</c:forTokens>
	delimite la chaine a chaque fois qu'il y a un slash(/) et un espace dans la chaine de characteres.
</body>
</html>