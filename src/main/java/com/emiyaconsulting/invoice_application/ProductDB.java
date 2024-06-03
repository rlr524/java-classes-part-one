package com.emiyaconsulting.invoice_application;

public class ProductDB {
    public static Product getProduct(String code) {
        Product p = new Product(code);
        
        p.setCode(code);
        if (code.equalsIgnoreCase("java")) {
            p.setDescription("Murach's Java Programming");
            p.setPrice(57.50);
        }
        else if (code.equalsIgnoreCase("jsp")) {
            p.setDescription("Murach's Java Servlets and JSP");
            p.setPrice(57.50);
        }
        else if (code.equalsIgnoreCase("mysql")) {
            p.setDescription("Murach's MySQL");
            p.setPrice(54.50);
        }
        else {
            p.setDescription("Unknown");
        }
        return p;
    }
}
