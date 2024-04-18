package com.emiyaconsulting.collections;

import java.text.NumberFormat;
import java.util.Arrays;

/*
The Murach Python book differentiates a Python list from an array in other languages by stating that lists can hold 
items of different types and arrays in other languages require all elements to be the same type, but this is not true 
at all. Below is an example of creating an array of type Object, allowing any type to be mixed into the array.
 */
public class Main {
    public static void main(String[] args) {
        Object[] myObjects = new Object[6];

        myObjects[0] = "Hello";
        myObjects[1] = 21;
        myObjects[2] = true;
        myObjects[3] = 3.50;
        myObjects[4] = "Goodbye";
        myObjects[5] = 55;

        for (Object myObject : myObjects) {
            System.out.println(myObject);
        }
        
        // You can also declare an array literal and do not need to declare the size
        Object[] myOtherObjects = new Object[] {"Madison", 21, "Olivia", 20, 3.14, true};
        
        String[] band = new String[4];
        band[0] = "Jisoo";
        band[1] = "Rosè";
        band[2] = "Lisa";
        band[3] = "Jennie";
        
        for (String s : band) {
            System.out.println(s);
        }
        
        
        for (Object o: myOtherObjects) {
            System.out.println(o);
        }

        for (Object o : myObjects) {
            System.out.println(o);
        }

        System.out.println(myObjects[0].getClass());

        if (myObjects[1] instanceof Integer) {
            System.out.println("Yep...");
        }
        
        if (myObjects[4] instanceof String) {
            System.out.println("Yep...");
        }

        System.out.println(Arrays.toString(myObjects));
        
        // Declaring a constant
        final int MULTIPLIER = 5;
        
        String[] bandNames = new String[] {"Jisoo", "Rosè", "Lisa", "Jennie"};
        int[] bandAges = new int[] {27, 26, 25, 25};
        
        for (int a : bandAges) {
            System.out.println(a * MULTIPLIER);
        }
        
        for (int i = 0; i < bandNames.length; i++) {
            for (int j = 0; j < bandAges.length; j++) {
                System.out.printf("%s is %d years old\n", bandNames[i], bandAges[j]);
            }
        }
        
        // Can use a unary increment (or decrement) on a unicode character
        char myLetter = 'd';
        myLetter++;
        System.out.println(myLetter); // prints 'e'
        
        char myHirgana = 'か';
        System.out.println(myHirgana);
        System.out.println((int) myHirgana);
        myHirgana++;
        System.out.println(myHirgana);
        System.out.println((int) myHirgana);
        
        // Generate a random int
        double rand = (int)(Math.random() * 100);
        System.out.println(Math.round(rand));
        
        double randnum = Math.random();
        System.out.println(randnum);
        
        // Number formatting
        double price = 11.99;
        // Gets the default based on OS locale settings
        NumberFormat usd = NumberFormat.getCurrencyInstance();
        String priceString = usd.format(price);
        System.out.println(priceString);
    }
}
