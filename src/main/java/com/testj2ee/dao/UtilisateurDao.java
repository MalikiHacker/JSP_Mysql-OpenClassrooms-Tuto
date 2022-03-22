package com.testj2ee.dao;

import java.util.List;

import com.testj2ee.beans.Utilisateur;

public interface UtilisateurDao {

	void ajouter( Utilisateur utilisateur ) throws DaoException;
    List<Utilisateur> lister() throws DaoException;
}
