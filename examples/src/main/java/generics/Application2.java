package generics;

import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer 합계 : " + sum(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double 합계 : " + sum(doubleArray));

        String[] strArray = {"A", "B", "C"};
//         System.out.println("String 합계 : " + sum(strArray));  // 컴파일 에러 발생


    }

    public static <T extends Number> Number sum(T[] t){
       double sum = 0;

        if(t instanceof Integer[]){
           for (T t1 : t) {
               sum = sum + t1.intValue();
           }
           return (int)sum;

       } else {
            for (T t1 : t) {
                sum = sum + t1.doubleValue();
            }
            return sum;
       }
    }//sum()


}
