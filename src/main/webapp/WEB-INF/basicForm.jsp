<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Formula</title>
</head>
<body>
	<c:if test="${ !empty nom }"><p><c:out value="Bonjour, vous vous appelez ${ nom }" /></p></c:if>
        
    <form method="post" action="connection">
        <label for="nom">Nom : </label>
        <input type="text" name="nom" id="nom" />
            
        <input type="submit" />
    </form>
</body>
</html>