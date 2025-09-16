package com.sangjae.section02.extend;

public class WildCard {
    // 타입변수 제한을 선언해놓은 RabbitFarm 보다 좀더 유연하게 wildcard 사용
    public void anyType(RabbitFarm<?> farm){
        farm.getRabbit().cry();
    }

    // 이중 제약
    // rabbitFarm 은 토끼 타입만 가능하다
    // 여기서는 더 나아가 bunny 타입을 확장한 것만 허용하게 제약을 또 걸었다
    public void extendType(RabbitFarm<? extends  Bunny> farm){
        farm.getRabbit().cry();
    }

    public void superType(RabbitFarm<? super  Bunny> farm){
        farm.getRabbit().cry();
    }


}
