package com.nhuallpa.computing.algorithm;

import com.nhuallpa.computing.domain.Employee;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {


    @Test
    void sortSmallArray() {

        int[] A = new int[] {2,4,5,6,9,1};
        int[] expected = new int[] {1,2,4,5,6,9};

        InsertionSort.sort(A);
        assertArrayEquals(expected, A);
    }

    @Test
    void sortLargeArray() {

        int[] A = new int[] {2,4,5,6,9,1,11,55,100,20,70,22,44,33};
        int[] expected = new int[] {1,2,4,5,6,9,11,20,22,33,44,55,70,100};

        InsertionSort.sort(A);

        assertArrayEquals(expected, A);
    }

    @Test
    void sortArrayWithRepeatedNumbers() {

        int[] A = new int[] {2,4,5,6,9,1,11,55,100,20,9,22,44,33,100};
        int[] expected = new int[] {1,2,4,5,6,9,9,11,20,22,33,44,55,100,100};

        InsertionSort.sort(A);

        assertArrayEquals(expected, A);
    }

    @Test
    void sortEmptyArray() {

        int[] A = new int[]{};
        int[] expected = new int[] {};

        InsertionSort.sort(A);

        assertArrayEquals(expected, A);
    }

    @Test
    void sortEmployee() {

        Employee[] employees = new Employee[] {
                new Employee(99, "Carlos", "Rojas", "mail@gmail.com"),
                new Employee(30, "Kevin", "Rojas", "mail@gmail.com"),
                new Employee(53, "Hilda", "Rojas", "mail@gmail.com")
        };

        Employee[] expected = new Employee[] {
                new Employee(30, "Kevin", "Rojas", "mail@gmail.com"),
                new Employee(53, "Hilda", "Rojas", "mail@gmail.com"),
                new Employee(99, "Carlos", "Rojas", "mail@gmail.com")
        };



        InsertionSort.sort(employees);

        assertArrayEquals(expected, employees);

    }


    @Test
    void sortEmployeeWithGenerics() {

        Employee[] employees = new Employee[] {
                new Employee(99, "Carlos", "Rojas", "mail@gmail.com"),
                new Employee(30, "Kevin", "Rojas", "mail@gmail.com"),
                new Employee(53, "Hilda", "Rojas", "mail@gmail.com")
        };

        Employee[] expected = new Employee[] {
                new Employee(30, "Kevin", "Rojas", "mail@gmail.com"),
                new Employee(53, "Hilda", "Rojas", "mail@gmail.com"),
                new Employee(99, "Carlos", "Rojas", "mail@gmail.com")
        };

        InsertionSort.sort(employees, Employee::getEmployeeNumber);

        assertArrayEquals(expected, employees);

    }


}