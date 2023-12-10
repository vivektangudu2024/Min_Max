package com.day8;

import java.util.*;

//@desc:generic Class using data type
class MaxFinder<T extends Comparable<T>> {

    private T[] values;

    public MaxFinder(T... values) {
        this.values = values;
    }

    public T findMax() {
        if (values == null || values.length == 0) {
            return null; // No elements to compare
        }

        Arrays.sort(values);
        return values[values.length - 1];
    }

    public static <T extends Comparable<T>> T testMaximum(T... values) {
        if (values == null || values.length == 0) {
            return null; // No elements to compare
        }

        Arrays.sort(values);
        return values[values.length - 1];
    }
}


    public class Max_Min {



        public static void main(String[] args) {
            // Test Case 1: Max using Generic Class with more than three parameters
            MaxFinder<Integer> integerMaxFinder = new MaxFinder<>(5, 3, 2, 8, 1);
            System.out.println("Test Case 1 - Max Integer (Generic Class): " + integerMaxFinder.findMax());

            // Test Case 2: Max using static method with more than three parameters
            Double maxDouble = MaxFinder.testMaximum(2.5, 3.8, 1.2, 5.6, 4.0);
            System.out.println("Test Case 2 - Max Double (Static Method): " + maxDouble);
        }
    }
