/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iti.billing;

import com.iti.billing.DBconnection;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modules.Invoices;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

/**
 *
 * @author zyadm
 */
public class PrintInvoice {
    public static  void printInvoice() throws FileNotFoundException, JRException, SQLException {
                Invoices invoice = new Invoices();
        Connection connection = DBconnection.getConnection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT duration FROM cdr");
        while (rs.next()) {
            int callDuration = rs.getInt("duration");
            Statement stmt2 = connection.createStatement();
            ResultSet rs2 = stmt2.executeQuery("SELECT calling_phone_no FROM cdr");
            while (rs2.next()) {
                int callingNumber = rs2.getInt("calling_phone_no");
                Statement stmt3 = connection.createStatement();
                ResultSet rs3 = stmt3.executeQuery("SELECT name FROM rate_plan WHERE msisdn = " + callingNumber );
                while (rs3.next()) {
                    String ratePlan = rs3.getString("name");
                    Statement stmt4 = connection.createStatement();
                    ResultSet rs4 = stmt4.executeQuery("SELECT price FROM rate_plan WHERE msisdn = " + callingNumber );
                    while (rs4.next()) {
                        int ratePlanPrice = rs4.getInt("price");
                        Statement stmt5 = connection.createStatement();
                        ResultSet rs5 = stmt5.executeQuery("SELECT name FROM service_package WHERE msisdn = " + callingNumber );
                        while (rs5.next()) {
                            String serviceName = rs5.getString("name");
                            Statement stmt6 = connection.createStatement();
                            ResultSet rs6 = stmt6.executeQuery("SELECT price FROM service_package WHERE msisdn = " + callingNumber );
                            while (rs6.next()) {
                                double servicePrice = rs6.getDouble("price");
                                Statement stmt7 = connection.createStatement();
                                ResultSet rs7 = stmt7.executeQuery("SELECT minute_price FROM rate_plan WHERE msisdn = " + callingNumber);
                                while (rs7.next()) {
                                    int minutePrice = rs7.getInt("minute_price");
                                        
                                


                                invoice.setMsisdn(callingNumber);

                                invoice.setRate_plan_name(ratePlan);

                                invoice.setRate_plan_price(ratePlanPrice);

                                invoice.setService_package_name(serviceName);

                                invoice.setService_package_price(servicePrice);

                                invoice.setMinutes_consumption(minutePrice*callDuration);

                                invoice.setTotal_cost((int) (ratePlanPrice+servicePrice));

                            }
                        }
                    }
                }
            }
        }
    }
    
    connection.close ();
    String filePath = "E:\\Billing-System\\src\\main\\resources\\Bill.jrxml";
            Map<String, Object> parameters = new HashMap<String,Object>();
            parameters.put("customerName", "Zyad Elalfy");
            
            List<Invoices> list = new ArrayList<Invoices>();
            list.add(invoice);

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);

            JasperReport report = JasperCompileManager.compileReport(filePath);
            JasperPrint printReport = JasperFillManager.fillReport(report, parameters, dataSource);
            JasperExportManager.exportReportToPdfFile(printReport, "F:\\Reports\\FinalReport.pdf");
    }
}

