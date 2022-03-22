package com.testj2ee.beans;

public class Utilisateur {

	String nom;
	String prenom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) throws BeanException {
        if (nom.length() > 10) {
            throw new BeanException("Erreur Le nom est trop grand ! (10 caract�res maximum)");
        }
        
        else if (nom.length() < 1) {
        	throw new BeanException("Erreur : Le nom est trop petit ! (2 caract�res au minimum)");
        }
        else {
            this.nom = nom; 
        }
    }
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) throws BeanException {
		if (prenom.length() > 35) {
            throw new BeanException("Erreur Le pr�nom est trop grand ! (35 caract�res maximum)");
        }
        
        else if (prenom.length() < 1) {
        	throw new BeanException("Erreur : Le pr�nom est trop petit ! (2 caract�res au minimum)");
        }
        else {
            this.prenom = prenom; 
        }
	}
}
