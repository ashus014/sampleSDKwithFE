package com.singashi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.singashi.entity.Employee;

public class AddServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int result = i+j;
		
		Employee emp1 =new Employee(11, "Ashu Singh", 40000);
		
		req.setAttribute("result", emp1);
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		
		RequestDispatcher rd = req.getRequestDispatcher("hello");
		rd.forward(req, res);
		
	}

}
