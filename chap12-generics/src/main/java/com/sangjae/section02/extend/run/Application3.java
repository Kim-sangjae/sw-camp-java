package com.sangjae.section02.extend.run;

import com.sangjae.section02.extend.*;

public class Application3 {
    public static void main(String[] args) {

        WildCard wildCard = new WildCard();


        //매개변수 타입제약 없는경우
        //토끼타입이면 모두 가능
        wildCard.anyType(new RabbitFarm<>(new Rabbit()));
        wildCard.anyType(new RabbitFarm<>(new Bunny()));
        wildCard.anyType(new RabbitFarm<>(new DrunkenBunny()));


        //extends bunny 제약
        //wildCard.extendType(new RabbitFarm<>(new Rabbit()));
        wildCard.extendType(new RabbitFarm<>(new Bunny()));
        wildCard.extendType(new RabbitFarm<>(new DrunkenBunny()));


        //super bunny 제약
        wildCard.superType(new RabbitFarm<>(new Rabbit()));
        wildCard.superType(new RabbitFarm<>(new Bunny()));
        wildCard.superType(new RabbitFarm<>(new DrunkenBunny()));
        //wildCard.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));


    }
}
