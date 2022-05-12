package com.singashi.controller;
import java.io.IOException;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class ChargingCustomer extends HttpServlet{
	
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("amount"));
		
		
		
	
		
//		HttpClient client = HttpClients.custom().build();
//		HttpUriRequest request = RequestBuilder.get()
//				.setUri("http://localhost:8080/api/smart-store/payment/charge/status")
//				.setHeader("merchantID", "ABCDEFPVUTQXU1")
//				.build();

		//client.execute(request);
		
		

		//res.getWriter().println(i);
		System.out.println(i);
		
		
	}

}
