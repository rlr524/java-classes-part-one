package com.emiyaconsulting.future_value;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValueApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Future Value Calculator");
        Scanner sc = new Scanner(System.in);
        int years = 0;
        double interestRate = 0;
        BigDecimal monthlyInvestment = BigDecimal.valueOf(0.0);

        String choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            // get the input from the user
            // For this simple app, using double would be sufficient here, but it's recommended
            // to use the non-primitive BigDecimal class from the math library for typing
            // currency values.
            System.out.print("Enter monthly investment: ");
            try {
                monthlyInvestment = BigDecimal.valueOf(Double.parseDouble(sc.nextLine()));
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number - " + e);
                System.out.print("Enter monthly investment: ");
                monthlyInvestment = BigDecimal.valueOf(Double.parseDouble(sc.nextLine()));
            }
            
            System.out.print("Enter yearly interest rate: ");
            try {
                interestRate = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number - " + e);
                System.out.print("Enter yearly interest rate: ");
                interestRate = Double.parseDouble(sc.nextLine());
            }
            
            System.out.print("Enter number of years: ");
            try {
                years = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number - " + e);
                System.out.print("Enter number of years: ");
                years = Integer.parseInt(sc.nextLine());
            }


            // call the method that calculates the future value
            BigDecimal futureValue = calculateFutureValue(monthlyInvestment, interestRate, years);
            
            // get the currency and percent formatters
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMinimumFractionDigits(1);

            // format and display the result
            System.out.println("Monthly investment:    " + currency.format(monthlyInvestment));
            System.out.println("Yearly interest rate:  " + percent.format(interestRate / 100));
            System.out.println("Number of years:       " + years);
            System.out.println("Future value:          " + currency.format(futureValue));
            System.out.println();

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }

    public static BigDecimal calculateFutureValue(BigDecimal monthlyInvestment, double interestRate,
                                                  int years) {
        // convert yearly values to monthly values
        BigDecimal monthlyInterestRate = BigDecimal.valueOf(interestRate / 12 / 100);
        int months = years * 12;

        // calculate future value
        BigDecimal futureValue = BigDecimal.valueOf(0.00);
        for (int i = 1; i <= months; i++) {
            futureValue = (monthlyInvestment.add(futureValue))
                    .multiply(monthlyInterestRate.add(BigDecimal.valueOf(1)));
        }
        return futureValue;
    }
}