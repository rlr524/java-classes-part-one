package com.emiyaconsulting.inheritance_challenge;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate) {
        super(name, birthDate, hireDate);
    }

    @Override
    public double collectPay() {
        return 0;
    }

    public void getDoublePay() {
        
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
}
