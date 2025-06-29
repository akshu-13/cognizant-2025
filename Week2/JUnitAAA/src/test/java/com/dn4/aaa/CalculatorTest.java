package com.dn4.aaa;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        System.out.println("Setting up test...");
        calc = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down after test...");
        calc = null;
    }

    @Test
    public void testMultiply() {
        // Arrange is done in @Before
        // Act
        int result = calc.multiply(4, 5);
        // Assert
        assertEquals(20, result);
    }

    @Test
    public void testDivide() {
        // Arrange is done in @Before
        // Act
        int result = calc.divide(10, 2);
        // Assert
        assertEquals(5, result);
    }
}
