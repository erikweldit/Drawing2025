package com.example.application.under;




import java.awt.Taskbar.State;
import java.io.*;
import java.net.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;
/**
 *
 * Send message to user
 * Not in use in these version
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */

public class SendResponse  {
    public static String postRequest = "";
    public static String postParameters = "";
    public static String postResponsCode= "";
    private final static String USER_AGENT = "Mozilla/5.0";
    private static String csrf;
    static String file;
    static String userID;

    public SendResponse( String filnavn)   throws Exception {
        this.file = filnavn;
        //	System.out.println(fil);
        //   sendGet();
        //     Welding window = new Welding();
        //     userID = window.userID;
        sendPost();
    }

    public void start(State primaryStage) {

    }








    public static void connectionHttp(){

    }

    // HTTP GET request
    private static void sendGet() throws Exception {

        String url = "http://xxx.xxx.com/api/documents/41/reglements";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // strip out your required data with a regex
        Pattern pattern = Pattern.compile(".*<input type=\"hidden\" name=\"_token\" value=\"(.*?)\">.*");
        Matcher matcher = pattern.matcher(response.toString());

        if (matcher.find()) {
            System.out.println(matcher.group(1));
            csrf = matcher.group(1);
            sendPost();
        }
        //print result
        System.out.println(response.toString());

    }

    // HTTP POST request
    private static void sendPost() throws Exception {

        String url = "http://weldit.weldit.no/api/images";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        String outString = "name=" + file + "&password=" + userID + "&_token=" ;
        String urlParameters = outString + csrf;
        //        String urlParameters = file + csrf;
        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
       System.out.println("Sending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
       System.out.println("Response Code : " + responseCode);
        postRequest = ""+"Sending 'POST' request to URL : " + url;
        postParameters =""+ "Post parameters : " + urlParameters;
        postResponsCode =""+ "Response Code : " + responseCode;
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
//	            response.append(inputLine);
        }
        in.close();

        //print result
        //        System.out.println(response.toString());

    }
}




