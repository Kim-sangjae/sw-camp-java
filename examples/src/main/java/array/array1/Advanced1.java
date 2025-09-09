package array.array1;

import java.util.Arrays;
import java.util.Random;

public class Advanced1 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        Random rd = new Random();
        int count = 0;




        while (count < 6){
            boolean check = false;
            int n = rd.nextInt(45) + 1;

            for(int i = 0; i < lotto.length; i++){
                if(lotto[i] == n){
                    check = true;
                    break;
                }
            }

            if(!check){
                lotto[count] = n;
                count++;
            }

        }

        Arrays.sort(lotto);

        System.out.println(Arrays.toString(lotto));


    }
}
