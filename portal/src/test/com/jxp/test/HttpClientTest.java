package com.jxp.test;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jason
 * Date: 2018/4/29
 * Time: 14:30
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class HttpClientTest {
    @Test
    public void doGet() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://www.baidu.com");
        // 执行请求,返回结果
        CloseableHttpResponse response = httpClient.execute(httpGet);
        // 获取请求头
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        HttpEntity entity = response.getEntity();
        System.out.println(EntityUtils.toString(entity,"UTF-8"));
        // 关闭
        response.close();
        httpClient.close();

    }
    @Test
    public void doGetWithParam() throws URISyntaxException, IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        URIBuilder uriBuilder = new URIBuilder("https://www.sogou.com/web");
        uriBuilder.addParameter("query", "我操");
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        CloseableHttpResponse response = httpClient.execute(httpGet);
        // 获取请求头
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        HttpEntity entity = response.getEntity();
        System.out.println(EntityUtils.toString(entity,"UTF-8"));
        // 关闭
        response.close();
        httpClient.close();

    }

    @Test
    public void doPost() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost("http://localhost:8082/post");

        CloseableHttpResponse response = httpClient.execute(post);
        response.getStatusLine().getStatusCode();
        HttpEntity entity = response.getEntity();
        System.out.println(EntityUtils.toString(entity,"utf-8"));

    }
    @Test
    public void doPostWithParam() throws IOException {
        // 建立连接
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 创建post对象
        HttpPost post = new HttpPost("http://localhost:8082/post.html");
        List<NameValuePair> list = new ArrayList<>();
        list.add(new BasicNameValuePair("name", "这种"));
        list.add(new BasicNameValuePair("age", "222"));
        // 包装成一个实体
        StringEntity entity = new UrlEncodedFormEntity(list,"utf-8");
        post.setEntity(entity);
        // 执行post请求
        CloseableHttpResponse response = httpClient.execute(post);
        response.getStatusLine().getStatusCode();
        // 返回code
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        // 返回内容体
        HttpEntity entity1 = response.getEntity();
        System.out.println(EntityUtils.toString(entity1,"UTF-8"));
        // 关闭
        response.close();
        httpClient.close();

    }
}
