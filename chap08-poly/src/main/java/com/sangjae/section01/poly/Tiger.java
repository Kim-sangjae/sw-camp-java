package com.sangjae.section01.poly;

public class Tiger extends Animal{
    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 먹는다");
    }

    @Override
    public void run() {
        System.out.println("호랑이가 어슬렁 어슬렁");
    }

    @Override
    public void cry() {
        System.out.println("어흥");
    }


    public void bite(){
        System.out.println("호랑이가 물어 뜯습니다");
    }



}
