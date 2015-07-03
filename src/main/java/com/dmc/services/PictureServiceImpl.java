package com.dmc.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmc.domain.Picture;
import com.dmc.maper.PictureMapper;

@Service("pictureService")
public class PictureServiceImpl implements PictureService {
	
	@Autowired
	private PictureMapper pictureMapper;

	@Override
	public void insert(Map<String, Object> map) {
		pictureMapper.insert(map);
	}

	@Override
	public Picture getPictureById(int id) {
		return pictureMapper.getPictureById(id);
	}

}
