package control_flow.for_while;

import java.util.Scanner;

public class Hard1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("2보다 큰 정수를 입력하세요 : ");
        int n = sc.nextInt();
        boolean sosu = true;
        for (int i = 2; i < n; i++) {

            if(n%i==0){ // 2 ~ n-1 까지 하나라도 나누어떨어지면 false
                sosu=false;
                break;
            }

        }

        System.out.println(sosu?"소수이다" : "소수가 아니다");


    }
}
