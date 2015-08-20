package com.dmc.maper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.dmc.domain.Comment;

/**
 * 
<<<<<<< HEAD
 * Created by Xiaobian Chen on 2015��6��23��
=======
 * Created by Xiaobian Chen on 2015年6月23日
>>>>>>> 8670870b25acb85f942d4834ffd5877274ff3095
 * Comment Mapper: SQL with Comment
 *
 */
public interface CommentMapper {
    
<<<<<<< HEAD
	@Insert("INSERT INTO comment(comments, type, contact, reportTime) VALUES"
				+ "(#{comments},#{type}, #{contact}, #{reportTime})")
=======
	@Insert("INSERT INTO comment(comments, type, contact, fileName,fileStream, reportTime) VALUES"
				+ "(#{comments},#{type}, #{contact},#{fileName},#{fileStream},#{reportTime})")
>>>>>>> 8670870b25acb85f942d4834ffd5877274ff3095
	@Options(useGeneratedKeys=true, keyProperty="id", flushCache=true, keyColumn="id")
	void insert(Comment comment);
	
	@Select("SELECT id as id, comments as comments, type as type,contact as contact,reportTime as reportTime "
			+ "FROM comment")
	List<Comment> list();
	
}
