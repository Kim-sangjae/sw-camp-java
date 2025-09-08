package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    /* switch 문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
    public void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력 : ");
        char op = sc.next().charAt(0);
        int result = 0;

        /* 조건식(true, false)가 아니라 조건 값(정수,문자,문자열)이 들어감
        * 조건 값이 일치하는 case를 찾아 실행 후 break를 만나면 블럭을 빠져나감 */
        switch (op) {
            case '+' : result = first + second; break;
            case '-' : result = first - second; break;
            /* 의도적으로 break를 작성하지 않으면 다음 case 까지 수행 */
            case 'x' :
            case '*' : result = first * second; break;
            case '/' : result = first / second; break;
            case '%' : result = first % second; break;
            /* case에서 일치 값을 찾지 못한 경우 수행할 구문 작성 (default 블럭) */
            default:
                System.out.println("해당하는 연산 기호가 없습니다.");
                return;
        }

        System.out.println(first + " " + op + " " + second + " = " + result);
    }
}
