package com.sangjae.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        //FileStream

        // stream 은 사용 종료되면 반드시 반납되어야 한다 close()
        try (FileInputStream fis = new FileInputStream("testInputStream.txt")) {

            // read() : 파일에 기록된 값을 순차적으로 읽음
//            int value;
//            while ((value = fis.read()) != -1){
//                System.out.println((char)value);
//            }
//

            // 배열을 통해 한번에 읽어오기 FileStream 은 byte단위로 읽어옴
            byte[] bar = new byte[100];
            fis.read(bar);
            System.out.println(Arrays.toString(bar));


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }//main
}
