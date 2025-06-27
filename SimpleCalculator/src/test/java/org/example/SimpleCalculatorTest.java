package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
        assertNotEquals(6,calculator.add(5,2));
        assertTrue(calculator.add(1,7) < 9);
        assertFalse(calculator.add(4,10) > 50);
        assertNull(null);
        assertNotNull(calculator);
    }

    @Test
    void threePlusSevenShouldEqulalTen(){
        var calculator = new SimpleCalculator();
        assertEquals(7,calculator.add(3,7));

    }

}