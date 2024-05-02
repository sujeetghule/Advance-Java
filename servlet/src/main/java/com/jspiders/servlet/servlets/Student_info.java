package com.jspiders.servlet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/student_info")
public class Student_info extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String[] cources = req.getParameterValues("cource");
		
		System.out.println("Name : "+ name);
		System.out.println("Emial : "+email);
		System.out.println("Mobile  : "+mobile);
		System.out.println("Subject Selected");
		for (String sub : cources) {
			System.out.print(sub+" ");
		}
		
	}
}
