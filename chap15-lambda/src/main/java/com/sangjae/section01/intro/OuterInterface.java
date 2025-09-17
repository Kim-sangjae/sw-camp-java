package com.sangjae.section01.intro;

// 람다식을 사용하려면 인터페이스 내에 하나의 추상 메서드만 존재해야하기 때문에
// 내부 인터페이스를 통해 여러개를 정의하여 관리할 수 있다
public interface OuterInterface {

    @FunctionalInterface
    interface Sum{
        int sumTwoNumber(int a , int b);
    }

    @FunctionalInterface
    interface Minus{
        int sumMinusNumber(int a , int b);
    }

    @FunctionalInterface
    interface Multiple{
        int sumMultipleNumber(int a , int b);
    }

    @FunctionalInterface
    interface Divide{
        int sumDivideNumber(int a , int b);
    }


}
