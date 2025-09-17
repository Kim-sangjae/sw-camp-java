package com.sangjae.section01.intro;

// 함수형 인터페이스 : 내부에 하나의 추상메소드만 선언된 인터페이스 , 람다식의 타깃이 될 수 있다.
@FunctionalInterface
public interface Calculator {

    int sumTwoNumber(int a , int b);

}
