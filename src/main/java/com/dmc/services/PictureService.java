package com.dmc.services;

import java.util.Map;

import com.dmc.domain.entity.Picture;
/**
 * 
 * Created by Xiaobian Chen on 2015年7月3日
 *
 *
 */
public interface PictureService {
     void insert(Map<String,Object> map);
     Picture getPictureById(int id);
}
