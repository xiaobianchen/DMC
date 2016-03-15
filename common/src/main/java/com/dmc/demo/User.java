package com.dmc.demo;

import java.io.Serializable;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/10
 */
public class User implements Serializable {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
