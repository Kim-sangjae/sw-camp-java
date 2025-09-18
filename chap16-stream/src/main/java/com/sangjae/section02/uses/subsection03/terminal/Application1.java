package com.sangjae.section02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {

    public static void main(String[] args) {

        // 스트림 최종 연산 calculating
        long count = IntStream.range(1,10).count();
        long sum = IntStream.range(1,10).sum();
        System.out.println("count : " + count);
        System.out.println("sum : " + sum);


        // Optional : 결과 없음(null처리)을 나타내는 명확한 요구가있는 반환형식
        OptionalInt max = IntStream.rangeClosed(1, 10).max();
        OptionalInt min = IntStream.rangeClosed(1, 10).min();
        System.out.println(max);
        System.out.println(min);
        System.out.println(max.getAsInt());
        System.out.println(min.getAsInt());


        // 중간 연산 이후 최종연산 calculating
        int addSum = IntStream.rangeClosed(1,100)
                .filter(i -> i%2 == 1)
                .sum();

        System.out.println(addSum);


    }//main
}
