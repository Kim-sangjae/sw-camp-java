package com.ohgiraffers.section06.statickeyword;

public class Applicaiton {
    public static void main(String[] args) {
        /* static 키워드에 대해 이해할 수 있다. */
        StaticFieldTest sft1 = new StaticFieldTest();
        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();
        System.out.println(sft1.getNonStaticCount());
        System.out.println(StaticFieldTest.getStaticCount());

        StaticFieldTest sft2 = new StaticFieldTest();
        sft2.increaseNonStaticCount();
        sft2.increaseStaticCount();
        System.out.println(sft2.getNonStaticCount());
        System.out.println(StaticFieldTest.getStaticCount());
    }
}
