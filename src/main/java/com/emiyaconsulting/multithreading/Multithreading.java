package com.emiyaconsulting.multithreading;

public class Multithreading {
    public static void main(String[] args) {
        MultithreadThing myThing = new MultithreadThing("Madison");
        MultithreadThing myThingTwo = new MultithreadThing("Olivia");
        MultithreadThing myThingThree = new MultithreadThing("Mei");
        MultithreadThing myThingFour = new MultithreadThing("Nicole");
        
        // You can do myThing.run(), but all that will do is run the program. Using myThing.start()
        // actually gets the multithreading as it will kick off the run() method in the
        // MultithreadThing class on its own thread, then proceed down the main thread.
        myThing.start();
        myThingTwo.start();
        myThingThree.start();
        myThingFour.start();
   
//        myThing.run();
//        myThingTwo.run();
    }
}
