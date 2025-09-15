package com.sangjae.section02.stream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {

       // FileWriter
        // file 이라는 외부자원쪽으로 문자 단위 출력 스트림

        try(FileWriter fw = new FileWriter("testWriter.txt")){
            fw.write(97);
            fw.write('A');
            fw.write(new char[] {'a','b','c'});
            fw.write("\n요요요요요ㅛ요요요요요요요");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }//main
}
