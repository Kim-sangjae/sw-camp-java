package com.sangjae.section02.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {
        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        Set<String> set = new HashSet<>();
        Collection<String> cset = new HashSet<>();

        hashSet.add(new String("java"));
        hashSet.add(new String("mysql"));
        hashSet.add(new String("jdbc"));
        hashSet.add(new String("html"));
        hashSet.add(new String("css"));
        hashSet.add(new String("java"));

        // 1. 저장 순서가 유지 되지 않는다 (HashSet은 hash 연산을 통해 저장관리)
        // 2. 중복 값 저장 x , 동일객체 뿐 아니라 , 동등 객체도 중복으로 판별한다
        System.out.println(hashSet);

        //
        System.out.println(hashSet.contains(new String("html")));

        // set 데이터를 순회하는 방법
        // 1. 배열로 변경
        Object[] arr = hashSet.toArray();
        for (Object o : arr) {
            System.out.println(o);
        }

        // 2. Iterable 의 iterator 메소드(반복자)
        Iterator<String> iter = hashSet.iterator();
        while (iter.hasNext()){
            System.out.println("iter : " + iter.next());
        }

//        while (hashSet.iterator().hasNext()){
//            System.out.println("iter : " + hashSet.iterator().next());
//        }

        // 3. 향상된 for문
        for (Object o : hashSet) {
            System.out.println(o);
        }


    }//main
}
