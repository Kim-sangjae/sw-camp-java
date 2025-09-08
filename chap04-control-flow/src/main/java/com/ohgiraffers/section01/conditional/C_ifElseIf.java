package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    /* if else if 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
    public void testIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : ");
        int score = sc.nextInt();
        String grade = "";
        
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(name + " 학생의 점수는 " + score + "이며, 학점은 " + grade + "입니다.");
    }

    /* if else if 중첩 사용에 대한 흐름을 이해하고 적용할 수 있다. */
    public void testNestedIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : ");
        int score = sc.nextInt();
        String grade = "";

        if (score >= 90) {
            grade = "A";
            if(score >= 95) grade += "+";
        } else if (score >= 80) {
            grade = "B";
            if(score >= 85) grade += "+";
        } else if (score >= 70) {
            grade = "C";
            if(score >= 75) grade += "+";
        } else if (score >= 60) {
            grade = "D";
            if(score >= 65) grade += "+";
        } else {
            grade = "F";
        }

        System.out.println(name + " 학생의 점수는 " + score + "이며, 학점은 " + grade + "입니다.");
    }

    /* 위의 메소드에서 중복 코드를 개선 */
    public void testImproveIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : ");
        int score = sc.nextInt();
        String grade = "";

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        if (score >= 60 && score % 10 >= 5 || score == 100) {
            grade += "+";
        }

        System.out.println(name + " 학생의 점수는 " + score + "이며, 학점은 " + grade + "입니다.");
    }
}
