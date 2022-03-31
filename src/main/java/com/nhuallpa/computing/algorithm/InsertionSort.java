package com.nhuallpa.computing.algorithm;

import com.nhuallpa.computing.domain.Employee;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.LongFunction;

public class InsertionSort {

    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            var current = numbers[i];
            var j = i - 1;
            while (j >= 0 && numbers[j] > current) {
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = current;
        }
    }

    public static void sort(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            var current = employees[i];
            var j = i - 1;
            while (j >= 0 && employees[j].getEmployeeNumber() > current.getEmployeeNumber()) {
                employees[j+1] = employees[j];
                j--;
            }
            employees[j+1] = current;
        }
    }


    /***
     * Function to sort elements
     * @param elements Array of T Element
     * @param converter A function to convert un element of type T to a long value
     * @param <T> The type of elements
     */
    public static <T> void sort(T[] elements, Function<T, Long> converter) {
        for (int i = 0; i < elements.length; i++) {
            var current = elements[i];
            var j = i - 1;
            while (j >= 0 && converter.apply(elements[j]) > converter.apply(current)) {
                elements[j+1] = elements[j];
                j--;
            }
            elements[j+1] = current;
        }
    }
}
