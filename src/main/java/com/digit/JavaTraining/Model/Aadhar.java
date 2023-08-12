package com.digit.JavaTraining.Model;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class Aadhar {

	int AadharNumber;
	String Name;
	String Email;
	Long Phone;
	String Address;
	String City;
	String State;
	int PinCode;

	private Session session;

	public Aadhar() {

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());
		session = sessionFactory.openSession();
		System.out.println("Connected");

	}

	public void setAadharNumber(int Ano) {
		AadharNumber = Ano;
	}

	public int getAadharNumber() {
		return AadharNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Long getPhone() {
		return Phone;
	}

	public void setPhone(Long phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPinCode() {
		return PinCode;
	}

	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}

	public void generateaadhar() {
		Random r = new Random();
		int Ano = (100000 + r.nextInt(900000));
		AadharNumber = Ano;
	}

	public void saveObject(Aadhar a) {

		Transaction trn = session.beginTransaction();
		session.save(a);
		trn.commit();
		System.out.println("Object Saved!");

	}

	public void delete(int delano) {
		Transaction trn = session.beginTransaction();
		Aadhar a = (Aadhar) session.get(Aadhar.class, delano);
		session.delete(a);
		System.out.println("deleted successful");
		trn.commit();
	}

	public void update(int ano, String email) {
		Transaction trn = session.beginTransaction();
		Aadhar a = (Aadhar) session.get(Aadhar.class, ano);
		a.setEmail(email);
		session.update(a);
		System.out.println("Update successful");
		trn.commit();
	}

	public void view(int ano) {
		session.beginTransaction();

		Aadhar a = (Aadhar) session.get(Aadhar.class, ano);
		
		this.AadharNumber = a.getAadharNumber();
		this.Name = a.getName();
		this.Email = a.getEmail();
		this.Phone = a.getPhone();
		this.Address = a.getAddress();
		this.City = a.getCity();
		this.State = a.getState();
		this.PinCode = a.getPinCode();	    
	}
}
