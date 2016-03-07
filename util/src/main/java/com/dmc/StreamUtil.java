package com.dmc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 * @author xiaobianchen
 * @version 1.0 2016/2/25
 *
 * 流操作工具类
 */
public class StreamUtil {

    private static final Logger logger = LoggerFactory.getLogger(StreamUtil.class);

    /**
     * 从输入流中获取字符串
     */
    public static String getString(InputStream is) {
        StringBuffer sb = new StringBuffer();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {
            logger.error("get string failure", e);
            throw new RuntimeException(e);
        }

        return sb.toString();
    }

    /**
     *  将输入流复制到输出流
     */
    public static void copyStream(InputStream inputStream, OutputStream outputStream) {

        try {
            int length;
            byte[] buffer = new byte[4 * 1024];
            while ((length = inputStream.read(buffer, 0, buffer.length)) != -1) {
                outputStream.write(buffer,0,length);
            }
        } catch (Exception e) {
            logger.error("copy stream failure", e);
            throw new RuntimeException(e);
        }finally {
            try {
               inputStream.close();
               outputStream.close();
            } catch (Exception e) {
                logger.error("close stream failure",e);
            }
        }
    }
}
