package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    /* for문 중첩 사용에 대한 흐름을 이해하고 적용할 수 있다. */
    public void printGugudanFromTwoToNine() {
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("===== " + dan + "단 =====");
            for (int su = 1; su <= 9; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }
    /* 별찍기
    * 입력 받은 정수만큼 한 행에 '*' 을 행의 번호 개씩 출력하기
    * 예) 5
    * *
    * **
    * ***
    * ****
    * *****
    * */
    public void printTriangleStar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력하고 싶은 행의 개수 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }







}
