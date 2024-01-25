package com.emiyaconsulting.inheritance_challenge;

import java.time.LocalDate;
import java.time.Period;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker() {
        
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        LocalDate dob = LocalDate.parse(this.birthDate);
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }
    
    public double collectPay(double salary, double rate, int hours) {
        if (salary > 0) {
            return salary;
        } else {
            return rate * hours;
        }
    }
    
    public void terminate(String endDate) {
        this.endDate = String.valueOf(LocalDate.now());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
