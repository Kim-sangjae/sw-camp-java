package com.sangjae.section01.poly;

public class Application4 {
    public static void main(String[] args) {

        getRendomAnimal().cry();

        Animal a = new BabyRabbit();
        Animal a1 = new Rabbit();

        BabyRabbit br = (BabyRabbit) a;
        br.jump();
        a.cry();
        a1.cry();

        System.out.println(a);
        System.out.println(br);




    }

    public static Animal getRendomAnimal(){
        int random = (int) (Math.random()*2);

        return random == 0 ?  new Rabbit() : new Tiger();
    };
}
