package com.sangjae.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        // stream 에 대해 이해
        // Collection 을 다룰 수 있다
        List<String> list = new ArrayList<>(
                Arrays.asList("hello","stream","world")
        );

        // 특정 요소를 찾기 위해 iterator or  foreach 등을 활용
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if(str.equals("stream")){
                System.out.println("걸러낸 값: " + str);
            }
        }


        // 이런 반복 동작을 stream을 활용하여 간단하게 해결
        list.stream()
                .filter("stream"::equals) //true인 요소만 남는다
                .forEach(str-> System.out.println("걸러진값 : " + str));


    }//main
}
