package com.singashi.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class ChargeStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		CloseableHttpClient httpClient =  HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://localhost:8081/api/smart-store/payment/charge/status");
		CloseableHttpResponse closeableHttpResponse =  httpClient.execute(httpGet);
		
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code : " + statusCode);
		
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		
		
		/*
		 * JSONObject responseJson; try { responseJson = new JSONObject(responseString);
		 * System.out.println("Response JSON from API call --> " + responseJson); }
		 * catch (JSONException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
			
			
			
		

		
		
		
	}

	

}
