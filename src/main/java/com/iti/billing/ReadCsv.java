/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iti.billing;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import modules.CDR;
/**
 *
 * @author Speed
 */
public class ReadCsv {
                
        public static String[] readLine(String filePath) throws FileNotFoundException, IOException {

        FileReader fileReader = new FileReader("E:\\test1.csv");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.readLine();

        String line = bufferedReader.readLine();

        String[] fields = line.split(",");

        bufferedReader.close();

        return fields;
    }
}

