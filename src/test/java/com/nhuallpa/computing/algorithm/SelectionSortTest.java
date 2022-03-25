package com.nhuallpa.computing.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void sortSmallArray() {

        int[] A = new int[] {2,4,5,6,9,1};
        int[] expected = new int[] {1,2,4,5,6,9};

        SelectionSort.sort(A);
        assertArrayEquals(expected, A);
    }

    @Test
    void sortLargeArray() {

        int[] A = new int[] {2,4,5,6,9,1,11,55,100,20,70,22,44,33};
        int[] expected = new int[] {1,2,4,5,6,9,11,20,22,33,44,55,70,100};

        SelectionSort.sort(A);

        assertArrayEquals(expected, A);
    }

    @Test
    void sortArrayWithRepeatedNumbers() {

        int[] A = new int[] {2,4,5,6,9,1,11,55,100,20,9,22,44,33,100};
        int[] expected = new int[] {1,2,4,5,6,9,9,11,20,22,33,44,55,100,100};

        SelectionSort.sort(A);

        assertArrayEquals(expected, A);
    }

    @Test
    void sortEmptyArray() {

        int[] A = new int[]{};
        int[] expected = new int[] {};

        SelectionSort.sort(A);

        assertArrayEquals(expected, A);
    }

}