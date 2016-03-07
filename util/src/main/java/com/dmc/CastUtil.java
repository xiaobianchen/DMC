package com.dmc;

import org.apache.commons.lang3.StringUtils;

/**
 * @author xiaobianchen
 * @version 1.0 2016/2/23
 * 转型操作工具类
 */
public final class CastUtil {

    public static int castInt(Object obj) {
        return CastUtil.castInt(obj,0);
    }

    public static int castInt(Object obj, int defaultValue) {
        int value = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    value = Integer.parseInt(strValue);
                } catch (Exception e) {
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    public static long castLong(Object obj) {
        return CastUtil.castLong(obj, 0L);
    }

    private static long castLong(Object obj, long defaultValue) {
        long longValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }

        return longValue;
    }

    public static double castDobule(Object obj) {
        return CastUtil.castDouble(obj, 0);
    }

    public static double castDouble(Object obj,double defaultValue){
        double doubleValue = defaultValue;
        if (obj != null) {
            String strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    doubleValue = defaultValue;
                }
            }
        }

        return doubleValue;
    }


    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    public static String castString(Object obj,String defaultValue) {
        return obj!=null?String.valueOf(obj):defaultValue;
    }


    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }

    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (obj != null) {
            booleanValue = Boolean.parseBoolean(castString(obj));
        }

        return booleanValue;
    }
}
