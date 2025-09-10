package com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {
    /* final 키워드를 사용할 수 있는 위치는 다양하다.
    * 1. 지역변수 : 초기화 이후 값 변경 불가
    * 2. 매개변수 : 호출 시 전달한 값 변경 불가
    * 3. 인스턴스 변수 : 인스턴스 생성 초기화 이후 값 변경 불가
    * 4. 클래스 변수 (static) : 프로그램 시작 이후 값 변경 불가
    * 5. non-static 메소드 : 메소드 재작성(오버라이딩) 불가
    * 6. static 메소드 : 메소드 재작성(오버라이딩) 불가
    * 7. 클래스 : 상속 불가
    * */

    /* non static field에 final 키워드를 사용하는 경우
    * 초기 인스턴스 생성 시 기본 값 0이 필드에 들어가게 되는데
    * 값 변경이 불가능해지므로 선언과 동시에 초기화 해줘야 한다. */
//    private final int NON_STATIC_NUM;
    private final int NON_STATIC_NUM = 1;
    private final String NON_STATIC_STRING;

    public FinalFieldTest (String nonStaticString) {
        this.NON_STATIC_STRING = nonStaticString;
    }

    /* static field에 final 키워드 사용하는 경우 */
//    private static final int STATIC_NUM;
    private static final int STATIC_NUM = 1;
    private final static String STATIC_STRING;
    /* static 필드는 생성자 초기화가 불가능하며 static 초기화 블럭을 활용할 수 있다. */
    static {
        STATIC_STRING = "홍길동";
    }

    /* final과 static 키워드의 나열 순서는 문법적으로 상관 없다.
    * 다만 주로 static final로 작성한다. */

}
