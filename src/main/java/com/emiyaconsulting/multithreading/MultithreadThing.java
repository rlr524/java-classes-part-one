package com.emiyaconsulting.multithreading;

import java.util.Objects;

// Alternatively to extending Thread, you can implement the Runnable interface with
// 'implements Runnable'. In this class, everything else would stay the same, and you
// could still extend another class (remember, Java doesn't have multiple inheritance). The
// main difference would be in the main method, instead of:

// MultithreadThing myThing = new MultithreadThing("Madison");
// myThing.start();

// You do this as you need to create a new Thread object, pass in your object that you
// want to thread and call start on the Thread object vs directly on your object to be 
// multithreaded:
// MultithreadThing myThing = new MultithreadThing("Madison");
// Thread myThread = new Thread(myThing);
// myThread.start()

// Also with implementing Runnable, you can call join() on the Thread object which tells
// Java to wait for that thread to die, stopping the rest of the program while it waits
// for this specific thread to end.

// You can also call isAlive() on the Thread object, which simply returns a bool telling
// you if that thread is still alive or not.


public class MultithreadThing extends Thread {
    private final String kidName;

    public MultithreadThing(String kidName) {
        this.kidName = kidName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " " + kidName);
            
            // If there is an exception on one thread, the others keep going.
            if (Objects.equals(kidName, "Mei")) {
                throw new RuntimeException();
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
