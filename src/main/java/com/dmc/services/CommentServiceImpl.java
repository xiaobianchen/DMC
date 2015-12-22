package com.dmc.services;

import com.dmc.domain.entity.Comment;
import com.dmc.maper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
	public void insert(Object o) {
		Comment comment = (Comment)o;
		commentMapper.insert(comment);
	}

	@Override
	public void update(Object o) {
	}

	@Override
	public void delete(String name) {
	}

	@Override
	public List<Comment> list() {
		return commentMapper.list();
	}
}
