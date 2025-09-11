package com.sangjae.section01.extend;

public class RacingCar extends Car{


    public RacingCar(){
        System.out.println("레이싱카 호출");
    }

    @Override
    public void run() {
        System.out.println("부와아아아아아ㅏ아아앙아아아ㅏㅏ앙!!!!!");
    }

    @Override
    public void stop() {
        System.out.println("끼이이이이이이ㅣ이이ㅣ익!!");
    }

}
