package com.sangjae.section01.poly;

public class Application {
    public static void main(String[] args) {

        Animal[] animals = {new Tiger(), new Rabbit()};

        Animal a1 = new Tiger();
        Animal a2 = new Rabbit();
        a1.cry();
        a2.cry();

        ((Tiger)a1).bite();
        ((Rabbit)a2).jump();

        if(a1 instanceof  Tiger) ((Tiger)a1).bite();



        for(Animal a : animals){
            a.eat();
            a.cry();
            a.run();
        }

    }
}
