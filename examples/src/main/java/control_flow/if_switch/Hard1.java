package control_flow.if_switch;

import java.util.Scanner;

public class Hard1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요 : ");
        int first = sc.nextInt();

        System.out.println("두번째 숫자를 입력해주세요 : ");
        int second = sc.nextInt();

        System.out.println("연산 기호를 입력해주세요 : ");
        String cal = sc.next();



        switch(cal){
            case "+" :
                System.out.println(first+ " + " + second + " = " + (first+second));
                break;
            case "-" :
                System.out.println(first+ " - "+ second + " = " + (first-second));
                break;
            case "*" :
                System.out.println(first+" x "+second + " = " + (first*second));
                break;
            case "/" :
                System.out.println(first+" / "+second + " = " + (first/second));
                break;
            case "%" :
                System.out.println(first+" % "+second + " = " + (first%second));
                break;
            default:
                System.out.println("정확한 연산기호를 입력해주세요");
        }

    }
}
