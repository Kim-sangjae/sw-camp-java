package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {
//    String name;
    String kinds;
    int hp;

    public void setInfo(String info) {
//         this.name = info;
        this.kinds = info;
    }

    public String getInfo() {
//        return name;
        return kinds;
    }
}
