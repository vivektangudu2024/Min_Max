package com.day8;

import java.util.*;

//@desc:generic Class using data type
class MaxFinder<T extends Comparable<T>> {

    private T x;
    private T y;
    private T z;

    public MaxFinder(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T findMax() {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }

        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }
}


    public class Max_Min {



        public static void main(String[] args) {
            // Test Case 1: Max at 1st position using Generic Class
            MaxFinder<Integer> integerMaxFinder = new MaxFinder<>(5, 3, 2);
            System.out.println("Test Case 1 - Max Integer (Generic Class): " + integerMaxFinder.findMax());

            // Test Case 2: Max at 2nd position using Generic Class
            MaxFinder<Float> floatMaxFinder = new MaxFinder<>(1.0f, 8.5f, 4.3f);
            System.out.println("Test Case 2 - Max Float (Generic Class): " + floatMaxFinder.findMax());

            // Test Case 3: Max at 3rd position using Generic Class
            MaxFinder<String> stringMaxFinder = new MaxFinder<>("Java", "Python", "C++");
            System.out.println("Test Case 3 - Max String (Generic Class): " + stringMaxFinder.findMax());

            // New Test Case using Generic Class
            MaxFinder<Double> doubleMaxFinder = new MaxFinder<>(2.5, 3.8, 1.2);
            System.out.println("New Test Case - Max Double (Generic Class): " + doubleMaxFinder.findMax());
        }
    }
