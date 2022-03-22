package com.testj2ee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testj2ee.beans.Utilisateur;
import com.testj2ee.dao.DaoException;
import com.testj2ee.dao.DaoFactory;
import com.testj2ee.dao.UtilisateurDao;

/**
 * Servlet implementation class DAOServlet
 */
@WebServlet("/DAOServlet")
public class DAOServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UtilisateurDao utilisateurDao;

    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.utilisateurDao = daoFactory.getUtilisateurDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 try {
             request.setAttribute("utilisateurs", utilisateurDao.lister());
         }
         catch (DaoException e) {
             request.setAttribute("erreur", e.getMessage());
         }
        this.getServletContext().getRequestDispatcher("/WEB-INF/bddDao.jsp").forward(request, response);
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
    	try {
            Utilisateur utilisateur = new Utilisateur();
            utilisateur.setNom(request.getParameter("nom"));
            utilisateur.setPrenom(request.getParameter("prenom"));
            
            utilisateurDao.ajouter(utilisateur);
            request.setAttribute("utilisateurs", utilisateurDao.lister());
        }
        catch (Exception e) {
            request.setAttribute("erreur", e.getMessage());
        }
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/bddDao.jsp").forward(request, response);
    }

}
