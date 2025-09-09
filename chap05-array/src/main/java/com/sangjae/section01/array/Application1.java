package com.sangjae.section01.array;

public class Application1 {
    public static void main(String[] args) {
        // 배열의 선언 및 할당
        int[] arr = new int[5];

        // 하나의 이름으로 관리되는 연속된 메모리 공간 , 해당공간은 인덱스를 통해 접근
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        // 인덱스를 통해 반복문으로 처리할 수 있다
        for(int i = 0 , value=0; i <arr.length; i++){
            arr[i] = value += 10;
            System.out.println(arr[i]);
        }

        // 배열 값 합계
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        System.out.println(sum);


        // 향상된 for문
        for(int i : arr){
            System.out.println(i);
        }

        for(int i : arr){

            char i1 = (char) i;
            System.out.println(i1);
        }

    }
}
