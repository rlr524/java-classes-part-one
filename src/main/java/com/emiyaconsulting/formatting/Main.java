package com.emiyaconsulting.formatting;

public class Main {
    public static void main(String[] args) {
        String bulletList = "Print a bulleted list:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Second Point\n";
        
        String textBlock = """
                Print a bulleted list:
                    \u2022 First point
                        \u2022 Second point""";

        System.out.println(bulletList);
        System.out.println(textBlock);
        
        int age = 18;
        System.out.printf("Your age is %d%n", age);
        
        int yearOfBirth = 2024 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        System.out.printf("Your age is %.2f%n", (float) age);
        
        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d%n", i);
        }
    }
}
