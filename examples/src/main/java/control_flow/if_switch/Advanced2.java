package control_flow.if_switch;

import java.util.Scanner;

public class Advanced2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("월 급여 입력 : ");
        int month = sc.nextInt(); // 월급
        System.out.print("매출액 입력 : ");
        int sales = sc.nextInt(); // 매출

//        매출액       보너스율
//        5천만원 이상      5%
//        3천만원 이상      3%
//        1천만원 이상      1%
//        1천만원 미만      0%
        // 보너스 퍼센트
        int bonusPer = 0;

        if (sales >= 50000000){
            bonusPer = 5;
        } else if (sales >= 30000000) {
            bonusPer = 3;
        } else if (sales >= 10000000) {
            bonusPer = 1;
        } else {
            bonusPer = 0;
        }

        // 보너스 금액
        int bonusAmount = (bonusPer*sales) / 100;

        System.out.println("===================");
        System.out.println("매출액 : " + sales);
        System.out.println("보너스율 : " + bonusPer +"%");
        System.out.println("월 급여 : " + month);
        System.out.println("보너스 금액 : " + bonusAmount);
        System.out.println("===================");
        System.out.println("총 급여 : " + (month+bonusAmount));
        System.out.println();




    }
}
