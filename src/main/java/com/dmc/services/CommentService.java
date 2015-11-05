package com.dmc.services;

import java.util.List;
import com.dmc.domain.entity.Comment;

/**
 * 
 * Created by Xiaobian Chen on 2015年6月23日
 *
 *
 */
public interface CommentService {
   
	void insert(Comment comment);
	List<Comment> list();
}
