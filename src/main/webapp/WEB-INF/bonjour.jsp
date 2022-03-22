<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>
        <p>Paix et Bénédictions sur vous ! </p>
        <%@ include file="menu.jsp" %>
        <p>
    <%
        String heure = (String) request.getAttribute("heure");
        if (heure.equals("jour")) {
            out.println("Bonjour"); 
        }
        else {
            out.println("Bonsoir");
        }
        String name = (String) request.getAttribute("name");
        out.println(name);
    %>
		</p>
		<p>
    <%
        for (int i = 0 ; i < 3 ; i++) {
            out.println("Je suis ligne numéro " + i +" !<br />");
        }
    %>
		</p>
    </body>
</html>