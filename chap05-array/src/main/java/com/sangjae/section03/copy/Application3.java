package com.sangjae.section03.copy;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
    // 깊은 복사 : 배열의 값들을 복사해서 가져온 새로운 배열을 생성

        int[] origin = {1,2,3,4,5};
        int[] copy = new int[origin.length];

        //1 for문 활용
        for (int i = 0; i < origin.length; i++) {
            copy[i] = origin[i];
        }


        //2 메서드 활용
        System.out.println("=== origin ===");
        System.out.println(Arrays.toString(origin));
        print(origin);
        System.out.println("=== copy ===");
        System.out.println(Arrays.toString(copy));
        print(copy);


        // Object -> clone()
        // 완전히 똑같은 배열의 복제본 생성
        int[] copy2 = origin.clone();
        System.out.println("=== copy2 ===");
        print(copy2);


        // System -> arraycopy()
        int [] copy3 = new int[10];
        System.arraycopy(origin,0,copy3,3,origin.length);
        System.out.println("=== copy3 ===");
        print(copy3);


        // Arrays -> copyOf()
        int[] copy4 = Arrays.copyOf(origin,7);
        int[] copy5 = Arrays.copyOf(origin,3);

        System.out.println("=== copy4 ===");
        print(copy4);
        System.out.println("=== copy5 ===");
        print(copy5);




    }


    public static void print(int[] array){
        System.out.println("array : " + array.hashCode());
        System.out.println("array : " + Arrays.toString(array));
    }

}
