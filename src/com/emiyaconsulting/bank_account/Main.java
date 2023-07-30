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
    }
}
