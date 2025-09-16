package com.sangjae.section02.extend.run;

import com.sangjae.section02.extend.*;

public class Application2 {
    public static void main(String[] args) {
        // 메소드 매개변수 제네릭 제약을 사용

        MethodFarm methodFarm = new MethodFarm();

        methodFarm.animalType(new Bunny() , new Bunny());
        methodFarm.animalType(new Snake() , new Snake());

        methodFarm.mammalType(new Rabbit());
//        methodFarm.mammalType(new Snake());

        methodFarm.reptileType(new Snake());
//        methodFarm.reptileType(new Bunny());



    }
}
