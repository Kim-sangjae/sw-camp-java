package com.sangjae.section01.array;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {

        // 배열에 초기화 되는 자료형 별 기본 값

        int num;
//        System.out.println(num);// 불가

        // heap 영역은 초기값이 설정 되어 할당된다
        // 정수 : 0 , 실수 : 0.0 , 논리 : false , 문자 : \u0000 , 참조 : null
        int[] i = new int[10];
        float[] f = new float[10];
        String[] s = new String[10];
        boolean[] b = new boolean[10];
        char[] c = new char[10];


        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(f));
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));


        // 배열 선언과 동시 값 초기화
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
