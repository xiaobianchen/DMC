package com.dmc.maper;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2015/12/22
 * @link https://github.com/xiaobianchen/DMC
 *
 */
public interface GenericMapper<T> {
    List<T> listAll();
}
