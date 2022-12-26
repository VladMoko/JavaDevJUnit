package com.go_it.modele2;

public class SumCalculator {

    public int sum(int n) {
        int sum = 1;
        if (n == 0) {
            throw new IllegalArgumentException();
        }
        return (n * (n + sum ) / 2);
    }
}
