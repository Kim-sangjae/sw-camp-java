package com.sangjae.section03.map;

import java.io.*;
import java.util.*;

public class Application2 {
    public static void main(String[] args) {
     // Properties : 설정 파일의 값을 읽어서 어플리케이션에 적용 할 때 사용
        Properties properties = new Properties();

        properties.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        properties.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
        properties.setProperty("user", "student");
        properties.setProperty("password", "student");

        System.out.println(properties);

        try {
            properties.store(new FileOutputStream("driver.dat") , "jdbc driver");
            properties.store(new FileWriter("driver.txt") , "jdbc driver");
            properties.storeToXML(new FileOutputStream("driver.xml") , "jdbc driver");

        } catch (IOException e) {
            e.printStackTrace();
        }



        Properties properties2 = new Properties();
        try {
//            properties2.load(new FileInputStream("driver.dat"));
//            properties2.load(new FileReader("driver.txt"));
            properties2.loadFromXML(new FileInputStream("driver.xml"));

            properties2.list(System.out);

        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(properties2.getProperty("driver"));
        System.out.println(properties2.getProperty("url"));
        System.out.println(properties2.getProperty("user"));
        System.out.println(properties2.getProperty("password"));


    }//main
}
