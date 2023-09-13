package com.emiyaconsulting.inheritance;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight < 35 ? "Medium" : "Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void bark() {
        System.out.println("The dog is barking.");
    }

    public void wagTail() {
        System.out.println("The dog is wagging its tail.");
    }

    public String getEarShape() {
        return earShape;
    }

    public void setEarShape(String earShape) {
        this.earShape = earShape;
    }

    public String getTailShape() {
        return tailShape;
    }

    public void setTailShape(String tailShape) {
        this.tailShape = tailShape;
    }

    @Override
    public void move(String speed) {
        // super.move(speed);
        System.out.println("Dogs walk, run and wag their tail. This dog can run at " + speed + " miles per hour.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                "} " + super.toString();
    }
}
