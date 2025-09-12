package com.sangjae.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String word = sc.nextLine();


        String[] splitWord = word.split(" ");
        int count = splitWord.length;
        StringBuilder builderWord = new StringBuilder();
        for (String s : splitWord) {

           String firstWord =  s.substring(0,1);
           String upperString  = s.replace(firstWord,firstWord.toUpperCase());

           builderWord.append(upperString).append(" ");
        }
        System.out.println(builderWord);
        System.out.println("총 단어 갯수 : " + count);
    }
}
