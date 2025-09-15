package ioexample;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("병합할 파일의 개수 입력 : ");
            int fileNum = sc.nextInt();
            sc.nextLine();



        BufferedReader[] copyFiles = new BufferedReader[fileNum];

        String n = "";
        for (int i = 0; i < fileNum; i++) {

            System.out.println((i + 1) + "번째 파일 이름 입력  : ");
            try {
                n = sc.nextLine();
                copyFiles[i] = new BufferedReader(new FileReader(n));
            } catch (FileNotFoundException e) {
                System.out.println("오류 : " + n + " (지정된 파일을 찾을 수 없습니다) ");
                return;
            }

        }

        System.out.println("병합 될 파일명 입력 : ");
        String resultFile = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(resultFile))) {

            String temp;
            for (BufferedReader br : copyFiles) {
                if (br == null) continue;

                while ((temp = br.readLine()) != null) {
                    bw.write(temp);
                    bw.write("\n");
                }
                br.close();
            }


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        } catch (InputMismatchException e) {
            System.out.println("정확한 갯수를 입력해주세요");
        }









    }
}
