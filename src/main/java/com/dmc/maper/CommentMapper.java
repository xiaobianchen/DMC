package com.dmc.maper;

import org.apache.ibatis.annotations.Insert;

import com.dmc.domain.Comment;

/**
 * 
 * Created by Xiaobian Chen on 2015Äê6ÔÂ23ÈÕ
 *
 *
 */
public interface CommentMapper {
    
	@Insert("INSERT INTO comment(comments, contact) VALUES"
			+ "(#{comments},#{contact}")
	void insert(Comment comment);
}
