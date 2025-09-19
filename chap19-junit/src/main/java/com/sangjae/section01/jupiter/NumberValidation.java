package com.sangjae.section01.jupiter;

public class NumberValidation {
    public void checkDivideNumbers(int firstNum , int secondNum){
        if(secondNum==0) throw new IllegalArgumentException("0으로 나눌수 없습니다");
    }
}
