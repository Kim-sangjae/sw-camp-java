package com.sangjae.section03.filterstream;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        // 필터 스트림 (보조 스트림) : 기반 스트림에 추가되어 "성능향상" , 기능 추가의 역할을 한다
        // BufferedReader/Writer : 버퍼 공간에 데이터를 쌓아두었다가 입출력 횟수를 줄이고 성능을 향상

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("testBuffered.txt"));

            bw.write("안녕하세여?\n반갑습니다");

            // 버퍼를 이용할 경우 버퍼가 가득차면 자동으로 내보내지만
            // 버퍼가 가득차면 내보내고 새로운 버퍼에 또 채운다 (정해진 크기가 있다)
            // flush() 를 통해 임의로 내보낼 수 있다
            bw.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                // close 를 호출하면 내부적으로 flush()가 먼저 호출된 후 닫는다
                bw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }



        // BufferedReader : readLine() 이라는 메서드 제공
        // 버퍼의 한 줄을 읽어와서 문자열로 반환
       try(BufferedReader br = new BufferedReader(new FileReader("testBuffered.txt"))){

           String temp;
           while((temp = br.readLine()) != null){
               System.out.println(temp);
           }

       } catch (IOException e) {
           System.out.println(e.getMessage());
       }


    }// main

}
