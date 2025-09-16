package com.sangjae.section02.extend;

// Rabbit 을 상속 받은 타입클래스만 허용
public class RabbitFarm <T extends Rabbit>{

    private T rabbit;

    public RabbitFarm(){};

    public RabbitFarm(T rabbit){
        this.rabbit = rabbit;
    }


    public T getRabbit() {
        return rabbit;
    }

    public void setRabbit(T rabbit) {
        this.rabbit = rabbit;
    }
}
