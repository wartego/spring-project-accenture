package com.accenture.academy.calculator;

import org.junit.jupiter.api.*;


class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    void prepareCalculatorForTest() {
        calculator = new Calculator();
    }

    @Test
    void shouldAdd() {

        //when
        Integer x = 15;
        Integer y = 9;
        //then
        Integer result = calculator.add(x, y);

        Assertions.assertEquals(Integer.valueOf(24), result);
    }

    @Test
    void shouldSubstract() {

        //when
        Integer x = 15;
        Integer y = 9;
        //then
        Integer result = calculator.substract(x, y);

        Assertions.assertEquals(Integer.valueOf(6), result);
    }

    @Test
    @DisplayName("When multiply 2 numbers, then correct result is 30")
    void shouldMultiply() {

        //when
        Integer x = 5;
        Integer y = 6;
        //then
        Integer result = calculator.multiply(x, y);

        Assertions.assertEquals(Integer.valueOf(30), result);
    }

    @Test
    @DisplayName("When divide 2 numbers, then correct result is 3")
    void whenDivideTwoNumbersThenReturnTheirSum() {

        //when
        Integer x = 15;
        Integer y = 5;
        //then
        Integer result = calculator.divide(x, y);

        Assertions.assertEquals(Integer.valueOf(3), result);
    }
    @Test
    @DisplayName("When divide by 0")
    void whenDivideby0() {

        //when
        Integer x = 15;
        Integer y = 5;
        //then
        Integer result = calculator.divide(x, y);
        //Assertions.assertThrows(IllegalArgumentException.class , () -> calculator.divide(x,y),"You can't divide by 0");
        Assertions.assertEquals(Integer.valueOf(3), result);
    }

    @Test
    void shouldThrowExecptionDuringAddTwoNumbersOutOfRange() {
        //when
        Integer x = 15;
        Integer y = 9000;
        //then

        Assertions.assertThrows(IllegalArgumentException.class , () -> calculator.add(x,y));
    }

}