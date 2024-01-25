package com.emiyaconsulting.lambdas;

@FunctionalInterface
public interface Printable {
    /*
    This is a "functional interface" because it has exactly one abstract method. The
    abstract method (print()) is abstract because it has no implementation, and all
    methods in interfaces are usually abstract.
     */
    void print(String prefix, String suffix);
    
    /*
    Note that you can have a method inside an interface that has implementation
    code, but it must be marked as default, and it is generally considered to be
    an anti-pattern. Note that our interface is still functional because it has
    exactly one abstract method. Unlike abstract methods, default methods 
    DO NOT need to be implemented by classes that implement their interface.
     */
    default Integer add(Integer numbOne, Integer numbTwo) {
        return numbOne + numbTwo;
    }
}
