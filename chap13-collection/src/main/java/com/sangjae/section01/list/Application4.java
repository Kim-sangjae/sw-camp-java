package com.sangjae.section01.list;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        //stack
        Stack<Integer> integerStack = new Stack<>();

        // Vector 를 상속했기 때문에 add도 사용 가능하나
        // stack의 사용법에 맞도록 push를 사용하는것이 권장된다
        //integerStack.add(10);
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);


        // stack에서 요소를 찾을때 : search
        // 인덱스가 아닌 stack순서대로 반환 12345 -> 54321
        System.out.println(integerStack.search(3));


        // 요소 꺼내기
        // peek : 가장 마지막 요소 반환
        // pop : 가장마지막에 있는 요소 제거 후 반환

        System.out.println(integerStack.peek());
        System.out.println(integerStack);
        System.out.println(integerStack.pop());
        System.out.println(integerStack);
        System.out.println("------------");

        System.out.println(integerStack.peek());
        System.out.println(integerStack);
        System.out.println(integerStack.pop());
        System.out.println(integerStack);
        System.out.println("------------");

        System.out.println(integerStack.peek());
        System.out.println(integerStack);
        System.out.println(integerStack.pop());
        System.out.println(integerStack);
        System.out.println("------------");

        System.out.println(integerStack.peek());
        System.out.println(integerStack);
        System.out.println(integerStack.pop());
        System.out.println(integerStack);
        System.out.println("------------");

        System.out.println(integerStack.peek());
        System.out.println(integerStack);
        System.out.println(integerStack.pop());
        System.out.println(integerStack);
        System.out.println("------------");

        // pop 으로 하나씩 빼다가 비게 되면 결국 EmptyStackException 이 발생
        System.out.println(integerStack.peek());
        System.out.println(integerStack);
        System.out.println(integerStack.pop());
        System.out.println(integerStack);
        System.out.println("------------");

    }//main
}
