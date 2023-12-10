package com.day8;

import java.util.*;
public class Min_Max {

    public static <T extends Comparable<T>> T findMax(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {
        // Test Case 1: Max at 1st position
        String max1 = findMax("Banana", "Apple", "Orange");
        System.out.println("Test Case 1 - Max: " + max1);

        // Test Case 2: Max at 2nd position
        String max2 = findMax("Elephant", "Zebra", "Lion");
        System.out.println("Test Case 2 - Max: " + max2);

        // Test Case 3: Max at 3rd position
        String max3 = findMax("Java", "Python", "C++");
        System.out.println("Test Case 3 - Max: " + max3);
    }
}
