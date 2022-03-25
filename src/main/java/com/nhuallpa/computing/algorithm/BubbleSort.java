package com.nhuallpa.computing.algorithm;

public class BubbleSort {

    public static void sort(int[] A) {

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - 1 - i; j++) {
                if (A[j] > A[j+1]) {
                    var temp = A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp;
                }
            }
        }

    }
}
