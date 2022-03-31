package com.nhuallpa.computing.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void factorial() {
        assertEquals(6, new Factorial().calculate(3));
    }

}