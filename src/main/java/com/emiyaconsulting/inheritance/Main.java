package com.emiyaconsulting.inheritance;

import com.emiyaconsulting.car.Car;

public class Main {
    public static void main(String[] args) {
        Dog rover = new Dog("Lab", 75);
        Car myCar = new Car();

        rover.makeNoise("ruff");
        rover.move("15");
        rover.bark();
        rover.wagTail();
        rover.setEarShape("floppy");
        rover.setTailShape("long");
        System.out.println(rover);

        myCar.describeCar();
    }
}
