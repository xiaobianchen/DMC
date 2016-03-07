package com.dmc;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.Map;

/**
 * @author xiaobianchen
 * @version 1.0 2016/2/25
 */
public final class CollectionUtil {

    /**
     *  判断collection是否为非空
     */
    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    /**
     * 判断collection为空
     */
    public static boolean isEmpty(Collection<?> collection) {
        return CollectionUtils.isEmpty(collection);
    }


    /**
     * 判断map是否为非空
     */
    public static boolean isNotEmpty(Map<?, ?> map) {
        return !map.isEmpty();
    }


    /**
     * 判断map是否为空
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return map.isEmpty();
    }
}
