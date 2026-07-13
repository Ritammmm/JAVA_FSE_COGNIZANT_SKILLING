package com.dishan;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setting up test data...");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up after test...");
        calculator = null;
    }

    @Test
    public void testAdditionUsingAAAPattern() {

        // Arrange
        int firstNumber = 15;
        int secondNumber = 10;

        // Act
        int actualResult = calculator.add(firstNumber, secondNumber);

        // Assert
        assertEquals(25, actualResult);
    }
}