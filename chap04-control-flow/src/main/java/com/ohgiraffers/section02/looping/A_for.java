package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    /* for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
    public void testSimpleForStatement() {
//        for (초기식; 조건식; 증감식) {
        for (int i = 0; i < 10; i++) {
            System.out.println("출력 : " + i);
        }
        /* 초기식에서 선언 된 변수는 for 블럭 외부에서 사용 불가 */
//        System.out.println("출력 : " + i);

    }
    /* 1부터 특정 값 (1~100 사이의 난수)까지의 합계 */
    public void testForExample() {
        int random = (int) (Math.random() * 100) + 1;
        int sum = 0;
        for (int i = 0; i <= random; i++) {
            sum += i;
        }
        System.out.println(random + "까지의 합계 : " + sum);
    }
    /* 사용자에게 정수 2개를 입력 받아 작은 값부터 큰 값까지의 합계를 구한다. */
    public void testForExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = sc.nextInt();

        /* 사전에 입력 받은 값의 크기를 통해 작은 수와 큰 수를 판별한다. */
        int min = 0;
        int max = 0;

        if (first > second) {
            min = second;
            max = first;
        } else {
            min = first;
            max = second;
        }

        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }

        System.out.println(min + "에서 " + max + "까지의 합계 : " + sum);
    }









}
