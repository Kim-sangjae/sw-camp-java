package array.array1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Advanced2 {
    public static void main(String[] args) {

        int[] n = new int[4];
        Random rd = new Random();
        int count = 0;


        while (count < 4) {
            boolean check = false;
            int random = rd.nextInt(10);


            for (int i = 0; i < count; i++) {
                if (n[i] == random) {
                    check = true;
                    break;
                }
            }

            if (!check) {
                n[count] = random;
                count++;
            }

        }

        Scanner sc = new Scanner(System.in);

        int chance = 10;


        while (chance > 0) {
            int strike = 0;
            int ball = 0;
            System.out.println(chance+"회 남으셨습니다");
            System.out.print("4자리 정수를 입력해주세요 : ");
            String pick = sc.nextLine();

            if (pick.length() != 4 || !pick.matches("^?\\d+$")) {
                System.out.println("4자리의 정수를 입력 해야합니다.");
                System.out.println();
                continue;
            }

            for (int i = 0; i < n.length; i++) {
                int pickInt = pick.charAt(i) - '0';

                if (n[i] == pickInt) {
                    strike++;
                } else {
                    for (int j = 0; j < n.length; j++) {
                        if (n[j] == pickInt) {
                            ball++;
                            break;
                        }
                    }
                }//else
            }// for1
            if(strike == 4){
                System.out.println("정답입니다");
                return;
            }
            System.out.println("아쉽네요 " + strike + "S " + ball + "B 입니다" );
            System.out.println();
            System.out.println(Arrays.toString(n));
            chance--;
        }


    }
}
