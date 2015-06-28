package com.dmc.services;

import com.dmc.domain.User;
/**
 * 
 *  Created by Xiaobian Chen on 2015Äê6ÔÂ17ÈÕ
 */
public interface UserService {
    void insert(User user);
    boolean getUserByUserName(String username);
    boolean getUserByEmail(String email);
    boolean getUserByPhone(String phone);
    boolean getUserByLogin(String username,String password);
    boolean resetPassword(String username,String password);
    User getUser(String username);
}
