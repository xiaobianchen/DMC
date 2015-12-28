package com.dmc.maper;

import com.dmc.domain.entity.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2015/6/23
 * @link https://github.com/xiaobianchen/DMC
 * Comment Mapper: SQL with Comment
 */
public interface CommentMapper {
    
	@Insert("INSERT INTO comment(comments, type, contact,reportTime) VALUES"
				+ "(#{comments},#{type}, #{contact},#{reportTime})")
	@Options(useGeneratedKeys=true, keyProperty="id", flushCache=true, keyColumn="id")
	void insert(Comment comment);
	
	@Select("SELECT id as id, comments as comments, type as type,contact as contact,reportTime as reportTime "
			+ "FROM comment")
	List<Comment> list();
	
}
