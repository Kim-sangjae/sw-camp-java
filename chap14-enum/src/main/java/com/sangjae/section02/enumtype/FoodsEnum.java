package com.sangjae.section02.enumtype;

public enum FoodsEnum {

    // enum 에 선언된건 하나하나 자신의 생성자를 통해 만들어진 인스턴스이다
     MEAL_AN_BUTTER_KIMCHI_STEW("앙버터김치찜") ,
     MEAL_MINT_SEAWEED_SOUP("민트미역국") ,
     MEAL_BUNGEOPPANG_SUSHI ("붕어빵초밥"),

     DRINK_RADISH_KIMCHI_LATTE ("열무김치라떼"),
     DRINK_WOOLUCK_SMOOTHIE ("우럭스무디"),
     DRINK_RAW_CUTTLEFISH_SHAKE("생갈치쉐이크");


    private final String name;

    FoodsEnum(String name) {
        this.name = name;
    }



    public String getName(){
        return name;
    }


    // 4. 필요하다면 필드나 메소드를 추가할 수 있다
    // 단 enum 클래스는 불변 객체이기 때문에 모든 필드는 final로 선언되어야 한다
}
