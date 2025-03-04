package com.javaprogram.basicquestions;

public class    JavaLargestArrayValue {
    public static void main(String[] args) {
        int[] arr = {64, 1, 2, 515, 3};
        // Initialize min and max to the first element of the array
        int max = arr[0];

        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger number is found
            }
        }
        System.out.println("Largest number: " + max);
    }
    }

