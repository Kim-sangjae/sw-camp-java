package control_flow.if_switch;

import java.util.Scanner;

public class Normal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BMI 수치 계산");
        System.out.println("체중을 입력해주세요 : ");
        double kg = sc.nextDouble();
        System.out.println("신장(m)을 입력해주세요 : ");
        double height = sc.nextDouble();

        double bmi =  Math.floor( (kg/(height*height)) * 100) / 100;
        System.out.println("bmi 수치는 : " + bmi);




    }
}
