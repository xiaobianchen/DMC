package com.dmc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmc.domain.Comment;
import com.dmc.maper.CommentMapper;

@Service("commentService")
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentMapper commentMapper;

	@Override
	public void insert(Comment comment) {
		commentMapper.insert(comment);
	}

	@Override
	public boolean getCommentByComments(String comments) {
	    Comment comment = commentMapper.getCommentByComments(comments);
	    if(comment != null){
	    	return true;
	    }
		return false;
	}

}
