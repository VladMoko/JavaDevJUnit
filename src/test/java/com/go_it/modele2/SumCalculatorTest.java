package com.go_it.modele2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator res;

    @BeforeEach
    public void beforeEach(){
        res = new SumCalculator();
    }

    @Test
    void sum() {
        //When
        int actual = res.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
}