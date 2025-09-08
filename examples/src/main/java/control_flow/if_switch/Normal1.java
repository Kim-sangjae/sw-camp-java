package control_flow.if_switch;

import java.util.Scanner;

public class Normal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println("짝수다");
        }else if (a%2!=0){
            System.out.println("홀수다");
        }else {
            System.out.println("반드시 1~10 사이의 정수를 입력해 주세요");
        }


    }// main
}
