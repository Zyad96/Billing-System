/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iti.billing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import modules.CDR;
import modules.Invoices;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author zyadm
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, SQLException, JRException {

        try {
            
            String[] fields = ReadCsv.readLine("E:\\test1.csv");

            CDR cdr = new CDR();
            cdr.setImsi(Integer.parseInt(fields[0]));
            cdr.setCallingPhoneNo(Integer.parseInt(fields[1]));
            cdr.setCalledPhoneNo(Integer.parseInt(fields[2]));
            cdr.setCallStartDate(Integer.parseInt(fields[3]));
            cdr.setCallEndDate(Integer.parseInt(fields[4]));
            cdr.setRatePlan(fields[5]);
            cdr.setServicePackage(fields[6]);
            cdr.setDuration(Integer.parseInt(fields[7]));

            CdrDao.saveCall(cdr);
            
        
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
            PrintInvoice.printInvoice();
    }
}

    

