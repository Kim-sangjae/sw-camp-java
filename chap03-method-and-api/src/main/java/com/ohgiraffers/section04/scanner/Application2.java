package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* nextLine(), next() 메소드의 차이 */
        Scanner scanner = new Scanner(System.in);

        /* nextLine - 공백을 포함한 한줄 입력을 위해 사용 */
        System.out.print("인사말 입력 : ");
        String greeting = scanner.nextLine();
        System.out.println("nextLine : " + greeting);
        /* next - 공백 이전까지의 유효한 토큰 입력을 위해 사용 */
        System.out.print("인사말 입력 : ");
        String greeting2 = scanner.next();
        System.out.println("next : " + greeting2);
    }
}
