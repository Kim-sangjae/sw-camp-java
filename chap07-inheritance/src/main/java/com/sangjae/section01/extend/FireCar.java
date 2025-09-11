package com.sangjae.section01.extend;

public class FireCar extends Car{

    private int water;

    public FireCar(int water){
        System.out.println("소방차 호출!");
        this.water = water;
    }

    private void checkWater(int water){
        for(int i=0; i < water; i++){
            System.out.print(")");
        }
        System.out.println();
    }

    @Override
    public void run(){
        System.out.println("소방차가 달립니다");
        super.setRunningStatus(true);
    }

    @Override
    public void stop(){
        System.out.println("소방차가 멈춥니다");
        super.setRunningStatus(false);
    }

    @Override
    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵빵빵빵빵빵빠아빵빠아아빵빠아ㅏ빵!");
        }else{
            System.out.println("주행중이 아닐때는 경적을 울리지 못합니다");
        };
    }

    public void waterCannon(int waterCannon){

        if(this.water>0 && this.water > waterCannon){

            System.out.println(waterCannon + " 만큼 출수합니다");
            this.water -= waterCannon;
            checkWater(this.water);


        } else {
            System.out.println("물이 부족합니다 물을 채워주세요");
        }

        System.out.println("잔량 : " + this.water);

    }


}
