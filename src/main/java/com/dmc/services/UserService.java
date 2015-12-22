package com.dmc.services;
import com.dmc.domain.entity.ResetPassword;
import com.dmc.domain.entity.User;

import java.util.List;

/**
 * 
 *  Created by Xiaobian Chen on 2015年6月17日
 */
public interface UserService {
    void insert(User user);
    boolean getUserByUserName(String username);
    boolean getUserByEmail(String email);
    boolean getUserByPhone(String phone);
    boolean getUserByLogin(String username,String password);
    void updateUser(ResetPassword reset);
    List<User> listUsers();
    void deleteUser(String username);
    void updateUsers(User user);


}
