package com.dmc.maper;

import java.util.List;

/**
 * Created by xiaobianchen on 2015/12/22.
 */
public interface GenericMapper<T> {
    List<T> listAll();
}
