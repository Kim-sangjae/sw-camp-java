package com.sangjae.section01.list.dto;

import java.util.Comparator;

public class BookDTO implements Comparable<BookDTO>, Comparator<BookDTO> {

    private int number;
    private String title;
    private String author;
    private int price;


    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }


    // Comparable 을 상속 받아 오버라이드한 메서드
    // sort 하기위해 필요한메서드
    // 직접 지정해주자
    @Override
    public int compareTo(BookDTO o) {
        // this vs o(매개변수) 비교했을때
        // 양수 반환 : 변경 , (크다)
        // 0반환 : 같은값     (같다)
        // 음수 : 변경 x     (작다)


        return this.title.compareTo(o.title);
    }


    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return 0;
    }
}// class
