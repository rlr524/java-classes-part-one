package com.emiyaconsulting.strings;

import org.openjdk.jol.vm.VM;

public class Main {
    public static void main(String[] args) {
        String name = "Madison";
        String newName = name;

        System.out.println(name);
        System.out.println(newName);
        // At this point name and newName are pointing to the same memory location because that location contains
        // the same value, this is one way how Java optimizes memory.
        System.out.println("Address of name: " + VM.current().addressOf(name));
        System.out.println("Address of newName: " + VM.current().addressOf(newName));
        // Don't confuse object hash code with mem address. As you can see, again, the hash codes are the same because
        // name and newName are referencing the same object instance of String. But the hash code is simply a hash
        // of the object allowing for a unique way to identify the object, and not related to the location in memory.
        System.out.println("Hash code of name: " + name.hashCode());
        System.out.println("Hash code of newName: " + newName.hashCode());

        // This breaks the reference to name and assigns newName to a new location in memory. This what is meant
        // by Strings are immutable, but they're also reference types. 
        newName = "Madi"; 
        System.out.println(name);
        System.out.println(newName);
        System.out.println("Address of name: " + VM.current().addressOf(name));
        System.out.println("Address of newName: " + VM.current().addressOf(newName));
        // Note now there are two different object instances of String.
        System.out.println("Hash code of name: " + name.hashCode());
        System.out.println("Hash code of newName: " + newName.hashCode());
    }
}
