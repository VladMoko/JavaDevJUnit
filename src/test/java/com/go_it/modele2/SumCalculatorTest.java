package com.go_it.modele2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


class SumCalculatorTest {
    private SumCalculator res;

    @BeforeEach
    public void beforeEach(){
        res = new SumCalculator();
    }

    @Test
    void sum() {
        //Test 1
        int expectedByOne = 1;
        Assertions.assertEquals(expectedByOne, res.sum(1));

        //Test 2
        int expectedBySix = 6;
        Assertions.assertEquals(expectedBySix, res.sum(3));

        //Test 3
        int expectedByNull = 0;
        assertThrows(IllegalArgumentException.class,() -> Assertions.assertEquals(expectedByNull, res.sum(0)));
    }
}