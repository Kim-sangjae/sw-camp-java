package com.sangjae.section03.references;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Application2 {
    public static void main(String[] args) {
       // 생성자 메소드 참조를 이해
        Function<String,Member> function2 = str->new Member(str);
        Function<String,Member> function = Member::new;

        Member member1 = function.apply("user01");
        Member member2 = function.apply("user02");
        System.out.println(member1.toString());
        System.out.println(member2.toString());

    }//main
}
