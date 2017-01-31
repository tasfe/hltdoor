package com.hltdoor.wechat;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by zlinw on 2016/9/15.
 * http
 */
public class HttpRequestUtil {

    private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(HttpRequestUtil.class.getName());
    public JSONObject httpPost(JSONObject jsonObject, String url) throws UnsupportedEncodingException {
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        HttpClient httpClient = httpClientBuilder.build();
        HttpPost httpPost = new HttpPost(url);
        StringEntity entity = new StringEntity(jsonObject.toString(), "utf-8");
        entity.setContentEncoding("UTF-8");
        entity.setContentType("application/json");
        httpPost.setEntity(entity);
        JSONObject json = JSON.parseObject("{\"status\":\"error\"}");

        try {

            HttpResponse httpResponse = httpClient.execute(httpPost);

            json = JSON.parseObject(EntityUtils.toString(httpResponse.getEntity(),"utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;

    }


    public JSONObject httpGet(String url)
    {
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        HttpClient httpClient = httpClientBuilder.build();
        HttpGet httpGet = new HttpGet(url);
        JSONObject result = JSON.parseObject("{\"status\":\"error\"}");
        try {
            HttpResponse httpResponse = httpClient.execute(httpGet);

            result = JSON.parseObject(EntityUtils.toString(httpResponse.getEntity(),"utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
