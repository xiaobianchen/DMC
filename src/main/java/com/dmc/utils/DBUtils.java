package com.dmc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by xiaobianchen on 15/9/9.
 */
public class DBUtils {

    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3307/dmc?autoReconnect=true";

    /**
     * @param url
     * @param username
     * @param password
     * @return
     */
    public static Connection openConenection(String url, String username, String password) {

        Connection connection = null;
        try {
            Class.forName(DRIVER_NAME);
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("mysql connection successfully!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;

    }

    public static void main(String[] args) {
        DBUtils.openConenection(URL, USERNAME, PASSWORD);
    }


}
