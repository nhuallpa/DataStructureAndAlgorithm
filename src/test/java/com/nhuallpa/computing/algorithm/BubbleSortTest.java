package com.nhuallpa.computing.algorithm;

import com.nhuallpa.computing.algorithm.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    @Test
    void sortSmallArray() {

        int[] A = new int[] {2,4,5,6,9,1};
        int[] expected = new int[] {1,2,4,5,6,9};

        BubbleSort.sort(A);
        assertArrayEquals(expected, A);
    }

    @Test
    void sortLargeArray() {

        int[] A = new int[] {2,4,5,6,9,1,11,55,100,20,70,22,44,33};
        int[] expected = new int[] {1,2,4,5,6,9,11,20,22,33,44,55,70,100};

        BubbleSort.sort(A);

        assertArrayEquals(expected, A);
    }

    @Test
    void sortArrayWithRepeatedNumbers() {

        int[] A = new int[] {2,4,5,6,9,1,11,55,100,20,9,22,44,33,100};
        int[] expected = new int[] {1,2,4,5,6,9,9,11,20,22,33,44,55,100,100};

        BubbleSort.sort(A);

        assertArrayEquals(expected, A);
    }

    @Test
    void sortEmptyArray() {

        int[] A = new int[]{};
        int[] expected = new int[] {};

        BubbleSort.sort(A);

        assertArrayEquals(expected, A);
    }

}