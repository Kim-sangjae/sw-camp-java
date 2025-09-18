package com.sangjae.section01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {

        // 기본 자료형 스트림 생성
        IntStream intStream = IntStream.range(5,10);
        intStream.forEach(n-> System.out.print(n + " "));

        System.out.println();

        LongStream longStream = LongStream.rangeClosed(5,10);
        longStream.forEach(n-> System.out.print(n + " "));

        System.out.println();

        //Wrapper 클래스 자료형
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(n-> System.out.println(n+" "));

        System.out.println();


        // 문자여 -> IntStream
        IntStream helloworlchars = "hello world".chars();
        helloworlchars.forEach(s -> System.out.print(s + " "));

        System.out.println();


        // 문자열 split 해서 Stream
        Stream<String> splitStream = Pattern.compile(", ").splitAsStream("html, css, javasc");
        splitStream.forEach(s-> System.out.print(s + " "));


        // Stream.of()
        Stream<String> stringStream1 = Stream.of("hello","world");
        Stream<String> stringStream2 = Stream.of("java","mariadb");


        System.out.println();

        // concat
        Stream<String> strStream = Stream.concat(stringStream1,stringStream2);
        strStream.forEach(s-> System.out.print(s + " "));


        // 스트림은 1회용 , 최종연산 (ex forEach)  등이 수행된 스트림은 재사용 불가
//        strStream.forEach(System.out::println); // 위에서 사용해서 불가

    }//main
}
