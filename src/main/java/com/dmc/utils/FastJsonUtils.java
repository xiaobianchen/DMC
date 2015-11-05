package com.dmc.utils;

import java.io.IOException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.dmc.domain.entity.Group;
import com.dmc.domain.entity.User;

/**
 * 
 *  Created by Xiaobian Chen on 2015年7月11日
 *  Simple Example for FastJson
 */
public class FastJsonUtils {
	
	public static void testFastson() throws IOException {
		Group group = new Group();
		group.setId(0L);
		group.setName("admin");
		
		User user = new User();
		user.setUsername("dmc");
		user.setPassword("123");
		user.setEmail("dmc@12.com");
		user.setPhone("18601705642");
		
		group.addUser(user);
		
		//convert an object to json 
		String jsonObject = JSON.toJSONString(group);
		System.out.println(jsonObject);
		
		String jsonString = "{\"id\":\"0\",\"name\":\"admin\",\"users\":[{\"email\":\"dmc@12.com\",\"password\":\"123\",\"phone\":\"18601705642\",\"username\":\"dmc\"}]}";
		//convert json object to an object
		Group groupObject = JSON.parseObject(jsonString, Group.class);
		System.out.println(groupObject);
		
		//handle dateformat
		String toJsonString = JSON.toJSONStringWithDateFormat(group,"yyyy-MM-dd HH:mm:ss.SSS",SerializerFeature.UseISO8601DateFormat);
		System.out.println(toJsonString);
		
//		JSONWriter writer = new JSONWriter(new FileWriter("D:\\gitrepo\\DMC\\src\\main\\resources\\huge.json"));
//		writer.startArray();
//		
//		for(int i = 0; i < 1000*1000; ++i){
//			writer.writeValue(new Group());
//		}
//		
//		writer.endArray();
//		writer.close();
	}
}
