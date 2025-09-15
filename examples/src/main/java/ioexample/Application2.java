package ioexample;

import java.io.*;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * (원본 파일이 존재 하는 경우)
         * 원본 파일의 이름을 입력하세요 : origin.txt
         * 복사 파일의 이름을 입력하세요 : copy.txt
         *
         * ----- 출력 예시 -----
         *
         * 파일 복사가 성공적으로 완료 되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * (원본 파일이 존재하지 않는 경우)
         * 원본 파일의 이름을 입력하세요 : origin2.txt
         * 복사 파일의 이름을 입력하세요 : copy2.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("원본 파일의 이름을 입력하세요 : ");
        String origin = sc.nextLine();
        System.out.println("복사 파일의 이름을 입력하세요 : ");
        String copy = sc.nextLine();

        ;



        try (
                BufferedReader br = new BufferedReader(new FileReader(origin));
                BufferedWriter bw = new BufferedWriter(new FileWriter(copy))
        ) {

                String temp;
                while((temp = br.readLine()) != null) {
                   bw.write(temp);
                   bw.write("\n");
                }
                bw.flush();


               try ( BufferedReader copyBr = new BufferedReader(new FileReader(copy))){
                   String result;
                   while((result = copyBr.readLine()) != null) {
                       System.out.println(result);
                   }
               }



            } catch (FileNotFoundException e) {
                System.out.println("오류 : " + origin + " (지정된 파일을 찾을 수 없습니다) ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }





    }
}
