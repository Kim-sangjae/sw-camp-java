package com.sangjae.section01.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        //LinkedList

        LinkedList<String> lList = new LinkedList<>();

        // list 계열의 클래스이기 때문에 구현코드는 좀 다르지만
        // 결국 호출해서 사용하는 메서드 ArrayList 와 똑같다

        lList.add("apple");
        lList.add("banana");
        lList.add("mango");
        lList.add("banana");

        for (int i = 0; i < lList.size(); i++) {
            System.out.println(lList.get(i));
        }
        for (String s : lList) {
            System.out.println(s);
        }

        //isEmpty : 비어있는지 확인
        System.out.println(lList.isEmpty());
        lList.clear(); // 내용 삭제
        System.out.println(lList.isEmpty());
        for (String s : lList) {
            System.out.println("clear 후 : " + s);
        }



        List<String> stringList = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();

    }
}
