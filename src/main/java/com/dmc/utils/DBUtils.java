package com.dmc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author xiaobian.chen
 * @version 1.0 2015/9/10
 */
public class DBUtils {

    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/dmc?autoReconnect=true";

    /**
     *
     * @param url
     * @param username
     * @param password
     * @return
     */
    public static Connection openConenection(String url,String username,String password){

        Connection connection = null;
        try {
            Class.forName(DRIVER_NAME);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("connection successfully!");
        return connection;

    }


}
