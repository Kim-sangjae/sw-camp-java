package com.sangjae.section02.userexception;

import com.sangjae.section02.userexception.exception.MoneyNegativeException;
import com.sangjae.section02.userexception.exception.NotEnoughMoneyException;
import com.sangjae.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        // 사용자 정의 예외 클래스
        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            //정상수행
            exceptionTest.checkEnoughMoney(30000,50000);
            // 상품가격 음수
//            exceptionTest.checkEnoughMoney(-30000,50000);
            // 보유금액 음수
//            exceptionTest.checkEnoughMoney(30000,-50000);
            // 보유금액 부족
            exceptionTest.checkEnoughMoney(50000,30000);


        } catch (PriceNegativeException | MoneyNegativeException | NotEnoughMoneyException e){ // 다형성을 통해 하나로 받을 수 있다
                                // but 이렇게 되면 각 예외마다 상세하게 처리 불가능
                System.out.println(e.getMessage());
                e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }
}
