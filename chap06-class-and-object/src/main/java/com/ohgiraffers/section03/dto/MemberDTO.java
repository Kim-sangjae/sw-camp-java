package com.ohgiraffers.section03.dto;

/* DTO(Data Transfer Object)
* : 계층간의 데이터 전달 용도로 사용되는 클래스
*   캡슐화의 원칙에 따라 작성하기는 했지만 필드명을 그대로 사용해서 유지보수성이 좋지는 않다.
*   다만 추후 Spring 챕터 등에서 여러 프레임워크, 라이브러리에서 전형적으로 활용 되는 형태이므로
*   일종의 관례라고 생각하면 좋다. */
public class MemberDTO {
    /* 값 객체가 가진 속성을 추출하는 과정 또한 추상화라고 볼 수 있다. */
    private int number;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private boolean isActivated;

    /* 설정자(setter) & 접근자 (getter)
    * */
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}
