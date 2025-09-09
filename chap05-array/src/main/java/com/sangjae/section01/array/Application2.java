package com.sangjae.section01.array;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        // 배열의 선언 : stack 영역에 배열의 주소를 보관 할 참조변수 공간을 만드는 것
        int[] iarr;
        double[] darr;


        // 선언한 레퍼런스 변수에 배열을 할당
        iarr = new int[5];
        darr = new double[10];

        System.out.println(iarr.hashCode());
        System.out.println(iarr.length);

        // hashCode() : 객체의 주소값을 10진수의 고유정수값으로 반환하는 메서드
//        System.out.println(iarr.hashCode());
//        System.out.println(darr.hashCode());

        iarr = new int[100];
        System.out.println(iarr.hashCode());
        System.out.println(iarr.length);


//        iarr = null;
//        System.out.println(iarr.hashCode());
//        System.out.println(iarr.length);
//

        System.out.println(Arrays.toString(iarr));
    }
}
