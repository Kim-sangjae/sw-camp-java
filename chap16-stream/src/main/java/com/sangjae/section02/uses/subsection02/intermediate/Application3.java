package com.sangjae.section02.uses.subsection02.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application3 {
    public static void main(String[] args) {

        // 스트림 중계연산 flatMap
        // List<List<String>> : List 이차원 배열 생성
        List<List<String>> list = Arrays.asList(
                Arrays.asList("JAVA","spring","spring boot"),
                Arrays.asList("JAVA","spring","spring boot"),
                Arrays.asList("sdw","sd","qwrfg","asdw")
        );
        System.out.println(list);

        List<String> flatMap = list.stream()
                .flatMap(Collection::stream) // 중간연산
                .collect(Collectors.toList()); // 최종연산

        System.out.println(flatMap);

        // collect(Collectors.toList()) vs toList()
        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java Stream API",
                "FlatMap Ex"
        );

        System.out.println(sentences);

        List<String> words = sentences.stream()
                .flatMap(sentence->Arrays.stream(sentence.split(" ")))
                .toList();

        System.out.println(words);

        // toList() 로 리스트형태 변경하면 그 리스트는 불변 ( 수정 불가 ) 객체가 된다
//        words.add("ss");

    }//main
}
