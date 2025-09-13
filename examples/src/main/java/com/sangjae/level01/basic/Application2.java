package com.sangjae.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String word = sc.nextLine();


        String replaceWord = word.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
        String[] splitWord = replaceWord.split("\\s+");

        StringBuilder result = new StringBuilder();
        boolean[] counted = new boolean[splitWord.length];

        int maxCount = 0;
        String maxWord = "";

        for (int i = 0; i < splitWord.length; i++) {
            if (counted[i]) continue;

            int count = 1;
            for (int j = i + 1; j < splitWord.length; j++) {

                if (splitWord[i].equals(splitWord[j])) {
                    count++;

                    counted[j] = true;
                }
            }

            result.append(splitWord[i]).append(" : ").append(count).append("\n");

            if (count > maxCount) {
                maxCount = count;
                maxWord = splitWord[i];
            }
        }



        System.out.println("===== 단어 빈도 =====");
        System.out.print(result);
        System.out.println("가장 빈도 높은 단어 : " + maxWord + " (" + maxCount + " 번)");


    }
}

//        StringBuilder truncateWord = new StringBuilder();
//        int[] countStr = new int[splitWord.length]; // 중복 단어 체크
//
//        for (int i = 0; i < splitWord.length; i++) {
//
//
//            for (int j = 0; j < i; j++) {
//                if (splitWord[i].equals(splitWord[j])) {
//                    countStr[i] +=1;
//                    break;
//                }
//            }
//
//
//            truncateWord.append(splitWord[i]).append(" ");

        // for 1

//        System.out.println(truncateWord);
//        for (int i : countStr) {
//            System.out.print(i + " " );
//        }


//        for (int i = 0; i < splitWord.length; i++) {
//            System.out.println(splitWord[i] + " : " + (countStr[i]+1));
//            String a = splitWord[i] + " : " + (countStr[i]+1);
//
//        }

//        String [] last = new String[splitWord.length];
//
//        for (int i = 0; i < splitWord.length; i++) {
//
//            last[i] = splitWord[i] + " : " + (countStr[i]+1) + i +"번";
//
//            for(int j  = 0; j<splitWord.length; j++){
//
//                if(splitWord[i].equals(splitWord[j])){
//                   last[i]  =  splitWord[j] + " : " + (countStr[j]+1);
//                   break;
//                }
//
//            }
//
//        }
//
//        for (String s : last) {
//            System.out.println(s);
//        }
//
//
//
//    }

