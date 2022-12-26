package com.go_it.modele2;

public class SumCalculator {
    public int sum(int n) {
        int sum = 1;
        if (n == 0) {
            throw new IllegalArgumentException("N can't be null");
        }
        return (n * (n + sum ) / 2);
    }
}
