package com.testj2ee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testj2ee.bdd.Noms;
import com.testj2ee.beans.SimpleUser;
//import com.testj2ee.beans.Utilisateur;
//import com.testj2ee.forms.ConnectionForm;

/**
 * Servlet implementation class TestFormular
 */
@WebServlet("/TestFormular")
public class TestFormular extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestFormular() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/bddOpcrms.jsp").forward(request, response);
    }

    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String nom = request.getParameter("nom");        
//        request.setAttribute("nom", nom);
//        
//        ConnectionForm verification = new ConnectionForm();
//        
//        verification.verifierIdentifiants(request);
//        
//        String resultat = verification.getResultat();
//        request.setAttribute("result", resultat);
        
        SimpleUser utilisateur = new SimpleUser();
        utilisateur.setNom(request.getParameter("nom"));
        utilisateur.setPrenom(request.getParameter("prenom"));
        
        Noms tableNoms = new Noms();
        tableNoms.ajouterUtilisateur(utilisateur);
        
        request.setAttribute("utilisateurs", tableNoms.recupererUtilisateurs());
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/bddOpcrms.jsp").forward(request, response);
    }

}
