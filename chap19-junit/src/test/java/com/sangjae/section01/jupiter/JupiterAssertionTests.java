package com.sangjae.section01.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JupiterAssertionTests {

    // JUnit5 에서 제공하는 Assertions 메소드
    @Test
    void testAssertEquals() {
        // given
        int firstNum = 10;
        int secondNum = 20;
        int excepted = 30;

        // when
        Calculator calculator = new Calculator();
        int result = calculator.plus(firstNum, secondNum);


        // then
        // assertEquals() : 예상 값과 실제 값의 일치여부
        Assertions.assertEquals(excepted, result, 1);

    }


    @Test
    @DisplayName("Null 여부 테스트")
    void testAssertNull() {
        String str = null;
        Assertions.assertNull(str);


        str = "something";
        Assertions.assertNotNull(str);
    }


    @Test
    @DisplayName("동시에 여러값 검증 테스트")
    void testAssertAll() {
        String firstName = "길동";
        String lastName = " 홍";

        Person person = new Person(firstName, lastName);

        Assertions.assertAll(
                "그룹화 된 테스트이름 (테스트 실패 시 보여지는 부분)",
                () -> Assertions.assertEquals(firstName, person.getFirstName()),
                () -> Assertions.assertEquals(lastName, person.getLastName())
        );
    }


    @Test
    @DisplayName("exception 발생 테스트")
    void testAssertThrow() {
        int firstNum = 10;
        int secondNum = 0;

        NumberValidation numberValidation = new NumberValidation();
        Exception exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> numberValidation.checkDivideNumbers(firstNum, secondNum)
        );
    }



}//class
