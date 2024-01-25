package com.emiyaconsulting.inheritance_challenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate) {
        super(name, birthDate, hireDate);
    }
    
    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return adjustedPay;
    }

    public void retire(String name) {
        this.isRetired = true;
        System.out.printf("%s is now retired.\n", name);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }
}
