package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SanghyunTest {
    @Test
    public void test_양수덧셈() {
        Calculator calc = new Calculator();
        int result = calc.add(5,4);
        assertEquals("add 함수의 결과는 9",
                9, result);
    }

    @Test
    public void test_음수덧셈(){
        Calculator calc = new Calculator();
        int result = calc.add(-5,-4);
        assertEquals("add 함수의 결과는 -9",
                -9, result);
    }

    @Test
    public void test_양수덧셈2(){
        Calculator calc = new Calculator();
        int result = calc.add(-5,-4);
        assertNotEquals(0, result);
    }

    @Test
    public void test_정수나눗셈(){
        Calculator calc = new Calculator();
        int result = calc.divide(10,5);
        assertEquals(2,result);
    }

    @Test
    public void test_실수나눗셈(){
        Calculator calc = new Calculator();
        double result = calc.divide(10.0,4.0);
        assertEquals(2.5,result);
    }

    @Test(expected = ArithmeticException.class)
    public void test_0으로나누기(){
        Calculator calc = new Calculator();
        int result = calc.divide(10,0);
        assertEquals(0,result);
    }

    @Test(expected = ArithmeticException.class)
    public void test_양수뺄셈(){
        Calculator calc = new Calculator();
        int result = calc.divide(20,10);
        assertEquals("두뺄셈의 차는 10이어야함.",1,result);
    }

    @Test(expected = ArithmeticException.class)
    public void test_양수곱셈(){
        Calculator calc = new Calculator();
        int result = calc.divide(5,4);
        assertEquals("두곱셈의 값은 20.",20,result);
    }

}
