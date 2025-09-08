package control_flow.for_while;

import java.util.Random;
import java.util.Scanner;

public class Hard2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int random = rd.nextInt(101) + 1;

        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.print("정수를 입력하세요 : ");
            int pickNum = sc.nextInt();
            count++;

            if(random == pickNum){
                System.out.println("정답입니다 " + count +"회만에 정답을 맞추셨습니다.");
                break;
            } else if (random > pickNum) {
                System.out.println("입력하신 정수보다 큽니다.");
            } else {
                System.out.println("입력하신 정수보다 작습니다.");
            }


        }


    }
}
