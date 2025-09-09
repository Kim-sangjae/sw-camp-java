package com.sangjae.section02.demensional;

public class Application2 {
    public static void main(String[] args) {
        // 가변 배열
        int[][] arr = new int[3][];

        System.out.println(arr);
        System.out.println(arr[0]);
//        System.out.println(arr[0][0]);

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];


        // 가변 배열 값 넣기
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(arr[0] +""+ arr[1]);


    }
}
