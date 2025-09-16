package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {


    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("swap 전 : " + Arrays.toString(intArray));  // [1, 2, 3, 4, 5]
        swap(intArray, 1, 3);
        System.out.println("swap 후 : " + Arrays.toString(intArray));  // [1, 4, 3, 2, 5]

        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("swap 전 : " + Arrays.toString(strArray));  // [A, B, C, D]
        swap(strArray, 0, 2);
        System.out.println("swap 후 : " + Arrays.toString(strArray));  // [C, B, A, D]

    }


    public static <T> void swap (T[] t , int a , int b){
        List<T> change;
        change = Arrays.asList(t);
        T num1 = change.get(a);
        T num2 = change.get(b);
        change.set(a,num2);
        change.set(b,num1);

    }


}
