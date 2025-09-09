package com.sangjae.section02.demensional;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        // 2차원 배열 선언 및 초기화
        // int[3][5]
        int[][] arr = { {1,2,3,4,5}, {6,7,8,9,10} ,{11,12,13,14,15}};
        int[][] arr1 = { {1,2}, {6,7,8} ,{11,12,13,14}};


        // 미리 할당된 1차원 배열로 묶기
        int[] irr = {1,2,3};
        int[] irr1 = {4,5,6,7};
        int[][] irr2 = {irr , irr1};

        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(irr2));

        irr2[0] = irr1;
        System.out.println(Arrays.deepToString(irr2));
        System.out.println(Arrays.toString(arr1));




    }
}
