package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* 자료형별 값 입력 받기 */
        /* 문자열 */
//        System.out.print("이름 입력 : ");
//        String name = scanner.nextLine();
//        System.out.println("name : " + name);

        /* 정수
        * 숫자가 아닌 값을 입력하거나 int 범위를 넘어가는 정수를 입력하면
        * java.util.InputMismatchException 이 발생한다.
        * 런타임(실행 시) 에러 발생 */
//        System.out.print("나이 입력 : ");
//        int age = scanner.nextInt();
//        System.out.println("age : " + age);

        /* 실수 값 */
//        System.out.print("키 입력 : ");
//        double height = scanner.nextDouble();
//        System.out.println("height : " + height);

        /* 논리값
        * true or false 값 이외는 java.util.InputMismatchException 발생 */
//        System.out.print("참과 거짓 중 하나를 true or false로 입력 : ");
//        boolean isTrue = scanner.nextBoolean();
//        System.out.println("isTrue : " + isTrue);

        /* 문자
        * char 타입으로 반환하는 메소드는 Scanner에 존재하지 않으므로
        * String에서 제공하는 문자 하나를 분리하는 메소드를 활용해볼 수 있다.
        * 문자열의 길이를 넘어가는 index를 전달할 경우 java.lang.StringIndexOutOfBoundsException
        * 라는 런타임 에러 발생. (index는 0부터 시작)
        * */
        System.out.print("아무 문자나 입력 : ");
        char ch = scanner.nextLine().charAt(0);
        System.out.println("첫 번째 문자 : " + ch);
    }
}
