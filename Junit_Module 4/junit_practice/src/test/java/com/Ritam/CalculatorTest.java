package com.dishan;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbersCorrectly() {

        Calculator calculator = new Calculator();

        int result = calculator.add(4, 6);

        assertEquals(10, result);
    }
}