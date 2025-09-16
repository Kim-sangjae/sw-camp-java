package com.sangjae.section02.extend.run;

import com.sangjae.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {
        /* extends 키워드 사용 , 특정 타입만 사용하도록 제네릭 범위 제한 할 수있다*/

        // Rabbit 상위 타입이거나 관련없는 타입은 생성 불가능
//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Mammal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Snake> farm1 = new RabbitFarm<>();

        // Rabbit 타입 이거나 상속받은 확장 타입으로 생성가능
        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

        farm1.setRabbit(new Rabbit());
        farm1.getRabbit().cry();

        farm2.setRabbit(new Bunny());
        farm2.getRabbit().cry();

        farm3.setRabbit(new DrunkenBunny());
        farm3.getRabbit().cry();



    }
}
