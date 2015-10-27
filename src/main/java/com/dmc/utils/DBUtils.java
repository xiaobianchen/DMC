package com.dmc.utils;

import java.sql.*;
import java.util.Properties;

/**
 * @author xiaobian.chen
 * @version 1.0 2015/9/10
 */
public class DBUtils {

    public static final Properties prop = new Properties();

    static {
        try {
            prop.load(ClassLoader.getSystemResourceAsStream("jdbc.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final String USERNAME = prop.getProperty("username");
    private static final String PASSWORD = prop.getProperty("password");
    private static final String URL = prop.getProperty("url");
    private static Connection connection = null;
    private static CallableStatement cstmt = null;

    /**
     * returns connection
     * @return
     */
    public static Connection openConenection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    /**
     * call procedure
     */
    public static void callProcedure() {
        try {
            connection = openConenection();
            cstmt = connection.prepareCall("{call sp_processData()}");
            cstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (cstmt != null) {
                    cstmt.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        openConenection();
    }
}
