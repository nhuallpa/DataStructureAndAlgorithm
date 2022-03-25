package com.nhuallpa.computing.algorithm;

public class SelectionSort {

    public static void sort(int[] A) {

        for (int i = 0; i < A.length - 1; i++) {
            var minIndex = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }
            var temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;
        }
    }
}
