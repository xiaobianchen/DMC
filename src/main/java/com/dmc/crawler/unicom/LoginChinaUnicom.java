//package com.dmc.crawler.unicom;
//
//import org.apache.http.Header;
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.ContentType;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.protocol.HTTP;
//import org.apache.http.util.Args;
//import org.apache.http.util.CharArrayBuffer;
//import org.apache.http.util.EntityUtils;
//
//import java.io.*;
//import java.nio.charset.Charset;
//import java.nio.charset.UnsupportedCharsetException;
//import java.text.ParseException;
//
///**
// * Created by xiaobianchen on 2015/12/23.
// * <p/>
// * 登录并抓取中国联通的数据
// */
//public class LoginChinaUnicom {
//
//    public static void main(String[] args) throws Exception{
//        String name = "18601705642";
//        String pwd = "489046";
//
//        String url = "https://uac.10010.com/portal/Service/MallLogin?callback=jQuery17202691898950318097_1403425938090&redirectURL=http%3A%2F%2Fwww.10010.com&userName=" + name + "&password=" + pwd + "&pwdType=01&productType=01&redirectType=01&rememberMe=1";
//
//        HttpClient httpClient = new DefaultHttpClient();
//        HttpGet httpGet = new HttpGet(url);
//        HttpResponse loginResponse = httpClient.execute(httpGet);
//
//        if (loginResponse.getStatusLine().getStatusCode() == 200) {
//            for (Header head : loginResponse.getAllHeaders()) {
//                System.out.println(head);
//            }
//            HttpEntity loginEntity = loginResponse.getEntity();
//            String loginEntityContent = EntityUtils.toString(loginEntity);
//            System.out.println("登录状态:" + loginEntityContent);
//            //如果登录成功
//            if (loginEntityContent.contains("resultCode:\"0000\"")) {
//
//                //月份
//                String months[] = new String[]{"201401", "201402", "201403", "201404", "201405"};
//
//                for (String month : months) {
//                    String billurl = "http://iservice.10010.com/ehallService/static/historyBiil/execute/YH102010002/QUERY_YH102010002.processData/QueryYH102010002_Data/" + month + "/undefined";
//
//                    HttpPost httpPost = new HttpPost(billurl);
//                    HttpResponse billresponse = httpClient.execute(httpPost);
//
//                    if (billresponse.getStatusLine().getStatusCode() == 200) {
//                        saveToLocal(billresponse.getEntity(), "chinaunicom.bill." + month + ".2.html");
//                    }
//                }
//            }
//        }
//    }
//
//
//    public static void saveToLocal(HttpEntity httpEntity, String filename) {
//        try {
//            File dir = new File("C:\\Users\\jchen19\\Desktop\\personal\\git\\DMC\\src\\main\\resources\\chinaunicom.txt");
//            if (!dir.isDirectory()) {
//                dir.mkdir();
//            }
//
//            File file = new File(dir.getAbsolutePath() + "/" + filename);
//            FileOutputStream fileOutputStream = new FileOutputStream(file);
//            InputStream inputStream = httpEntity.getContent();
//
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//            byte[] bytes = new byte[1024];
//            int length = 0;
//            while ((length = inputStream.read(bytes)) > 0) {
//                fileOutputStream.write(bytes, 0, length);
//            }
//            inputStream.close();
//            fileOutputStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static String toString(
//            final HttpEntity entity, final Charset defaultCharset) throws IOException, ParseException {
//        Args.notNull(entity, "Entity");
//        final InputStream instream = entity.getContent();
//        if (instream == null) {
//            return null;
//        }
//        try {
//            Args.check(entity.getContentLength() <= Integer.MAX_VALUE,
//                    "HTTP entity too large to be buffered in memory");
//            int i = (int)entity.getContentLength();
//            if (i < 0) {
//                i = 4096;
//            }
//            Charset charset = null;
//            try {
//                final ContentType contentType = ContentType.get(entity);
//                if (contentType != null) {
//                    charset = contentType.getCharset();
//                }
//            } catch (final UnsupportedCharsetException ex) {
//                throw new UnsupportedEncodingException(ex.getMessage());
//            }
//            if (charset == null) {
//                charset = defaultCharset;
//            }
//            if (charset == null) {
//                charset = HTTP.DEF_CONTENT_CHARSET;
//            }
//            final Reader reader = new InputStreamReader(instream, charset);
//            final CharArrayBuffer buffer = new CharArrayBuffer(i);
//            final char[] tmp = new char[1024];
//            int l;
//            while((l = reader.read(tmp)) != -1) {
//                buffer.append(tmp, 0, l);
//            }
//            return buffer.toString();
//        } finally {
//            instream.close();
//        }
//    }
//}
