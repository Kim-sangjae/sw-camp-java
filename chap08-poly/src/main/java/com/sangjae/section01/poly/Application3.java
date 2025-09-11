package com.sangjae.section01.poly;

public class Application3 {
    public static void main(String[] args) {
        feed(new Tiger());
        feed(new Rabbit());


    }

    public static void feed(Animal animal){
        animal.eat();
    }

}
