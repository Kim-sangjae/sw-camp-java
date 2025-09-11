package com.ohgiraffers.section08.objectArray;

public class Car {

    String name;
    int speed;

    public Car(String name, int speed){
        this.name = name;
        this.speed = speed;
    }


    public void driveMaxSpeed(){

        System.out.printf("%s (가) 최고시속 %dKm/h 로 달려갑니다 \n", this.name, this.speed);
    }
}
