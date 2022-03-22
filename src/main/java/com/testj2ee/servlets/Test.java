package com.testj2ee.servlets;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testj2ee.beans.Auteur;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("heure", "soir");
		String name = request.getParameter("name");
	    request.setAttribute("name", name);
	    String[] noms = {"Mathieu", "Robert", "François"};
        request.setAttribute("noms", noms);
        String[] titres = {"Nouvel incendie", "Une ile a ete decouverte", "Chute du dollar", "Et quoi d'autre"};
        request.setAttribute("titres", titres);
        Auteur auteur = new Auteur();
        auteur.setPrenom("Mathieu");
        auteur.setNom("Nebra");
        auteur.setActif(true);
        
        request.setAttribute("auteur", auteur);
		this.getServletContext().getRequestDispatcher("/WEB-INF/baseJSTL.jsp").forward(request, response);
//		response.setContentType("text/html");
//        response.setCharacterEncoding("UTF-8");
//        
//        PrintWriter out = response.getWriter();
//        out.println("<!DOCTYPE html>");
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<meta charset=\"utf-8\" />");
//        out.println("<title>Test</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<p>Bonjour !</p>");
//        out.println("</body>");
//        out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
