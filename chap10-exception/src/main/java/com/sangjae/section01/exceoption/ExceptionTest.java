package com.sangjae.section01.exceoption;

public class ExceptionTest {

    public void checkEnoughMoney(int price , int money) throws Exception {

        System.out.println("보유하신 금액은 " + money +" 입니다");
        if (money >= price){
            System.out.println("상품을 구매할 수 있습니다");
        } else {
            /* 강제 예외 발생시키기 */
            /* throws Exception -> 예외에 대한 처리를 메서드 호출부에서 처리하도록 던지는거 */
            throw new Exception();
        }

        System.out.println("구매감사");

    }

}
