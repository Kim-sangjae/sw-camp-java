package com.sangjae.section03.grammar;

public class Application1 {
    public static void main(String[] args) {
        // Enum 타입으 ㅣ 메소드 정리

        // 1. values() : 열거 타입의 모든 값을 배열로 반환
        for(EnumType enumType : EnumType.values()){
            System.out.println("values : " + enumType);
        }


        // 2. valueOf() : 해당 이름을 가진 열거 타입 상수 반환
        for(EnumType enumType : EnumType.values()){
            if(enumType == EnumType.valueOf("JAVA")){
                System.out.println("valueOf : " + enumType);
            }
        }


        // 3. ordinal() : 열거 타입의 상수 순서를 리턴
        for (EnumType enumType : EnumType.values()) {
            System.out.println("ordinal : " + enumType.ordinal());

        }



        // 4. name() 열거 타입의 문자열 리턴
        for (EnumType value : EnumType.values()) {
            System.out.println("name : " + value.name());
        }




    }//main
}
