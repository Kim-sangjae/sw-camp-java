package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        /* 필드에 private이라는 접근 제한자를 붙이면 직접 접근이 금지된다.
        * 간접 접근(메소드)로 필드 값을 다룬다. */
        Monster m1 = new Monster();
        m1.setName("두치");
        m1.setHp(200);
        System.out.println(m1.getName());
        System.out.println(m1.getHp());

        Monster m2 = new Monster();
        m2.setName("뿌꾸");
        m2.setHp(-200);
        System.out.println(m2.getName());
        System.out.println(m2.getHp());

    }
}
