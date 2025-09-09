package com.sangjae.section02.demensional;

public class Application1 {
    public static void main(String[] args) {
        // 다차원 배열

        int[][] arr;
//        int[] arr1[];
//        int arr2[][];

        arr = new int[3][];

        arr[0] = new int[5];
        arr[1] = new int[5];
        arr[2] = new int[5];


        // 선언과 동시 할당
        arr = new int[3][5];

        // 배열 반복문 처리
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
