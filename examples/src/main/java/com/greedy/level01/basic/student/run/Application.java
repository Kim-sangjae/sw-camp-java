package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] sDto = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);
        int maxStudent = 0;

        while(maxStudent<10){
            int grade;
            int classroom;
            String name;
            int kor;
            int eng;
            int math;
            System.out.println("---학생정보 추가---");

            System.out.print("학년 : ");
            grade = sc.nextInt();

            System.out.print("반 : ");
            classroom = sc.nextInt();

            System.out.print("이름 : ");
            sc.nextLine();
            name = sc.nextLine();

            System.out.print("국어점수 : ");
            kor = sc.nextInt();

            System.out.print("영어점수 : ");
            eng = sc.nextInt();

            System.out.print("수학점수 : ");
            math = sc.nextInt();

            sDto[maxStudent] = new StudentDTO(grade,classroom,name,kor,eng,math);

            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            String c = sc.next();

            if(c.equals("n")) break;

            maxStudent++;

        }

       for(int i =0; i < sDto.length; i++){
           if(sDto[i] != null){
               System.out.println(sDto[i].getInformation());
           }else{break;}
       }


    }
}
