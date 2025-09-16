package com.sangjae.section01.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        // ArrayList
        // 기존 배열 + 크기변경 , 요소 추가 삭제 정렬

        // Collection > List > ArrayList 의 상속구조
        ArrayList alist = new ArrayList();
        List list = new ArrayList();
        Collection clist = new ArrayList();

        // 제네릭 타입을 선언하지 않아서 모든 object 타입을 대입할 수 있다
        // 안정성이 떨어짐
        alist.add(10);
        alist.add("asd");

        // 제네릭 타입을 정의 해서 사용한다
        List<String> slist = new ArrayList<>();

        // String 제네릭 타입선언해서 String 값만 들어갈 수 있다
//        slist.add(10);
        slist.add("apple");
        slist.add("banana");
        slist.add("orange");
        // list 는 중복값도 가능하다 (순서가 정해져있기 때문)
        slist.add("banana");

        System.out.println(slist);
        // 배열의 길이가 아닌 , 저장된 요소의 개수를 반환
        // null 값이 들어갈 일이 없다.
        System.out.println(slist.size());

        for (int i = 0; i < slist.size(); i++) {
            // get(index) 인덱스에 저장된 요소 하나를 반환
            System.out.println(slist.get(i));
        }
        for (String s : slist) {
            System.out.println(s);
        }


        // add(index , data) 를 통해 원하는 인덱스에 값 저장
        slist.add(1,"mango");
        for (String s : slist) {
            System.out.print(s + " ");
        }


        // set(index , data) 인덱스 요소 수정
        slist.set(2 , "grape");
        System.out.println(slist);


        // remove(index) 해당 인덱스 삭제
        slist.remove(1);
        System.out.println(slist);


        // Collections.sort(collection) 요소 정렬
        Collections.sort(slist);
        System.out.println(slist);






    }// main
}
