package control_flow.for_while;

import java.util.Scanner;

public class Hard3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        label:
        System.out.print("문자열 입력 : ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            //아스키 코드로 영어문자인지 체크
            int c = (int) s.charAt(i);

            if (!((c > 96 && c < 123) || (c > 64 && c < 91))) {
                System.out.println("영문자가 아닌 문자가 포함되어있습니다");

                System.exit(0);
            }

        }

        System.out.print("문자입력 : ");
        String w = sc.next();


        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if( w.charAt(0) ==  s.charAt(i) ){ count++; }

        }//for

        System.out.println("입력하신 문자가 포함된 갯수 : " + count);
    }
}
