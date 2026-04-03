package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-3, calculator.add(-1, -2));
    }

    @Test
    void testSubtract() {
        assertEquals(6, calculator.subtract(10, 4));
        assertEquals(-2, calculator.subtract(0, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(0, calculator.multiply(0, 99));
        assertEquals(-6, calculator.multiply(-2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(5.0, calculator.divide(10, 2));
        assertEquals(0.5, calculator.divide(1, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
