package com.sangjae.section01.list.dto;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {
        // Queue
        // LinkedList

        Queue<String> queue = new LinkedList<>();


        // 큐에 데이터 삽입은 offer
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");

        System.out.println(queue);



        // 데이터 꺼내기
        // peek : 큐에 가장 먼저들어온 요소 반환
        // poll : 가장 먼저들어온 요소를 제거 후 반환

        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        // 큐 는 스택과 달리 빈값이 있어도 오류가 안남 --> null 값이 나옴

    }//main
}
