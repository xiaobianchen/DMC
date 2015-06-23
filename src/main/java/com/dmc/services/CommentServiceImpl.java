package com.dmc.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.dmc.domain.Comment;
import com.dmc.maper.CommentMapper;

public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentMapper commentMapper;

	@Override
	public void insert(Comment comment) {
		commentMapper.insert(comment);
	}

}
