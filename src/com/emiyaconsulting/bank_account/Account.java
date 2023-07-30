package com.emiyaconsulting.bank_account;

public class Account {
    private long accountNumber;

    // Note the Java docs recommend using BigDecimal, not double, for currency. In theory, BigDecimal
    // is the "correct" solution, however, in practice, if you look at the source code for most bank
    // systems, you will find that they use double because it works in practice and is less error-prone.
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void depositFunds(double amount) {
        double v = this.accountBalance + amount;
        double newBalance = setAccountBalance(v);
        System.out.printf("Your new account balance is $%,.2f\n", newBalance);
    }

    public void withdrawFunds(double amount) {
        double v = this.accountBalance - amount;
        if (amount > this.accountBalance) {
            System.out.printf("Withdrawal declined! Your withdrawal amount of $%,.2f exceeds your balance of $%,.2f\n",
                    amount, this.accountBalance);
        } else {
            System.out.printf("Your new account balance is $%,.2f\n", v);
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
        return accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}