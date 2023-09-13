package com.emiyaconsulting.inheritance;

public class Animal {
    // Protected access control is conditional encapsulation, it allows access only by classes that inherit this class.
    // Note that package-private is the default access control in Java if no access control is used and if the
    // subclasses are in the same package, they will get access, otherwise, protected should be used if the
    // subclasses are in a separate package. Note, if using the default package, default package-private does not
    // apply and the fields will be treated as private.
    String type;
    String size;
    double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public void move(String speed) {
        System.out.printf("The %s is moving at %s miles per hour.\n", type, speed);
    }

    public void makeNoise(String noise) {
        System.out.printf("The %s is making a noise of %s\n", type, noise);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
