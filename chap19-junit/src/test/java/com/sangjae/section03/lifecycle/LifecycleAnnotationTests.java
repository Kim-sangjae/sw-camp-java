package com.sangjae.section03.lifecycle;

import org.junit.jupiter.api.*;

class LifecycleAnnotationTests {
    // 테스트 메소드 실행 전 후 동작하는 어노테이션

    // 테스트 수행 전 필요한 동작을 하는 메서드
    @BeforeAll
    static void beforeAll(){
        System.out.println("before all 동작");
    }


    @BeforeEach
    void beforeEach (){
        System.out.println("beforeEach 동작");
    }


    // 테스트 사용한 자원을 해제 용도
    @AfterAll
    static void afterAll(){
        System.out.println("afterAll 동작");
    }

    @AfterEach
    void afterEach(){
        System.out.println("afterEach 동작");
    }


    @Test
    void test1(){
        System.out.println("테스트 코드 1");
    }


    @Test
    void test2(){
        System.out.println("테스트 코드 2");
    }
}
