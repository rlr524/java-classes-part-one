package com.emiyaconsulting.generics;

public class Main {
    public static void main(String[] args) {
        ThingPrinter<String> myString = new ThingPrinter<>("Madison");
        myString.PrintThing();

        System.out.println(23);
        System.out.println("Olivia");
    }
}
