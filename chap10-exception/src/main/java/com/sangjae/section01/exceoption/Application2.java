package com.sangjae.section01.exceoption;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            // try : 예외 발생 가능성이 있는코드 작성
            exceptionTest.checkEnoughMoney(1000,5000);
            exceptionTest.checkEnoughMoney(7000,5000);
            System.out.println("상품 구입 완료");
        } catch (Exception e) {
            // catch : try 에서 예외 발생한 후 던져지면 catch 블럭에서 잡아냄
            System.out.println("구입 불가");
        }
        // 예외처리를 했기 때문에 처리를 한 후 프로세스 정상 수행 후 종료
        System.out.println("프로그램 종료");
    }
}
