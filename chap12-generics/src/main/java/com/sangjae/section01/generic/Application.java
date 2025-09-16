package com.sangjae.section01.generic;

public class Application {
    public static void main(String[] args) {
        // 제네릭 프로그래밍
        // 데이터 형식에 의존 없이 여러 다른 데이터 타입을 가질 수 있는 기술
        // 재사용성 향상
        // 1. 컴파일 시 타입 검사를 통한 타입 안정성 확보
        // 2. 반환 값 타입 변환 코드 생략

        // 타입을 Integer로 생성
        // 레퍼런스 변수 선언으로 인해 타입 추론이 가능 , 인스턴트 생성 시 타입을 명시하지 않아도 된다.
        GenericTest<Integer> gt1 = new GenericTest<>();

        gt1.setValue(10);
        Integer num = gt1.getValue();


        // String 으로 생성
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.setValue("hello");

        String str = gt2.getValue();


        // 제네릭 없이 생성
        GenericTest gt3 = new GenericTest();
        gt3.setValue(10);
        gt3.setValue("String");

        String str1 = (String)gt3.getValue();



    }
}
