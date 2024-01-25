package com.emiyaconsulting.switch_statements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Enhanced switch (switch expression)
        // Use also if you want to group multiple cases for a single return
        // (see day switch below) and can use fall through
        String description;
        int productID = 2;

        description = switch (productID) {
            case 1 -> "hammer";
            case 2 -> "Box of nails";
            case 3 -> "Pliers";
            default -> "Product not found";
        };
        System.out.println(description);
        
        // Classic switch
        String kid;
        System.out.print("Please enter the kid's age: ");
        int age = sc.nextInt();
        
        switch (age) {
            case 12:
                kid = "Jun";
                break;
            case 14:
                kid = "Mei";
                break;
            case 18:
                kid = "Madison";
                break;
            case 20:
                kid = "Ally";
                break;
            default:
                kid = "This is someone else's kid...";
                break;
        }
        System.out.println(kid);
        
        // Switch with fall through
        // Use this if you want to group cases with a single return value
        String day = "";
        String dayCode = "Wed";
        
        switch (dayCode) {
            case "Mon":
            case "Tue":
            case "Wed":
            case "Thu":
            case "Fri":
                day = "Weekday";
                break;
            case "Sat":
            case "Sun":
                day = "Weekend";
                break;
        }
        System.out.println(day);
    }
}
