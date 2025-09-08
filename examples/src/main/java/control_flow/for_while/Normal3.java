package control_flow.for_while;

import java.util.Scanner;

public class Normal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char m;

            m = i % 2 == 0 ? '박' : '수';

            System.out.print(m);
        }

    }
}
