package com.emiyaconsulting.inheritance_challenge;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // The getCurrencyInstance method uses the default
        // locale set by the os if no locale is specified.
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        SalariedEmployee madison = new SalariedEmployee("Madison", "2004-06-02", 
                "2023-10-05");
        
        int age = madison.getAge();
        System.out.printf("%s is %d years old.\n", madison.getName(), age);
        double pay = madison.collectPay(3500.00, 0, 0);
        System.out.printf("The pay for %s is %s.\n", madison.getName(), nf.format(pay));
        madison.retire(madison.getName());
        double newPay = madison.collectPay();
        System.out.println("Madison's new pay is: " + nf.format(newPay));
        System.out.println(madison);
        
        SalariedEmployee rob = new SalariedEmployee("Rob", "1972-05-24", 
                "2023-06-10");
        System.out.println(rob);
    }
}
