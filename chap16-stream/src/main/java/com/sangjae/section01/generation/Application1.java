package com.sangjae.section01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {

        // 배열을 스트림으로
        String[] sarr = {"java","mariadb","jdbc"};
        Stream<String> strStream1 = Arrays.stream(sarr);
//        strStream1.forEach(str-> System.out.println(str));
        strStream1.forEach(System.out::println);

        System.out.println();

        Stream<String> strStream2 = Arrays.stream(sarr,0,2);
        strStream2.forEach(System.out::println);


        // 컬렉션 스트림으로
        List<String> stringList = Arrays.asList("html","css","javac");
        Stream<String> streamArr = stringList.stream();
        streamArr.forEach(System.out::println);

        stringList.forEach(System.out::println);

        // Builder 를 스트림
        Stream<String> stringStream = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길")
                .build();
        stringStream.forEach(System.out::println);

        // iterate()를 활용하여 수열 형태의 스트림 생성
        Stream<Integer> intStream = Stream.iterate(10, v->v*2).limit(10);
        intStream.forEach(System.out::println);


    }//main
}
