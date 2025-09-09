package com.sangjae.section01.array;

import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {

        /* 랜덤한 카드를 한 장 뽑아서 출력해보자 */
        /* 먼저 모양과 카드 숫자별로 값을 저장할 두 종류의 배열을 만들자 */
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        /* 배열 인덱스 범위의 난수 발생 */
        int randomShapeIndex = (int) (Math.random() * shapes.length);
        int randomCardNumberIndex = (int) (Math.random() * cardNumbers.length);

        /* index를 이용해서 출력 */
        System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " " + cardNumbers[randomCardNumberIndex] + " 카드 입니다.");
    }
}
