package com.emiyaconsulting.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog rover = new Dog("Lab", 75);

        rover.makeNoise("ruff");
        rover.move("15");
        rover.bark();
        rover.wagTail();
        rover.setEarShape("floppy");
        rover.setTailShape("long");
        System.out.println(rover);
    }
}
