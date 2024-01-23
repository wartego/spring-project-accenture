package com.accenture.academy.calculator;

public class Calculator {
    public Integer add(int x, int y) {
        if (x >= 0 && x <= 100 && y >= 0 && y <= 100) {
            return x + y;
        } else {
            throw new IllegalArgumentException("X and Y must be between 0 - 100.");
        }
    }

    public Integer substract(int x, int y) {
        if (x >= 0 && x <= 100 && y >= 0 && y <= 100) {
            return x - y;
        } else {
            throw new IllegalArgumentException("X and Y must be between 0 - 100.");
        }
    }

    public Integer multiply(int x, int y) {
        if (x > 0 && x <= 30 && y > 0 && y <= 30) {
            return x * y;
        } else {
            throw new IllegalArgumentException("X and Y must be between 1 - 30.");
        }
    }

    public Integer divide(int x, int y) {
        if (x >= 0 && x <= 1000 && y > 0 && y <= 100) {
            return x / y;
        } else {
            throw new IllegalArgumentException("X must be between 0 - 1000  and Y must be between 1 - 100.");
        }
    }
}
