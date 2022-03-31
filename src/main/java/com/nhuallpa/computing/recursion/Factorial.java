package com.nhuallpa.computing.recursion;

public class Factorial {

    public int calculate(int value) {
        if (value==0) return 1;
        return value*calculate(value-1);
    }
}
