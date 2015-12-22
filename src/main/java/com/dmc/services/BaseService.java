package com.dmc.services;

import java.util.List;

/**
 * Created by xiaobianchen on 2015/12/22.
 */
public interface BaseService<T>{

    void insert(T t);
    void update(T t);
    void delete(String name);
    List<T> list();

}
