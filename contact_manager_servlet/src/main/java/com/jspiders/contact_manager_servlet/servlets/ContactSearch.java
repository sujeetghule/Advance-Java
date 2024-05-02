package com.jspiders.contact_manager_servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.contact_manager_servlet.JDBC.ContactJDBC;
import com.jspiders.contact_manager_servlet.entity.Contact;

@WebServlet("/search")
public class ContactSearch extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		String name = req.getParameter("name");
		String col = req.getParameter("inp");
		PrintWriter writer = resp.getWriter();
		writer.println(name);
		writer.println(col);

		List<Contact> contacts = ContactJDBC.select(col, name);

		if (contacts != null && contacts.size() > 0) {
			req.setAttribute("list", contacts);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Search.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			writer.println("<h1>Contacts not found</h1>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("404notfound.jsp");
			requestDispatcher.forward(req, resp);
		}

	}

}
