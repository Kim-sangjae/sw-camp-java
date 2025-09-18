package com.sangjae.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {


        // 스트림 중계연산 sorted
        List<Integer> integerList = IntStream.of(5,10,99,7,1,52)
                .boxed()
                .sorted((a,b) -> b-a)
                .toList();
        System.out.println(integerList);



    }//main
}
