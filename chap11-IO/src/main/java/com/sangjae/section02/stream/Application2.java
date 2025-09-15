package com.sangjae.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        //fileReader
        // file 이라는 외부자원과 연결 되어 문자 단위로 입력받는 메소드
        try (FileReader fr = new FileReader("testReader.txt")) {

//            int value;
//            while((value = fr.read()) != -1){
//                System.out.print((char)value);
//            }

            char[] carr = new char[100];
            fr.read(carr);
            for (char c : carr) {
                System.out.print(c);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }//main
}
