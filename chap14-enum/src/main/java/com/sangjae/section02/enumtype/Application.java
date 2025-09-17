package com.sangjae.section02.enumtype;

public class Application {
    public static void main(String[] args) {
        // 열거형을 이용하여 상수 열거 패턴의 단점을 해결

        // 싱글톤 : 이 시스템에서 인스턴스를 딱 하나만 사용한다
        // 1. 싱글톤 방식으로 구현 , 인스턴스의 생성이나 확장이 되지않는다
        // 2. 컴파일 시 타입 안정성을 높혀준다

        boolean isTrue = enumTest(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW , FoodsEnum.DRINK_RADISH_KIMCHI_LATTE);
        System.out.println("isTrue : " + isTrue);


        // 3. 상수 이름을 문자열로 출력가능
        System.out.println(FoodsEnum.DRINK_RADISH_KIMCHI_LATTE);
        System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(FoodsEnum.DRINK_RAW_CUTTLEFISH_SHAKE);


        // 4. 필요하다면 필드나 메소드를 추가할 수 있다
        // 단 enum 클래스는 불변 객체이기 때문에 모든 필드는 final로 선언되어야 한다


        // 5. 열거 타입 내에 선언 된 상수를 순회할 수 있다
//        for (FoodsEnum food : FoodsEnum.values()) {
//            System.out.println(food);
//            food.printVar();
//        }



    }//main


    private static boolean enumTest(FoodsEnum foodsEnum, FoodsEnum foodsEnum2){
        if(foodsEnum == foodsEnum2) return true;
        return false;
    }

}
