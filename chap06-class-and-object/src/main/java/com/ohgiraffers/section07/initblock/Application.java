package com.ohgiraffers.section07.initblock;

public class Application {
    public static void main(String[] args) {
        System.out.println("main 실행");
        Product product = new Product();
        System.out.println(product.getInformation());

        Product product2 = new Product("대륙폰", 500000, "샤우미");
        System.out.println(product2.getInformation());
    }
}
