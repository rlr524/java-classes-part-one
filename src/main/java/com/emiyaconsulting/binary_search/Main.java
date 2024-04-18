package com.emiyaconsulting.binary_search;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 8, 9, 11, 12, 15, 19};
        
        int result = binarySearchInt(arr, 18);
        System.out.println(result);

        System.out.println(Arrays.binarySearch(arr, 12));
        
        int recursiveResult = binarySearchInt(arr, 15, 0, arr.length - 1);
        System.out.println(recursiveResult);
    }
    
    public static int binarySearchInt(int[] numbers, int numberToFind) {
        // Create the pointers.
        int low = 0;
        int high = numbers.length - 1;
        
        while (low <= high) {
            // Get the int at the middle of the array. Because this is an int, even if the
            // middle position is a float (i.e. the  middle value for an array of 10 elements is
            // 4.5, (9 + 0) / 2), it will use 4 since converting a float to an int loses
            // decimal precision.
            int middlePosition = (low + high) / 2;
            int middleValue = numbers[middlePosition];
            
            if (numberToFind == middleValue) {
                return middlePosition;
            }
            if (numberToFind < middleValue) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }
        return -1;
    }
    
    // Recursive version
    public static int binarySearchInt(int[] numbers, int numberToFind, int low, int high) {
        if (high >= low && low <= numbers.length - 1) {
            int middlePosition = low + (high - low) / 2;
            int middleValue = numbers[middlePosition];
            
            if (numberToFind == middleValue) {
                return middlePosition;
            }
            if (numberToFind < middleValue) {
                return binarySearchInt(numbers, numberToFind, low, middlePosition - 1);
            } else {
                return binarySearchInt(numbers, numberToFind, middlePosition + 1, high);
            }
        }
        return -1;
    }
}
