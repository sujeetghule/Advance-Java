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


@WebServlet("/contact")
public class ContactOP extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		if (dob == null|| dob.length()>0) {
			dob="2000-01-01";
		}
		System.out.println(dob);

		String mobile = req.getParameter("mobile");
		String category = req.getParameter("category");
		
		ContactJDBC.saveContact(fname,lname,mobile,email,dob,category);
		

//		resp.setContentType("text/html");
//		PrintWriter writer = resp.getWriter();
//		System.out.println("No of Rows Affested "+res);
//		writer.println("No of Rows Affested "+res);
//		
//		writer.println(fname+lname+email+dob+category+mobile);
		
		doGet(req, resp);
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Contact> contacts = ContactJDBC.allContacts();
		
		
		if(contacts != null && contacts.size() > 0) {
			req.setAttribute("list", contacts);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("contacts.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			resp.setContentType("text/html");
			PrintWriter writer = resp.getWriter();
			writer.println("<h1>Contacts not found</h1>");
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("404notfound.jsp");
			requestDispatcher.forward(req, resp);
			
		}
	}
	

}
