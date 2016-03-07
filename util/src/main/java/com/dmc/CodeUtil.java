package com.dmc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author xiaobianchen
 * @version 1.0 2016/2/25
 *
 * 编码与解码操作工具类
 *
 */
public final class CodeUtil {

    private static final Logger logger = LoggerFactory.getLogger(CodeUtil.class);

    /**
     * 将URL编码
     */
    public static String encodeURL(String source) {
         String target;

        try {
            target = URLEncoder.encode(source, "UTF-8");
        } catch (Exception e) {
            logger.error("encode url failure", e);
            throw new RuntimeException(e);
        }

        return target;
    }

    /**
     * 将URL解码
     */
    public static String decodeURL(String sourcce){
        String target;
        try {
            target = URLDecoder.decode(sourcce, "UTF-8");
        } catch (Exception e) {
            logger.error("decode url failure", e);
            throw new RuntimeException(e);
        }
        return target;
    }
}
