package com.dmc.maper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.dmc.domain.Comment;

/**
 * 
 * Created by Xiaobian Chen on 2015Äê6ÔÂ23ÈÕ
 *
 *
 */
public interface CommentMapper {
    
	@Insert("INSERT INTO comment(comments, type, contact) VALUES"
				+ "(#{comments},#{type}, #{contact})")
	@Options(useGeneratedKeys=true, keyProperty="id", flushCache=true, keyColumn="id")
	void insert(Comment comment);
	
	@Select("SELECT comments as comments, type as type,contact as contact "
			+ "FROM comment WHERE comments = #{comments}")
	Comment getCommentByComments(String comments);
}
