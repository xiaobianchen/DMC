package com.dmc.services;
import com.dmc.domain.entity.ResetPassword;

/**
 * @author xiaobianchen
 * @version 1.0 2015/6/17
 * @link https://github.com/xiaobianchen/DMC
 *
 */
@SuppressWarnings("rawtypes")
public interface UserService extends BaseService{
    boolean getUserByUserName(String username);
    boolean getUserByEmail(String email);
    boolean getUserByPhone(String phone);
    boolean getUserByLogin(String username,String password);
    void updateUser(ResetPassword reset);
}
