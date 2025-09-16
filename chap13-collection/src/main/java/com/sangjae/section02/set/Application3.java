package com.sangjae.section02.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        // TreeSet : 정렬

        TreeSet<String> test = new TreeSet<>();
        test.add("java");
        test.add("mysql");
        test.add("html");
        test.add("css");
        test.add("java");

        // 자동 오름차순 , 이진 트리의 형태로 요소를 저장
        // String 클래스 implements CompareTo 의 compareTo 메서드 오버라이딩 기준 정렬
        System.out.println(test);

        // 로또번호 생성기
        Set<Integer> lotto = new TreeSet<>();
        while (lotto.size() < 6){
            lotto.add((int)(Math.random()*45)+1);
        }
        System.out.println("lotto : " + lotto);


    }//main
}
