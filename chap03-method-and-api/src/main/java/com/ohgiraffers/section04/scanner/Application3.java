package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* 입력 버퍼에 남은 개행 문자로 인해 nextLine이 개행 문자를 읽고 바로 넘어가버리는 문제 */
        System.out.print("숫자 입력 : ");
        int num = scanner.nextInt();
        System.out.println("num : " + num);

        scanner.nextLine(); // 버퍼에 남은 개행문자를 읽어서 버린다.

        System.out.print("문자열 입력 : ");
        String str = scanner.nextLine();
        System.out.println("str : " + str);

        /* next가 유효한 토큰만 읽어간 뒤 남은 문자열을 nextInt가 처리하면 타입이 맞지 않아
        * 런타임 에러가 발생하는 상황 */
        System.out.print("문자열 입력 : ");
        String str2 = scanner.next();
        System.out.println("str2 : " + str2);

        System.out.print("숫자 입력 : ");
        int num2 = scanner.nextInt();
        System.out.println("num2 : " + num2);


    }
}
