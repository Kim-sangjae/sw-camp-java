package com.sangjae.section03.interfaceimplements;

public interface InterProduct {
    /* 인터페이스는 상수 필드만 작성 가능하다.
    * 상수 필드만 가질 수 있기 때문에 묵시적으로 public static final이다. */
    public static final int MAX_NUM = 100;
    int MIN_NUM = 0;

    /* 인터페이스는 생성자를 가질 수 없다. */
//    public InterProduct(){}

    /* 추상 메서드만 작성 가능하다.
    * 묵시적으로 public abstract의 의미를 가진다. */
    public abstract void nonStaticMethod();
    void abstMethod();

    /* static 메소드는 작성 가능하다. (jdk 1.8 버전 추가) */
    public static void staticMethod() {
        System.out.println("InterProduct 인터페이스의 staticMethod");
    }

    /* default 키워드를 사용하면 non static 메소드도 작성 가능하다. (jdk 1.8 버전 추가)
    * default 메소드는 완성 되어 있으므로 오버라이딩 강제화 되지 않는다.
    * */
    public default void defaultMethod() {
        System.out.println("InterProduct 인터페이스의 defaultMethod");
    }

}
