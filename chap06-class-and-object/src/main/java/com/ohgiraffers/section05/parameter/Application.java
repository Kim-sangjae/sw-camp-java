package com.ohgiraffers.section05.parameter;

public class Application {
    public static void main(String[] args) {
        ParameterTest parameterTest = new ParameterTest();

        /* 매개변수로 기본자료형은 값(data)을 전달하고,
        * 참조 자료형은 주소 값(reference)를 전달한다. */

        /* 1. 기본 자료형 메소드 */
        int num = 0;
        parameterTest.testPrimaryTypeParameter(num);
        System.out.println("main num : " + num);

        /* 2. 기본 자료형 배열 메소드 */
        int[] arr = {1, 2, 3, 4, 5};
        parameterTest.testPrimaryTypeArrayParameter(arr);
        System.out.println("main arr[0] : " + arr[0]);

        /* 3. 클래스 자료형 메소드 */
        Rectangle rectangle = new Rectangle(5.5, 7.5);
        parameterTest.testClassTypeParameter(rectangle);
        System.out.println("main rectangle : "
                + rectangle.getWidth() + " " + rectangle.getHeight());

        /* 4. 가변 인자 */
        parameterTest.testVariableLengthArrayParameter("홍길동");
        parameterTest.testVariableLengthArrayParameter("홍길동", "코딩");
        parameterTest.testVariableLengthArrayParameter("홍길동", "코딩", "야구");
        parameterTest.testVariableLengthArrayParameter("홍길동", "코딩", "야구", "테니스");
        parameterTest.testVariableLengthArrayParameter("홍길동", new String[] {"코딩", "테니스"});

    }
}
