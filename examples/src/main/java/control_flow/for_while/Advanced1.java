package control_flow.for_while;

import java.util.Scanner;

public class Advanced1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String word = sc.nextLine();
        System.out.print("0 보다 큰 숫자를 입력하세요 : ");
        int pushNum = sc.nextInt();

        if(pushNum > 26){
            pushNum = pushNum-26;
        }

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            boolean isBlank = String.valueOf(word.charAt(i)).equals(" ");
            int charNum = (int) word.charAt(i);
            int changeNum = charNum + pushNum;

            if(!isBlank) {
                if(!((changeNum>64 && changeNum < 91) ||
                        (changeNum>96 && changeNum < 123))){
                    changeNum = changeNum -26;
                }

                result = result + (char)changeNum;

            } else {
                result = result + " ";
            }
        }

        System.out.print(result);

    }
}
