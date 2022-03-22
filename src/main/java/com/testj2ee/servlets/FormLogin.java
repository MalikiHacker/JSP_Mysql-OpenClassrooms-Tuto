package com.testj2ee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testj2ee.forms.ConnectionForm;

/**
 * Servlet implementation class FormLogin
 */
@WebServlet("/FormLogin")
public class FormLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String nom = request.getParameter("nom");        
      request.setAttribute("nom", nom);
      
      ConnectionForm verification = new ConnectionForm();
      
      verification.verifierIdentifiants(request);
      
      String resultat = verification.getResultat();
      request.setAttribute("result", resultat);
      
      this.getServletContext().getRequestDispatcher("/WEB-INF/form.jsp").forward(request, response);
	}

}
