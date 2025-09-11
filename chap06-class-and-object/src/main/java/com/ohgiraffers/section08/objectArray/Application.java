package com.ohgiraffers.section08.objectArray;

public class Application {
    public static void main(String[] args) {

        Car[] cars = new Car[5];

        cars[0] = new Car("페라리", 300);
        cars[1] = new Car("모닝", 70);
        cars[2] = new Car("람보르기니", 400);
        cars[3] = new Car("다마스", 50);
        cars[4] = new Car("K5", 120);

        for (Car car : cars) {
            car.driveMaxSpeed();
        }

        Car[] cars2 = {
                new Car("페라리", 300),
                new Car("모닝", 70),
                new Car("람보르기니", 400)
        };


        for(int i = 0 ; i < cars2.length; i++){
            cars2[i].driveMaxSpeed();
        }


    }
}
