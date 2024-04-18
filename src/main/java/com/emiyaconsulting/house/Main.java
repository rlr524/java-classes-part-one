package com.emiyaconsulting.house;

public class Main {
    public static void main(String[] args) {
        House bluehouse = new House("blue");
        House anotherHouse = bluehouse;

        System.out.println("The blueHouse is: " + bluehouse.getColor());
        System.out.println("The anotherHouse is: " + anotherHouse.getColor());

        System.out.println("******Set color of anotherHouse to red******");
        anotherHouse.setColor("red");
        System.out.println("The blueHouse is: " + bluehouse.getColor());
        System.out.println("The anotherHouse is: " + anotherHouse.getColor());
        // Both are red now because both blueHouse and anotherHouse are references to the same
        // object, so change one, change them both, because the state of the underlying
        // object is being changed.Think of blueHouse and anotherHouse as being the same address
        // written on two different pieces of paper.

        System.out.println("******Create a greenHouse and assign anotherHouse to it******");
        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println("The blueHouse is: " + bluehouse.getColor());
        System.out.println("The greenHouse is: " + greenHouse.getColor());
        System.out.println("The anotherHouse is: " + anotherHouse.getColor());

        // Because anotherHouse was de-referenced from blueHouse and a reference was created to greenHouse
        // blueHouse will stay red and greenHouse and anotherHouse will both be green

        // You call static methods on the class. Use static methods when they don't need to access
        // instance variables, like here, the sayCongrats method isn't accessing the color variable. This is
        // a bit different from static variables, as you still call them on the instance, but they are shared
        // between instances, so they act as class variables, though not called on the class.
        House.sayCongrats("Madison");
    }
}
