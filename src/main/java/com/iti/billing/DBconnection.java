/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iti.billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Esraa
 */
public class DBconnection {
    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/billing";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123";
     public static Connection getConnection() throws SQLException {

        DriverManager.registerDriver(new org.postgresql.Driver());

        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

}

