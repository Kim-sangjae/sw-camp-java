package com.sangjae.section03.filterstream;

import java.io.Serializable;

/* 객체 입출력을 하기 위해서는 반드시 해당 객체가 직렬화 되어야 한다.
 * 직렬화 대상 클래스에 Serializable 인터페이스만 구현하면 데이터 직렬화 처리가 가능하다. */
public class Member implements Serializable {
    private String id;
    private String pwd;
    /* 직렬화에서 해당 필드를 제외하겠다는 의미의 키워드 */
    private transient int age;
    private char gender;

    public Member(String id, String pwd, int age, char gender) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}