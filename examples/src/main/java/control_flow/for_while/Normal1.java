package control_flow.for_while;

import java.util.Scanner;

public class Normal1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("문자열을 입력하세요 : ");
       String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(i + " : " + word.charAt(i));
        }

    }
}
