package array.multiArray;

import java.util.Random;
import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.print("가로 행의 수를 입력하세요 : ");
            int width = sc.nextInt();
            if(!(width>0 && width<11)){
                System.out.println("반드시 1~10까지의 정수를 입력해야합니다");
                continue;
            }
            System.out.print("세로 행의 수를 입력하세요 : ");
            int height = sc.nextInt();
            if(!(height>0 && height<11)){
                System.out.println("반드시 1~10까지의 정수를 입력해야합니다");
                continue;
            }

            char[][] shape = new char[width][height];
            Random rd = new Random();

            for(int i = 0; i < width; i++){

                for(int j = 0; j < height; j++){
                    char crd = (char)(rd.nextInt(26)+65);
                    shape[i][j] = crd;
                    System.out.print(shape[i][j] + " ");
                }
                System.out.println();
            }

        check = false;

        }// while
    }
}
