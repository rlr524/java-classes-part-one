package com.emiyaconsulting.generics;

public class ThingPrinter <T> {
    T thingToBePrinted;

    public ThingPrinter(T thingToBePrinted) {
        this.thingToBePrinted = thingToBePrinted;
    }

    public void PrintThing() {
        System.out.println("***" + thingToBePrinted + "***");
    }
}
