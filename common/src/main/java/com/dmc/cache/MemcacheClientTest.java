package com.dmc.cache;

import com.dmc.demo.User;
import net.spy.memcached.MemcachedClient;

import java.net.InetSocketAddress;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/10
 */
public class MemcacheClientTest {

    public static void main(String[] args) throws  Exception{
        MemcachedClient memcachedClient = new MemcachedClient(new InetSocketAddress("10.64.198.230", 11211));
        memcachedClient.set("somekey", 3600, new Integer(4));
        Object obj = memcachedClient.get("somekey");
        Integer result = (Integer) obj;
        System.out.println(result);
        System.out.println("存之前的时间:" + System.currentTimeMillis());

        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123");

        memcachedClient.set("user", 3600, user);
        System.out.println("取之前的时间:" + System.currentTimeMillis());

        User user1 = (User)memcachedClient.get("user");
        System.out.println(user1.getUsername() + ":" + user1.getPassword());
        System.out.println("取之后的时间:" + System.currentTimeMillis());
    }
}
