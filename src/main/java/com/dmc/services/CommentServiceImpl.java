package com.dmc.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dmc.domain.entity.Comment;
import com.dmc.maper.CommentMapper;
/**
 * 
 * Created by Xiaobian Chen on 2015年6月26日
 *
 *
 */

@Service("commentService")
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private CommentMapper commentMapper;

	/**
	 * insert comment
	 */
	@Override
	public void insert(Comment comment) {
		commentMapper.insert(comment);
	}

	@Override
	public List<Comment> list() {
		return commentMapper.list();
	}
}
