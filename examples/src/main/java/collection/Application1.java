package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
//        학생 성적 : 100
//        추가 입력하려면 y : y
//        학생 성적 : 95
//        추가 입력하려면 y : Y
//        학생 성적 : 66
//        추가 입력하려면 y : y
//        학생 성적 : 79
//        추가 입력하려면 y : n
//        학생 인원 : 4
//        평균 점수 : 85.0

        List<Integer> avgGrade = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("학생성적 : ");
        avgGrade.add(sc.nextInt());
        sc.nextLine();

        boolean check = true;

        while (check){
            System.out.print("추가입력하려면 y : ");
            String ny = sc.nextLine();


            if(ny.equals("n")||ny.equals("N")){
                check = false;
                break;
            }

            System.out.print("학생성적 : ");
            avgGrade.add(sc.nextInt());
            sc.nextLine();
        }

        int count = avgGrade.size();
        double sum = 0;
        for (Integer i : avgGrade) {
            sum += i;
        }

        System.out.println("학생인원 : " + count);
        System.out.println("평균 : " + (float)(sum/count));



    }
}
