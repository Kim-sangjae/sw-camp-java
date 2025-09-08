package control_flow.if_switch;

import java.util.Scanner;

public class Advanced1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        int k = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int e = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int m = sc.nextInt();

        // 평균
        int avg = (k + e + m)/3;

        // 각 요소 true값 구해놓기
        boolean avgb = avg >=60;
        boolean kb = k >= 40;
        boolean eb = e >= 40;
        boolean mb = m >= 40;


        System.out.println("--- 합격 여부 ---");
        // 합격
        if(avgb && kb && eb && mb){
            System.out.println("합격입니다!");
        }

        // 평균점수 미달시 전체 점수 체크
        if(!avgb){
            System.out.println("평균점수 미달로 불합격입니다.");
            if(!kb){ System.out.println("국어 점수 미달로 불합격입니다."); }
            if(!eb){ System.out.println("영어 점수 미달로 불합격입니다."); }
            if(!mb){ System.out.println("수학 점수 미달로 불합격입니다."); }
        }

        // 평균점수는 통과이지만 다른점수가 낮을경우
        if(avgb){
            if(!kb){ System.out.println("국어 점수 미달로 불합격입니다."); }
            if(!eb){ System.out.println("영어 점수 미달로 불합격입니다."); }
            if(!mb){ System.out.println("수학 점수 미달로 불합격입니다."); }
        }





    }
}
