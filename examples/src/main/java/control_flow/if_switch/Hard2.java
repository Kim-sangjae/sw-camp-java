package control_flow.if_switch;

import java.util.Scanner;

public class Hard2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-- 상품 가격 --");
        System.out.println("과일 이름을 입력하세요 : ");
        String name = sc.nextLine();

        String result = "";
        switch (name) {
            case "사과" : result = name + " 의 가격은 1000원 입니다."; break;
            case "바나나" : result = name + " 의 가격은 3000원 입니다."; break;
            case "복숭아" : result = name + " 의 가격은 2000원 입니다."; break;
            case "키위" : result = name + " 의 가격은 5000원 입니다."; break;
            default:
                System.out.println("준비된 상품이 없습니다");
        }

        System.out.println(result);

    }
}
