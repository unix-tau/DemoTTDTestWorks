package com.tau;

public class Calculator {
    private int result;

    public void add(int a, int b) {
        result = a + b;
    }

    public void subtract(int a, int b) {
        result = a - b;
    }

    public int getResult() {
        return result;
    }
}
