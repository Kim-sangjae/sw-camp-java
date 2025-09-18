package com.sangjae.section02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application4 {
    public static void main(String[] args) {
        // 스트림 최종연산 match
        List<String> strList = Arrays.asList("Java","Spring","SpringBoot");


        boolean anyMatch = strList.stream().anyMatch(s->s.contains("a"));
        boolean allMatch = strList.stream().allMatch(s->s.length() > 3);
        boolean noneMatch = strList.stream().noneMatch(s-> s.contains("z"));


        System.out.println("any : " + anyMatch);
        System.out.println("all : " + allMatch);
        System.out.println("none : " + noneMatch);

    }//main
}
