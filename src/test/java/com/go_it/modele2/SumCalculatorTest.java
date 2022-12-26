package com.go_it.modele2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach(){
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumWithNumberOne() {
        int expected = 1;
        Assertions.assertEquals(expected, sumCalculator.sum(1));
    }

    @Test
    void sumWithNumberThree(){
        int expected = 6;
        Assertions.assertEquals(expected, sumCalculator.sum(3));
    }

    @Test
    void sumWithException(){
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}