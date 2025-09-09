package array.array1;

import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        String[] fruits = {"딸기","바나나","복숭아","키위","사과"};

        Scanner sc = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력해주세요 : ");
        int pick = sc.nextInt();

        System.out.println("--------------------");
        if (pick <=fruits.length-1){
            System.out.println(fruits[pick]);
        } else {
            System.out.println("준비된 과일이 없습니다.");
        }
    }
}
