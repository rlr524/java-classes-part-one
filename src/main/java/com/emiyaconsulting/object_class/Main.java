package com.emiyaconsulting.object_class;

public class Main {
    public static void main(String[] args) {
        Student madison = new Student("Madison", 18);
        System.out.println(madison.toString());
        // Demonstrate that when you copy an object you are creating a reference to that
        // object, so any change made to one is made to the other.
        Student madi = madison;
        System.out.println(madi.toString());
        madi.setName("Madison Zirui Ranf");
        System.out.println(madison.getName());
        System.out.println(madi.getName());
        System.out.println(madi.hashCode());
        System.out.println(madison.hashCode());
        System.out.println(madi);
        System.out.println(madison);

        PrimarySchoolStudent mei = new PrimarySchoolStudent("Mei", 13,
                "Rob and Jen");
        System.out.println(mei);
    }
}

