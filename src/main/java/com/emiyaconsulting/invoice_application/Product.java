package com.emiyaconsulting.invoice_application;

import java.text.NumberFormat;

public class Product {
    private String code;
    private String description;
    private double price;

    public Product(String code) {
        this.code = code;
        this.description = "";
        this.price = 0.00;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
}
