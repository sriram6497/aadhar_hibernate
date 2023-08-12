package com.digit.JavaTraining.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.digit.JavaTraining.Model.Aadhar;

@WebServlet("/Register")
public class Register extends HttpServlet{
	private Session session;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Aadhar a = new Aadhar();
		
		a.generateaadhar();
		a.setName(req.getParameter("name"));
		a.setEmail(req.getParameter("email"));
		a.setPhone(Long.parseLong(req.getParameter("phone")));
		a.setAddress(req.getParameter("address"));
		a.setCity(req.getParameter("city"));
		a.setState(req.getParameter("state"));
		a.setPinCode(Integer.parseInt(req.getParameter("pincode")));
		
		a.saveObject(a);
		
		resp.sendRedirect("/aadhar_Hibernate1/registersuccess.html");
	}
}
