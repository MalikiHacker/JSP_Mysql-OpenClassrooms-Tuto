package com.testj2ee.forms;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	String resultat;
	
	public void verifierIdentifiants( HttpServletRequest request) {
		String pass = request.getParameter("pass");
		String login = request.getParameter("login");
		
		if(pass.equals(login + "123")) {
			resultat = "Bienvenue monsieur " + login + ", vous etes bien connectes!";
		}
		else {
			resultat = "Identifiants incorrects !!! :-(";
		}
	}
	
}
