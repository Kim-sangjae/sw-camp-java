package com.sangjae.section01.exceoption;

public class Application {
    public static void main(String[] args) throws Exception {
        ExceptionTest exceptionTest = new ExceptionTest();

        /* 메서드에서 예외를 던졌기 때문에 호출할 때 무조건 처리해줘야한다
        * 단 여기서는 main 메서드 쪽으로 다시 throws 했다
        * main 메서드에 throws 를 하면 프로세스가 비정상 종료 된다*/
        exceptionTest.checkEnoughMoney(1000,5000);
        exceptionTest.checkEnoughMoney(7000,5000);
    }
}
