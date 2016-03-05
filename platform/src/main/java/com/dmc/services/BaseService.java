package com.dmc.services;

import java.util.List;


/**
 * @author xiaobianchen
 * @version 1.0 2015/12/22
 * @link https://github.com/xiaobianchen/DMC
 *
 */
public interface BaseService<T>{

    void insert(T t);
    void update(T t);
    void delete(String name);
    List<T> list();

}
