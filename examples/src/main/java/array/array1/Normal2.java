package array.array1;

import java.util.Scanner;

public class Normal2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 : ");
        String num = sc.nextLine();

        char[] charArray = num.toCharArray();
        //System.out.println(Arrays.toString(charArray));
        for(int i = 0; i < charArray.length; i++){
          if(i>7){
              charArray[i] = '*';
          }
            System.out.print(charArray[i]);
        }



    }
}
