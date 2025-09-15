package com.sangjae.section02.userexception;

import com.sangjae.section02.userexception.exception.MoneyNegativeException;
import com.sangjae.section02.userexception.exception.NegativeException;
import com.sangjae.section02.userexception.exception.NotEnoughMoneyException;
import com.sangjae.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney( int price , int money)
            throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
            //throws NegativeException, NotEnoughMoneyException {
            //throws Exception {

        if (price < 0){
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다");
        }
        if (money < 0){
            throw new MoneyNegativeException("보유 금액은 음수일 수 없습니다.");
        }
        if (money < price){
            throw new NotEnoughMoneyException("보유 금액이 충분하지 않습니다");
        }

        System.out.println("즐거운 쇼핑 하세요");
    }


}
