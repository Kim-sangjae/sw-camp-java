package com.sangjae.section01.generic;

// <> 다이아몬드 연산자 안에는 가상의 타입을 영어대문자로 적는다
// 보편적으로 T 를 많이 쓰나 다른영문자를 사용해도 무방하다
// 여러개의 타입을 선언할때는 , 연산자를 이용하여 나열
public class GenericTest <T>{

    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

}
