package com.emiyaconsulting.generics;

public class Main {
    public static void main(String[] args) {
        ThingPrinter<Integer> myString = new ThingPrinter<>(18);
        myString.PrintThing();

        System.out.println(23);
        System.out.println("Olivia");
    }
}
