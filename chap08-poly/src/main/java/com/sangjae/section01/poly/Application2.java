package com.sangjae.section01.poly;

public class Application2 {
    public static void main(String[] args) {

        Animal[] a = {new Tiger() , new Rabbit() , new Tiger() , new Rabbit()};

        for (Animal animal : a) {
            animal.eat();
            if(animal instanceof Tiger) ((Tiger) animal).bite();
            if(animal instanceof Rabbit) ((Rabbit) animal).jump();
        }

    }
}
