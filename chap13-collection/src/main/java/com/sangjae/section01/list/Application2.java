package com.sangjae.section01.list;

import com.sangjae.section01.list.comparator.AscendingPrice;
import com.sangjae.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO(1,"홍길동전","허균",50000));
        bookList.add(new BookDTO(2,"목민심서","정약용",30000));
        bookList.add(new BookDTO(3,"동의보감","허준",40000));
        bookList.add(new BookDTO(4,"삼국사기","김부석",46000));
        bookList.add(new BookDTO(5,"삼국유사","일연",59000));


        System.out.println("-------정렬 전-------");
        for (BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }


        // 기본 String 클래스에는 compareTo 메서드가 오버라이드 되어있지만
        // ArrayList 에는 compareTo 가 없다
        // 따라서 정렬기준을 잡을때 comparable 인터페이스를 구현해서
        // compareTo 를 오버라이드해서 재정의 해야 sort 사용가능 (String값)
        System.out.println("----오름차순 정렬 후 (제목순)----");
        Collections.sort(bookList);
        for (BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }

        // Comparator 인터페이스를 구현한 클래스를 사용해 정렬
        System.out.println("----오름차순 정렬 후 (가격순)----");
        Collections.sort(bookList ,new AscendingPrice());
        bookList.sort(new AscendingPrice());
        for (BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }


        System.out.println("-----내림차순 정렬 후 (가격순)-----");
        // 정렬을 지속적으로 하는경우 별도의 클래스를 만들어서 사용해도되지만
        // 한번만 사용될 경우는 간편하게 익명클래스(Anonymous Class) 를 활용할 수 있다.
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        for (BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }




    }
}
