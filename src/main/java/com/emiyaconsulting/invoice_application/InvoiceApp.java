package com.emiyaconsulting.invoice_application;

public class InvoiceApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Invoice Application\n");
        
        Invoice invoice = new Invoice();
        getLineItems(invoice);
        displayInvoice(invoice);
    }
    
    public static void getLineItems(Invoice invoice) {
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            String productCode = Console.getString("Enter product code: ");
            int quantity = Console.getInt("Enter quantity: ");
            
            Product product = ProductDB.getProduct(productCode);
            invoice.addItem(new LineItem(product, quantity));
            
            choice = Console.getString("Another line item? (y/n): ");
            System.out.println();
        }
    }
    
    public static void displayInvoice(Invoice invoice) {
        String spec = "%-35s%7s%7s%12s%n";
        System.out.printf(spec, "Description", "Price", "Qty", "Total");
        System.out.printf(spec, "------------", "-----", "---", "-----");
        
        for (LineItem lineItem : invoice.getLineItems()) {
            Product product = lineItem.getProduct();
            System.out.printf("%-35s", product.getDescription());
            System.out.printf("%7s", product.getPriceFormatted());
            System.out.printf("%7d", lineItem.getQuantity());
            System.out.printf("%12s%n", lineItem.getTotalFormatted());
        }
        System.out.printf("%nINVOICE TOTAL:%47s%n%n", invoice.getTotalFormatted());
    }
}
