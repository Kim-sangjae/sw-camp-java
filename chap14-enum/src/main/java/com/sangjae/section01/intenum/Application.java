package com.sangjae.section01.intenum;

public class Application {
    public static void main(String[] args) {

        // 정수형 열거 타입의 불편한점

        // 1. 타입 안정성이 없어서 디버깅 힘들다
        int food = Foods.MEAL_AN_BUTTER_KIMCHI_STEW; // 0
        food = Foods.DRINK_RADISH_KIMCHI_LATTE; // 0



        // 2. 둘다 0 값을 가지고있어서 구분이 불가하다
        if(food == Foods.MEAL_AN_BUTTER_KIMCHI_STEW){
            System.out.println("앙버터 김치찜");
        }


        // 정수형 상수는 문자열로 출력하기 힘들다
        System.out.println(Foods.MEAL_BUNGEOPPANG_SUSHI);
        System.out.println(Foods.DRINK_RADISH_KIMCHI_LATTE);
        System.out.println(Foods.DRINK_WOOLUCK_SMOOTHIE);


        // 3. 정수 열거 그룹에 속한 모든 상수를 순회하기 힘들다
        // 4. 정수 열거 패턴으로 상수가 선언된 경우 변경이 발생하면 재 컴파일이 필요하다


    }//main



}
