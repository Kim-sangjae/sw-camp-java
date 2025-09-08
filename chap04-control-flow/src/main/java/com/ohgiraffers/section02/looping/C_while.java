package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {
    /* 단독 while 문의 흐름을 이해하고 적용할 수 있다. */
    public void testSimpleWhileStatement() {
        // 초기식
        int i = 0;

        while (i < 10) {    // 조건식
            System.out.println("출력 : " + i);
            // 증감식
            i++;
        }
    }
    /* 키보드로 문자열을 입력 받고 반복적으로 출력한다. (횟수 제한 X)
    * 단, "exit" 라는 입력 값이 있을 경우 반복을 종료한다.
    * */
    public void testWhileExample() {
        Scanner sc = new Scanner(System.in);
        String input = "";

        while (!input.equals("exit")) {
            System.out.print("문자열 입력 : ");
            input = sc.nextLine();
            System.out.println("입력 받은 문자열 : " + input);
        }
    }

    /* do while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
    public void testSimpleDoWhileStatement() {
        /* do 뒤의 블럭에 진입하여 무조건 1번은 실행하고 while 뒤의 조건을 확인하여
        * 반복 실행하거나 조건이 맞지 않으면 블럭을 빠져나감 */
        do {
            System.out.println("do while 실행");
        } while (false);
        
        /* while(false) {
            System.out.println("while 실행");
        } */
    }


}
