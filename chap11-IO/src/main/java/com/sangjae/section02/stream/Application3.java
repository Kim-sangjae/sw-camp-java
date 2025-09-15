package com.sangjae.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {

        //FileOutputStream
        // file 이라는 외부 자원으로 1바이트 단위로 출력
        // 파일이 없는경로로 output 하려하면 FileNotFoundException 발생
        // 생성자 두번째 인수로 append true를 전달하면 이어쓰기 , 기본은 덮어쓰기
        try (FileOutputStream fos = new FileOutputStream("testOutputStream.txt" , true)) {

            fos.write(97);

            byte[] bytes = new byte[]{98,99,100,101,102,10};
            fos.write(bytes);
            fos.write(bytes, 1, 3);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }//main
}
