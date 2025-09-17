package com.sangjae.section03.references;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Application1 {
    public static void main(String[] args) {
        // 메서드 참조에 대해 이해해본다
        BiFunction<String , String , Boolean> biFunction;
        String str1 = "METHOD";
        String str2 = "METHOD";


        // 람다식 사용
        biFunction = (x,y) -> x.equals(y);
        boolean result = biFunction.apply(str1,str2);
        System.out.println("result : " + result);

        // 메서드참조
        biFunction = String::equals;
        boolean result2 = biFunction.apply(str1,str2);
        System.out.println("result2 : " + result2);


        Predicate<String> isEqualsToSample;
        String sample = "hello world";

        isEqualsToSample = s -> s.equals(sample);
        result = isEqualsToSample.test("Hello world");
        System.out.println("result : " + result);


        // 메서드 참조 버전
        isEqualsToSample = sample::equals;
        result = isEqualsToSample.test("Hello world");
        System.out.println("result : " + result);

    }
}
