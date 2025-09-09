package com.sangjae.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        // 얕은 복사 : 주소값만 복사해온다 (같은 배열을 공유한다)
        int[] origin = {1,2,3,4,5};

        int[] copy = origin;

        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());

        copy[2] = 99;
        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(origin));



    }
}
