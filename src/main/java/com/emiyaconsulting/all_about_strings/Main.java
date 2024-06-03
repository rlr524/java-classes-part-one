package com.emiyaconsulting.all_about_strings;

public class Main {
    public static void main(String[] args) {
        printInformation("");
    }

    public static void printInformation(String str) {
        int length = str.length();
        System.out.printf("Length = %d %n", length);
        try {
            System.out.printf("First character = %c %n", str.charAt(0));
            System.out.printf("Last character = %c %n", str.charAt(length - 1));
        } catch (Exception e) {
            System.out.printf("Error: %s", e);
        }
    }
}
