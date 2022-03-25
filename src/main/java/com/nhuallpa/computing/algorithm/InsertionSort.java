package com.nhuallpa.computing.algorithm;

public class InsertionSort {

    public static void sort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            var current = A[i];
            var j = i - 1;
            while (j >= 0 && A[j] > current) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = current;
        }
    }
}
