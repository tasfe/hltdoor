package com.hltdoor;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by linwei on 2016/12/27.
 * get post 请求
 */
public class MyHttpRequest {

    public  String httpGet(String urlstr) {
        String result = "{\"status\":\"error\"}";
        try {
            URL url = new URL(urlstr);
            URLConnection rulConnection = url.openConnection();
            HttpURLConnection httpUrlConnection = (HttpURLConnection) rulConnection;

            InputStream inputStream = httpUrlConnection.getInputStream();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream));

            System.out.println(buffer.readLine());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String httpsGet(String urlstr)
    {
        String result = "{\"status\":\"error\"}";
        try {
            URL url = new URL(urlstr);
            URLConnection rulConnection = url.openConnection();
            HttpsURLConnection httpsUrlConnection = (HttpsURLConnection) rulConnection;

            InputStream inputStream = httpsUrlConnection.getInputStream();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(inputStream));

            result = buffer.readLine();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


}
