package com.dmc.services;
import com.dmc.domain.entity.ResetPassword;

/**
 * 
 *  Created by Xiaobian Chen on 2015年6月17日
 */
@SuppressWarnings("rawtypes")
public interface UserService extends BaseService{
    boolean getUserByUserName(String username);
    boolean getUserByEmail(String email);
    boolean getUserByPhone(String phone);
    boolean getUserByLogin(String username,String password);
    void updateUser(ResetPassword reset);
}
