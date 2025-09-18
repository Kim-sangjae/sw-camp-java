package com.sangjae.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {

        //스트림 중간연산 map
        // 중계 연산은 최종 연산이 일어나기전까지는 여러번 수행가능
        // map : 스트림에 담긴 데이터를 람다식으로 가공 , 가공된 결과를 새로운 스트림에 전달
        // map = operator
        IntStream intStream = IntStream.range(0,10);
        intStream.filter(i -> i%2==0).map(n -> n*10).forEach(System.out::println);

    }//main
}
