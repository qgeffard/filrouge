package org.perso.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateClient extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("form_feed").isEmpty()){
			this.getServletContext().getRequestDispatcher( "/WEB-INF/createClient.jsp" ).forward( req, resp );
		} else {
//			creation de la commande
			this.getServletContext().getRequestDispatcher( "/WEB-INF/afficherClient.jsp" ).forward( req, resp );	
		}
	}
}
