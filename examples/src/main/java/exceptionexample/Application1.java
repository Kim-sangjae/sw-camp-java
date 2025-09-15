package exceptionexample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 2
         *
         * ----- 출력 예시 -----
         *
         * 결과 : 5
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 십
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 유효한 정수를 입력하세요.
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 0
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 0으로 나누는 것은 허용되지 않습니다.
         * 실행이 완료되었습니다.
         */

        Scanner sc = new Scanner(System.in);

        int num1=0;
        int num2=0;

        try {

            System.out.print("분자 입력 : ");
            num1 = sc.nextInt();

            System.out.print("분모 입력 : ");
            num2 = sc.nextInt();

            System.out.println("결과 : " + (num1 / num2));

        } catch (ArithmeticException e) {
            System.out.println("0으로 나누는것은 허용되지 않습니다");
        } catch (InputMismatchException e){
            System.out.println("유효한 정수를 입력하세요.");
        } finally {
            System.out.println("실행이 완료되었습니다");
        }










    }
}
