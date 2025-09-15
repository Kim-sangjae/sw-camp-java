package com.sangjae.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        // try with resource 구문의 문법을 이해하고 사용할 수 있다
        // jdk 1.7 버전에서 추가된 문법
        // close 해야되는 인스턴스를 try소괄호에 생성하면 자동 close

        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
