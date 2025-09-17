package com.sangjae.section03.grammar;

import com.sangjae.section02.enumtype.FoodsEnum;

import java.util.EnumSet;

public class Application2 {
    public static void main(String[] args) {

        // EnumSet을 활용하여 enum을 Set 구조로 다룰 수 있다
        // 모든 상수값을 set에 추가
        EnumSet<FoodsEnum> foods = EnumSet.allOf(FoodsEnum.class);
        for(FoodsEnum food : foods){
            System.out.println(food.name()+ " - " + food.getName());
        }


        System.out.println("--------------------------------");
        // 특정 상수값만 set에 추가
        EnumSet<FoodsEnum> foods2 = EnumSet.of(
                FoodsEnum.DRINK_WOOLUCK_SMOOTHIE, FoodsEnum.DRINK_RAW_CUTTLEFISH_SHAKE
        );

        for(FoodsEnum food : foods2){
            System.out.println(food.name()+ " - " + food.getName());
        }



        // 특정 상수값만 제외하고 Set 추가
        EnumSet<FoodsEnum> foods3 = EnumSet.complementOf(
                EnumSet.of(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW,FoodsEnum.MEAL_BUNGEOPPANG_SUSHI)
        );
        System.out.println("---------------------------------");
        for(FoodsEnum food : foods3){
            System.out.println(food.name()+ " - " + food.getName());
        }

    }
}
