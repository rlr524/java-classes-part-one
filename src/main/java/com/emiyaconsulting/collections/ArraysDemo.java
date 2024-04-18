package com.emiyaconsulting.collections;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] kids = {"Madison", "Olivia", "Nicole", "Tzuyu", "Mei"};

        Arrays.sort(kids);
        int findMadi = Arrays.binarySearch(kids, "Madison");
        System.out.println(findMadi);
    }
}
