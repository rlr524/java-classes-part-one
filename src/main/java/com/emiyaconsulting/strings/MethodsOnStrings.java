package com.emiyaconsulting.strings;

public class MethodsOnStrings {
    public static void main(String[] args) {
        String birthDate = "06/02/2002";
        int startingIndex = birthDate.indexOf("2002");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(0,2));
        System.out.println("Day = " + birthDate.substring(3,5));
        
        String newDate = String.join("/","06", "02", "2002");
        System.out.println("New date = " + newDate);
        
        newDate = "06";
        newDate = newDate.concat("/");
        newDate = newDate.concat("02");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2002");
        System.out.println("New date concat = " + newDate);
        
        newDate = "06".concat("/").concat("02").concat("/").concat("2002");
        System.out.println("New date concat two = " + newDate);

        System.out.println(newDate.replace("/","-"));
        String newDateTwo = "06-02-2002";
        System.out.println(newDateTwo.replaceFirst("-","---"));
        String newDateThree = "06-02-2002";
        System.out.println(newDateThree.replaceAll("-","&"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("DEF\n".repeat(3).indent(8));
        System.out.println("_".repeat(20));
    }
}
