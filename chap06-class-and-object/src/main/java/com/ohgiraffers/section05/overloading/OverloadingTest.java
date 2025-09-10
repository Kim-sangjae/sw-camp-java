package com.ohgiraffers.section05.overloading;

public class OverloadingTest {
    /* 오버로딩
    * 같은 클래스 내에 같은 이름을 가진 메소드를 매개변수부만 다르게 해서 정의하는 것
    * 동일 기능의 메소드를 매개변수에 따라 다른 이름을 붙이면 관리가 어려워짐
    * Ex. println() -> printInt(), printFloat(), ...
    * */

    public void test() {}

    /* 메소드 시그니처가 동일한 경우 컴파일 에러가 발생한다.
    * 메소드 시그니처 : 메소드명과 파라미터 선언부
    * 접근제한자 또는 반환형이 달라도 오버로딩은 성립하지 않는다. */
//    public void test() {}
//    private void test() {}
//    protected void test() {}
//    void test() {}
//      public int test() {}

    /* 매개변수명은 오버로딩과 무관 */
    public void test(int num) {}
//    public void test(int num2) {}

    /* 매개변수의 타입, 갯수, 순서가 다르면 오버로딩 성립 */
    public void test(int num, String name) {}
    public void test(String name, int num) {}

}
