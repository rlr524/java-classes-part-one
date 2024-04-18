package com.emiyaconsulting.bank_account;

public class Main {
    public static void main(String[] args) {
        Account madison = new Account();

        madison.setCustomerName("Madison Ranf");
        madison.setAccountNumber(1234567890);
        madison.setEmail("madison@gmail.com");
        madison.setPhoneNumber("425-466-7561");

        madison.depositFunds(500.00);

        madison.withdrawFunds(200.00);

        Account olivia = new Account(123456788, 600.00, "Olivia",
                "olivia@gmail.com", "425-455-7555");

        olivia.depositFunds(800.00);
        double oliviaBalance = olivia.getAccountBalance();
        System.out.println(oliviaBalance);

        System.out.println("*********************************************************************************");
        Account defaultAccount = new Account();
        defaultAccount.depositFunds(100.00);
        System.out.println(defaultAccount.getAccountBalance());

        System.out.println("**********************************************************************************");
        Account tzuyu = new Account("Tzuyu", "tzuyu@gmail.com", "123-456-7890");
        System.out.println(tzuyu.getAccountBalance());
    }
}
