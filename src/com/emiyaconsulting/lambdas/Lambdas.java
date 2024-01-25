package com.emiyaconsulting.lambdas;

public class Lambdas {
    public static void main(String[] args) {
        // Cat myCat = new Cat();
        /*
        Lambda (just an anonymous method) example. We no longer need the
        implementation of the print() method in Cat nor do we need to implement
        the Printable interface inside of cat anymore, we're doing all the
        implementation inside the lambda. We also no longer need to instantiate a
        Cat object just to use the printThing implementation. A lambda is also
        essentially just a closure, though, formally, Java does not have closures
        since 1.6. Lambdas can only be used for methods that implement an
        interface that is a Functional Interface (has exactly one abstract method). In
        short, a lambda is a shortcut to defining an implementation of a Functional
        Interface. It essentially allows you to treat code as a parameter.
         */
        Printable lambdaPrintable = (p, s) -> System.out.printf("%sMeow%s", p, s);
        printThing(lambdaPrintable);

        
        // myCat.print();

        // printThing(myCat);
    }
    
    static void printThing(Printable thing) {
        thing.print("Hey, ", "!");
    }
}
