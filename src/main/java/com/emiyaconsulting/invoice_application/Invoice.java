package com.emiyaconsulting.invoice_application;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Invoice {
    private ArrayList<LineItem> lineItems;

    public Invoice() {
        lineItems = new ArrayList<>();
    }
    
    public void addItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }
    
    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }
    
    public double getTotal() {
        double invoiceTotal = 0;
        for (LineItem lineItem : lineItems) {
            invoiceTotal += lineItem.getTotal();
        }
        return invoiceTotal;
    }
    
    public String getTotalFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(getTotal());
    }
}
