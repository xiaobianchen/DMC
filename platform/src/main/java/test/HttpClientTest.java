package test;


import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/15
 */
public class HttpClientTest {

    public static void main(String[] args) throws Exception {
//        testGet("http://localhost:8080/platform/login");
        testPost("http://localhost:8080/platform/login");
    }

    public static void testGet(String url) {
        //创建一个默认的HttpClient
        HttpClient httpClient = new DefaultHttpClient();
        try {
            //以get方式请求网页
            HttpGet getMethod = new HttpGet(url);
            //打印请求地址
            System.out.println("executing request " + getMethod.getURI());

            //创建响应处理服务器响应内容
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            //执行请求并获取结果
            String responseBody = httpClient.execute(getMethod, responseHandler);

            System.out.println("--------------------------------");
            System.out.println(responseBody);
            System.out.println("--------------------------------");

        } catch (IOException e) {
            throw new RuntimeException("connection refuse error!");
        }finally {
            //当不需要HttpClient实例时, 关闭连接管理器以确保释放系统资源
            httpClient.getConnectionManager().shutdown();
        }
    }

    public static void testPost(String url) {
        //创建一个默认的HttpClient
        HttpClient httpClient = new DefaultHttpClient();
        try {
            //以post方式请求网页
            HttpPost postMethod = new HttpPost(url);

            //添加HTTP POST参数
            List<NameValuePair> nameValuePairList = new ArrayList<NameValuePair>();
            nameValuePairList.add(new BasicNameValuePair("username", "admin"));
            nameValuePairList.add(new BasicNameValuePair("password", "admin"));

            //将POST参数以UTF-8编码并包装成表单实体对象
            postMethod.setEntity(new UrlEncodedFormEntity(nameValuePairList, "UTF-8"));
            //打印请求地址
            System.out.println("executing request " + postMethod.getRequestLine().getUri());

            //创建响应处理服务器响应内容
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            //执行请求并获取结果
            String responseBody = httpClient.execute(postMethod, responseHandler);

            System.out.println("--------------------------------------");
            System.out.println(responseBody);
            System.out.println("--------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //当不需要HttpClient实例时, 关闭连接管理器以确保释放系统资源
            httpClient.getConnectionManager().shutdown();
        }
    }
}
