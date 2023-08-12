package com.digit.JavaTraining.Controller;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.digit.JavaTraining.Model.Aadhar;

@WebServlet("/delete")
public class Delete extends HttpServlet{

	private Session session;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int ano = Integer.parseInt(req.getParameter("ano"));
		Aadhar a = new Aadhar();
		
		a.delete(ano);
		resp.sendRedirect("/aadhar_Hibernate1/Delete.html");
	}
	
}
