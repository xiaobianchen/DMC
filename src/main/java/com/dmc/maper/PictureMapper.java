package com.dmc.maper;

import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.dmc.domain.entity.Picture;

/**
 * 
 * Created by Xiaobian Chen on 2015年7月3日
 *
 *
 */
public interface PictureMapper {
	@Insert("INSERT INTO picture(id,fileName,fileStream) VALUES"
			+ "(#{id},#{fileName},#{fileStream,javaType=byte[],jdbcType=BLOB, typeHandler=org.apache.ibatis.type.BlobTypeHandler})")
	@Options(useGeneratedKeys=true, keyProperty="id", flushCache=true, keyColumn="id")
	void insert(Map<String,Object> map);
	
	
	@Select("SELECT id as id, fileName as fileName, fileStream as fileStream "
			+ "FROM picture WHERE id= #{id}")
	Picture getPictureById(int id);
	
}
