package com.emiyaconsulting.house;

public class House {
    private String color;

    public House(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void sayCongrats(String name) {
        System.out.println("Hi " + name + " congrats on your house!");
    }
}
