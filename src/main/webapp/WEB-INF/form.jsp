<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connection</title>
</head>
<body>
	<c:if test="${ !empty result }"><p><c:out value="${ result }" /></p></c:if>
        
    <form method="post" action="login">
    	<p>
        	<label for="login">Login : </label>
        	<input type="text" name="login" id="login" />
        </p>
        <p>
        	<label for="pass">Password : </label>
        	<input type="password" name="pass" id="login" />
        </p>  
        <input type="submit" />
    </form>
</body>
</html>