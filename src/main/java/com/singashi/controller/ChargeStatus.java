package src.main.java.com.singashi.controller;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.Header;
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

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:8085/api/smart-store/payment/charge/status");
        CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);

        //getting status code from response
        int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
        System.out.println("Status Code : " + statusCode);

        //converting the received response to UTF-8
        String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");


        //converting responseString to JSON Object
        JSONObject responseJson;
        try {
            responseJson = new JSONObject(responseString);
            System.out.println("Response JSON from API call --> " + responseJson);
        } catch (JSONException e) { // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //getting all headers from response
        Header[] headers = closeableHttpResponse.getAllHeaders();

        HashMap<String, String> allHeaders = new HashMap<>();

        for(Header temp : headers){
            allHeaders.put(temp.getName(), temp.getValue());
        }

        System.out.println("-----> Printing all the headers");
        allHeaders.entrySet().stream()
                        .forEach(s -> System.out.println(s.getKey() + ": " + s.getValue()));

        //System.out.println(responseString);
        request.setAttribute("result", responseString);
        //RequestDispatcher rd = req.getRequestDispatcher("sq");

        RequestDispatcher rd = request.getRequestDispatcher("hello");
        rd.forward(request, response);

    }


}
