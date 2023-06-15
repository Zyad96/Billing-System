/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iti.billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modules.CDR;

/**
 *
 * @author Esraa
 */
public class CdrDao {
     public static void saveCall(CDR cdr) throws SQLException {

        Connection connection = DBconnection.getConnection();

        PreparedStatement statement = connection.prepareStatement("INSERT INTO cdr (imsi, calling_phone_no, called_phone_no, call_start_date, call_end_date, rate_plan, service_package, duration) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

        statement.setInt(1, cdr.getImsi());
        statement.setInt(2, cdr.getCallingPhoneNo());
        statement.setInt(3, cdr.getCalledPhoneNo());
        statement.setInt(4, cdr.getCallStartDate());
        statement.setInt(5, cdr.getCallEndDate());
        statement.setString(6, cdr.getRatePlan());
        statement.setString(7, cdr.getServicePackage());
        statement.setInt(8, cdr.getDuration());

        statement.executeUpdate();

        connection.close();
    }
}

