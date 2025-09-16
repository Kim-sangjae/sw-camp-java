package com.sangjae.section02.set;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {

        //LinkedHashSet : 저장 순서 위치
        LinkedHashSet<String> lset = new LinkedHashSet<>();
        lset.add("java");
        lset.add("mysql");
        lset.add("html");
        lset.add("css");
        lset.add("db");

        for (String s : lset) {
            System.out.println(s);
        }


    }//main
}
