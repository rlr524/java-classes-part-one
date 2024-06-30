package com.emiyaconsulting.file_io;

import java.io.*;
import java.util.logging.Logger;

public class FileInOut {
    public static void main(String[] args) throws IOException {
        writeToFile();
        readFromFile();
        getProducts();
    }
    
    // The throws clause indicates that we're using classes, like FileWriter, that throw an exception, and we're
    // not going to handle them with a try-with-resources clause like we do in the getProducts() method.
    static void writeToFile() throws IOException {
        String fileName = "about-madison.txt";

        // Open an output stream
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));

        // Write data to the stream
        out.println("Madison turned 22 yesterday.");

        // Close the output stream and free system resources
        out.close();
    }
    
    static void readFromFile() throws IOException {
        String fileName = "madison.txt";
        
        // Open an input stream
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        
        // Read data from the stream and print it to the console
        String line = in.readLine();
        while (line != null) {
            System.out.println(line);
            line = in.readLine();
        }
        
        // Close the input stream and free system resources
        in.close();
    }
    
    static void getProducts() {
        String filename = "products.txt";
        
        try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
            String line = in.readLine();
            while (line != null) { // prevent the EOF exception
                System.out.println(line);
                line = in.readLine();
            }
        }
        catch (FileNotFoundException e) { // catch the most specific exception
            System.out.println(filename + " not found");
        }
        catch (IOException e) { // catch the least specific exception
            System.out.println(e.getMessage());; // print the exception to the console
        }
    }
}
