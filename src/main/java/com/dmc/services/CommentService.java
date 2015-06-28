package com.dmc.services;

import java.util.List;

import com.dmc.domain.Comment;

/**
 * 
 * Created by Xiaobian Chen on 2015Äê6ÔÂ23ÈÕ
 *
 *
 */
public interface CommentService {
   
	void insert(Comment comment);
	boolean getCommentByComments(String comments);
	List<Comment> list();
}
