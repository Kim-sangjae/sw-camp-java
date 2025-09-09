package array.array1;

import java.util.Scanner;

public class Normal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String s = sc.nextLine();
        char[] carr = s.toCharArray();

        System.out.print("검색할 문자를 입력하세요 : ");
        String search = sc.next();
        char cs = search.charAt(0);
        int count = 0;
        for (char c : carr) {
            if(c == cs){
                count++;
            }
        }

        System.out.println("입력하신 문자열 " + s + " 에서 찾으시는 문자 " + cs + " 는 " + count + "개 입니다.");

    }
}
