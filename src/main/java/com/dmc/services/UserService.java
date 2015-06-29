package com.dmc.services;
import com.dmc.domain.ResetPassword;
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
    void updateUser(ResetPassword reset);
}
