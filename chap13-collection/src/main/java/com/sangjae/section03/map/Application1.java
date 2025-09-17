package com.sangjae.section03.map;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        // HashMap
        HashMap map = new HashMap();

        // 키와 값 쌍으로 저장
        map.put("one",new Date());
        map.put("12","red Apple");
        map.put(33,123);

        // 저장순서는 무관하다
        System.out.println("map : " + map);


        map.put(12,"yellow banana");
        map.put(9,"yellow banana");
        // 키값은 중복 x 중복되면 덮어씌어진다 , value 값은 가능
        System.out.println("map : " + map);

        // 키값을 통해 가져온다
        System.out.println(map.get(12));

        // 키를 통해 entry(키+값)을 삭제한다
        map.remove(9);
        System.out.println(map);



        // // /// //
        // 제네릭 사용
        HashMap<String , String> hmap = new HashMap<>();
//        hmap.put(11,22); // 불가능 string값으로 지정해놨음

        hmap.put("one","java");
        hmap.put("two","mysql");
        hmap.put("three","jdbc");
        hmap.put("four","html");

        // map 타입의 순회 방법
        // 1. keySet() : 키값을 순회
        Iterator<String> keIter = hmap.keySet().iterator();

        while(keIter.hasNext()){
            String key = keIter.next();
            String value = hmap.get(key);
            System.out.println(key + " = " + value);
        }

        for(String key : hmap.keySet()){
            String value = hmap.get(key);
            System.out.println(key + " = " + value);
        }



        // values() : value값 꺼내기
        Collection<String> values = hmap.values();
        Iterator<String> valueIter = values.iterator();
        while(valueIter.hasNext()){
            System.out.println("value: " + valueIter.next());
        }



        // entrySet()
        Set<Map.Entry<String,String>> set = hmap.entrySet();
        Iterator<Map.Entry<String,String>> setIter = set.iterator();
        while (setIter.hasNext()){
            Map.Entry<String,String> entry = setIter.next();
            System.out.println(entry.getKey() + "  : " + entry.getValue());
        }


        for (Map.Entry<String, String> stringStringEntry : hmap.entrySet()) {
            System.out.println(stringStringEntry.getKey() + "  : " + stringStringEntry.getValue());
        }





    }//main
}
