package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /* 생성자 사용 목적
        * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우
        * 2. 매개변수 있는 생성자의 경우 매개변수로 전달 받은 값으로 필드 초기화 할 경우
        * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하고 싶지 않을 경우
        * */
        User u1 = new User();
        System.out.println(u1.getInformation());
        User u2 = new User("user01", "pass01");
        System.out.println(u2.getInformation());
        User u3 = new User("user02", "pass02", "홍길동", new Date());
        System.out.println(u3.getInformation());
    }
}
