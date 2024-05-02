package com.jspiders.servlet.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/myservlet5")
public class MyServlet5 implements Servlet {

	static {
		System.out.println("My Servlet 5 is Loaded");
	}
	{
		System.out.println("Object Created For servlet");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init () is invoked");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service() is invoked");

	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy () is invoked");

	}

}
