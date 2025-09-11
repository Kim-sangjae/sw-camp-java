package com.sangjae.section02.superkeyword;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.getInformation());

        Product product1 = new Product("s21" , "삼성" ,"갤럭시21" , 1800000 , new Date());
        System.out.println(product1.getInformation());




        Computer computer = new Computer();
        System.out.println(computer.getInformation());

        Computer computer1 = new Computer("윈도우즈" , 512 , 16 , "안드로이드");
        System.out.println(computer1.getInformation());

        Computer computer2 = new Computer("s21" , "삼성" ,"갤럭시21" , 1800000 , new Date(),
                "윈도우즈" , 512 , 16 , "안드로이드");
        System.out.println(computer2.getInformation());

    }
}
