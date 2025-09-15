package com.sangjae.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {

        // 존재하는 파일은 아니지만 인스턴스 생성하는거 자체는 문제가 안된다
        File file = new File("test.txt");

        try {
            // createNewFile 은 성공했나 안했나 하는 boolean타입
            boolean createSuccess = file.createNewFile();
            System.out.println("createSuccess : " +  createSuccess);

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }


        // 파일 정보 확인
        System.out.println("file length : " + file.length());
        System.out.println("file getPath : " + file.getPath());
        System.out.println("file getParent : " + file.getParent());
        System.out.println("file getAbsolutePath : " + file.getAbsolutePath());



        // 파일 제거
        boolean deleteSuccess = file.delete();
        System.out.println(deleteSuccess);

    }//main
}
