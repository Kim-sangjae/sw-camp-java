package com.sangjae.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        // 얕은 복사 : 주소값만 복사해온다 (같은 배열을 공유한다)

        // 얕은 복사를 활용하여 매개변수와 리턴값으로 활용가능
        String[] names = {"홍길동","유관순","신사임당"};

        print(names);
        System.out.println(names.hashCode());
        System.out.println(Arrays.toString(names));

        String[] returnAnimals = getAnimal();
        System.out.println("returnAnimals : "+returnAnimals.hashCode());
        System.out.println("returnAnimals : "+Arrays.toString(returnAnimals));



    }


    public static void print(String[] sarr){
        System.out.println("sarr : "+sarr.hashCode());
        System.out.println("sarr : "+Arrays.toString(sarr));
        sarr[1] = "강감찬";
    }

    public static String[] getAnimal(){
        String[] animals = {"낙타","호랑이","나무늘보"};
        System.out.println("animals : "+animals.hashCode());
        System.out.println("animals : "+Arrays.toString(animals));
        return animals;
    }

}
