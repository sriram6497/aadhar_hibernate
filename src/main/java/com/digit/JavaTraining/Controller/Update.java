package com.digit.JavaTraining.Controller;

import java.io.IOException;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.digit.JavaTraining.Model.Aadhar;

@WebServlet("/Update")
public class Update extends HttpServlet{
	
	private Session session;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int ano = Integer.parseInt(req.getParameter("ano"));
		String mail = req.getParameter("email");
		
		Aadhar a = new Aadhar();
		
		a.update(ano, mail);
		
		resp.sendRedirect("/aadhar_Hibernate1/updatesuccessful.html");
	}
}
