package com.sangjae.section02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Application2 {

    public static void main(String[] args) {

        // 스트림의 최종 연산 reduce
        // 이전 연산에 반환된 값이 다음 연산의 첫번재 인자로 전달
//        OptionalInt reduceOneParam = IntStream.range(1,10)
//                .reduce((a,b)-> {
//                    System.out.println("a : " + a + ", b : " + b);
//                    return Integer.sum(a,b);
//                });
//        System.out.println(reduceOneParam);

        OptionalInt reduceOneParam = IntStream.range(1,10)
                .reduce((a,b)-> Integer.sum(a,b));
        System.out.println(reduceOneParam);


        // reduce 인자를 2개 전달할 경우
        // 첫번째는 초기값을 지정 하는것
        // 이건 값이 없을 수가 없으므로 Optional 형태로 받지 않아도 된다
        int reduceTwoParam = IntStream.range(1,10)
                .reduce(100,Integer::sum);
        System.out.println(reduceTwoParam);


    }//main
}
