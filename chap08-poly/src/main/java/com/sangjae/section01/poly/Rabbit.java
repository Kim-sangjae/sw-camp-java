package com.sangjae.section01.poly;

public class Rabbit extends Animal{

    @Override
    public void eat() {
        System.out.println("토끼가 풀을 먹어요");
    }

    @Override
    public void run() {
        System.out.println("깡총깡총");
    }

    @Override
    public void cry() {
        System.out.println("톡토토톡..");
    }



    public void jump(){
        System.out.println("!!!토끼 슈퍼점프!!!");
    }
}
