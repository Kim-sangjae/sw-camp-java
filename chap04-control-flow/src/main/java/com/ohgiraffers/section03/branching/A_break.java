package com.ohgiraffers.section03.branching;

public class A_break {
    /* break 사용에 대한 흐름을 이해하고 적용할 수 있다. */
    public void testSimpleBreakStatement() {

        int i = 1;
        int sum = 0;
        /* 조건식이 true인 경우 무한 루프 */
        while(true) {
            sum += i++;
            /* 원하는 조건에 도달하면 중단하도록 */
            if(i > 100) break;
        }
        System.out.println("sum = " + sum);
    }

    /* 중첩 반복문 내의 break 사용에 대한 흐름을 이해하고 적용할 수 있다. */
    public void testSimpleBreakStatement2() {
        for(int dan = 2; dan <= 9; dan++) {
            if(dan > 5) break;
            System.out.println("===== " + dan + "단 =====");
            for(int su = 1; su <= 9; su++) {
                /* break는 모든 반복문을 종료하는 것이 아니라
                * 가장 인접한 반복문의 실행을 종료한다. */
                if(su > 5) break;
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }
    /* 중첩 반복문 내에서 break 사용 시 jump에 대한 흐름을 이해할 수 있다. */
    public void testJumpBreak() {
        /* 조건식이 없으면 무한 루프 */
        label:
        for(;;) {
            for(int i = 0; i < 10; i++) {
                System.out.println(i);
                /* break만 작성 시에는 인접한 반복문을 탈출하지만
                * 명시할 경우 명시 된 반복문을 탈출한다. */
                if(i == 3) break label;
            }
        }
    }






}
