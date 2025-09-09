package array.array1;

import java.util.Scanner;

public class Hard1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력해 주세요 : ");
        int n = sc.nextInt();
        int[] narr = new int[n];

        if(n%2 == 0){
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
            return;
        }


        for(int i =0 ,value=1, half = n/2; i < narr.length; i++){
            if(i < half){
                narr[i] = value++;
            } else {
                narr[i] = value--;
            }
            System.out.print(narr[i]+"");
        }


    }
}
