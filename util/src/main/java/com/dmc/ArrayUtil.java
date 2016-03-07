package com.dmc;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author xiaobianchen
 * @version 1.0 2016/2/25
 * 数组工具类
 */
public final class ArrayUtil {

    /**
     * 判断数组是否为非空
     */
    public static boolean isNotEmpty(Object[] array) {
        return !isEmpty(array);
    }

    /**
     * 判断数组是否为空
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }

}
