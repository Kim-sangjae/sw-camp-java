package com.sangjae.section02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        // 스트림 최종연산 collect

        List<Member> memberList = Arrays.asList(
                new Member("test01","홍길동"),
                new Member("test02","유관순"),
                new Member("test03","신사임당"),
                new Member("test04","허균")
        );

        // ex) List<String> 타입의 멤버들의 이름만 관리하는 데이터

        List<String> memberNames = memberList.stream()
//                .map(mem -> mem.getMemberName())
                .map(Member::getMemberName)
                .collect(Collectors.toList());

        System.out.println(memberNames);


        String str = memberList.stream()
                .map(Member::getMemberId)
                .collect(Collectors.joining(","));
        System.out.println(str);


        String str1 = memberList.stream()
                .map(Member::getMemberId)
                .collect(Collectors.joining("||","**","$$"));
        System.out.println(str1);

        Map<Integer,Long> countByNameLength =
                memberList.stream()
                        .collect(
                                Collectors.groupingBy(
                                        m -> m.getMemberName().length(),
                                        Collectors.counting())
                        );

        System.out.println("grouping : " + countByNameLength);


    }//main
}
