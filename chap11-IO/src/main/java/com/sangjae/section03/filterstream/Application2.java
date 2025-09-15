package com.sangjae.section03.filterstream;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        // InputStreamReader / OutputStreamWriter : 형변환 보조 스트림
        // 기반스트림이 byte , 보조스트림 char 스트림일 경우 변환하기 위해 사용

        // 표준스트림
        // 자바에서 콘솔 , 키보드 같은 표준 입출력장치로부터 데이터를 입출력하기위해
        // System.in System.out System.err 과 같은 형태의 표준 스트림을 제공한다

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("문자열 입력 : ");
            String value = br.readLine();

            System.out.println("입력 받은 문자열 : " + value);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        // 출력을 위해 사용
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            bw.write("출력테스트");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }// main

}
