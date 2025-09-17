package com.sangjae.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        // 스트림 병렬처리 이해

        List<String> list = new ArrayList<>(
                Arrays.asList("java","mariadb","html","css","mybatis")
        );


        // 모든 작업은 기본적으로 main스레드 안에서 일어난다
        System.out.println("-------forEach");
        for (String s : list) {
            print(s);
        }

        System.out.println("------- normal stream");
        list.stream().forEach(s->print(s));


        // 병렬 스트림을 활용해 처리해야할 데이터가 많을경우
        // 효율적으로 처리할 수 있는 장점이있다
        System.out.println("------ parallel stream");
        list.parallelStream().forEach(s->print(s));
        list.parallelStream().forEach(s->print(s));


    }


    private static void print(String str){
        System.out.println(str + ":" + Thread.currentThread().getName());
    }


}
