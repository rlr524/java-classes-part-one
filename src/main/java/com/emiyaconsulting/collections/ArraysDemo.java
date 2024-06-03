package com.emiyaconsulting.collections;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] kids = {"Madison", "Olivia", "Nicole", "Tzuyu", "Mei"};

        Arrays.sort(kids);
        int findMadi = Arrays.binarySearch(kids, "Madison");
        System.out.println(findMadi);
        
        for (String kid : kids) {
            System.out.println(kid);
        }
        
        int[] swats = {25, 15, 50, 25, 30};
        for (int i = 0; i < kids.length; i++) {
                System.out.printf("%s gets %d swats\n", kids[i], swats[i]);
            }
        }
    }
