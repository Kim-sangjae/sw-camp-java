package com.sangjae.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        // 스트림 중간 연산  filter
        // filter : 스트림에서 특정 데이터만 남기는(true값만) 메소드 매개변수는 Predicate (boolean타입반환)
        IntStream intStream = IntStream.range(1,10);
        intStream.filter(i -> i%2==0).forEach(System.out::println);



    }//main
}
