package com.emiyaconsulting.invoices;

import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {
    public static void main(String[] args) {
        final double DISCOUNT_PCT = .05;
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter subtotal: ");
            String input = sc.nextLine();
            double subtotal = Double.parseDouble(input);
            System.out.println();

            double discountAmount = subtotal * DISCOUNT_PCT;
            // Fix the formatter rounding error
            // This works for this simple app, but for a more complex financial app,
            // use the BigDecimal class for amounts instead.
            discountAmount = (double) Math.round(discountAmount * 100) / 100;
            double total = subtotal - discountAmount;

            NumberFormat percent = NumberFormat.getPercentInstance();
            System.out.printf("%-20s%12s%n", "Discount Percent:", percent.format(DISCOUNT_PCT));
            
            // A format specification for a string that is left-aligned 20 char wide
            // followed by a float that is 12 char wide, right-aligned, and rounded to
            // two decimal places.
            String format = "%-20s%,12.2f%n";
            System.out.printf(format, "Subtotal:", subtotal);
            System.out.printf(format, "Discount Amount:", discountAmount);
            System.out.printf(format, "Invoice Total:", total);

            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }
}
