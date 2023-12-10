package com.day8;

import java.util.*;
public class Min_Max {
    //@desc:generic METHOD using data type
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
        Integer maxInt = findMax(5, 3, 2);
        System.out.println("Test Case 1 - Max Integer: " + maxInt);

        // Test Case 2: Max at 2nd position
        Float maxFloat = findMax(1.0f, 8.5f, 4.3f);
        System.out.println("Test Case 2 - Max Float: " + maxFloat);

        // Test Case 3: Max at 3rd position
        String maxString = findMax("Java", "Python", "C++");
        System.out.println("Test Case 3 - Max String: " + maxString);
    }
}
