package com.dmc.utils;

import java.sql.*;
/**
 * @author xiaobian.chen
 * @version 1.0 2015/9/10
 */
public class DBUtils {

    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/dmc?autoReconnect=true";
    private static Connection connection = null;
    private static CallableStatement cstmt = null;

    /**
     * returns connection
     * @return
     */
    public static Connection openConenection() {
        try {
            Class.forName(DRIVER_NAME);
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
