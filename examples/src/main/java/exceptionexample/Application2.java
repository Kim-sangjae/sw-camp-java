package exceptionexample;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");

        String birth = sc.nextLine();
        try {
            checkAge(birth);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }


    }


    public static void checkAge(String birth) throws InvalidAgeException{

        int year = 0;
        int month = 0;
        int day = 0;

        try {
           year = Integer.parseInt(birth.substring(0,4));
           month = Integer.parseInt(birth.substring(5,7));
           day = Integer.parseInt(birth.substring(8,10));

       } catch (Exception e){
           System.out.println("날짜 양식을 잘못 입력하셨습니다 ");
       }


        if(year > 2006){
            throw new InvalidAgeException("만 20세 미만은 입장불가입니다");
        }

        if((month<0 || month>13) ||
                (day < 1 || day > 31) ||
                (year<999)){
            throw new InvalidAgeException("날짜 양식을 잘못 입력하셨습니다");
        }

        System.out.println("입장하셔도 됩니다");
    }



}
