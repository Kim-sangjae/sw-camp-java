package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {
    /* 접근 제한자
    * 클래스 혹은 클래스의 멤버(필드, 메소드)에 참조 연산자로 접근할 수 있는 범위를
    * 제한하기 위한 키워드
    * public, protected, default, private
    * 단, 클래스 선언시에는 public, default만 가능함
    * */
    private String name;
    private int hp;

    /* 간접 접근용 메소드(기능) 생성 */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        if(hp > 0) {
            /* this : 인스턴스 변수가 생성 되었을 때 자신의 주소를 저장하는 레퍼런스 변수 */
            this.hp = hp;
            System.out.println("양수 값이 입력 되어 몬스터의 체력을 입력 값으로 변경");
        } else {
            this.hp = 0;
            System.out.println("음수 값이 입력 되어 몬스터의 체력을 0으로 변경");
        }
    }

    public int getHp() {
        return hp;
    }
}
