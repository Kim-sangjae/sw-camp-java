package com.sangjae.section01.extend;

public class Application {
    public static void main(String[] args) {

        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        System.out.println("-----------------------");

        FireCar fireCar = new FireCar(200);
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.waterCannon(60);
        fireCar.waterCannon(60);
        fireCar.waterCannon(60);
        fireCar.waterCannon(60);

        System.out.println("-----------------------");

        RacingCar racingCar = new RacingCar();
        racingCar.run();
        racingCar.stop();
    }
}
