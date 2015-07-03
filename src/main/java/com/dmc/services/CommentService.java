package com.dmc.services;

import java.util.List;
import com.dmc.domain.Comment;

/**
 * 
 * Created by Xiaobian Chen on 2015��6��23��
 *
 *
 */
public interface CommentService {
   
	void insert(Comment comment);
	List<Comment> list();
}
