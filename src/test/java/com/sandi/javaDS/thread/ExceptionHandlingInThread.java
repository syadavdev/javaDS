package com.sandi.javaDS.thread;

public class ExceptionHandlingInThread {

    public static void main(String...args){

        //Handler for exception
        Thread.UncaughtExceptionHandler h = (th, ex) -> System.out.println("Uncaught exception: " + ex);

        //Thread
        Thread t = new Thread(() -> {
            System.out.println("Sleeping...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted.");
            }
            System.out.println("Throwing exception...");
            throw new RuntimeException();
        });
        t.setUncaughtExceptionHandler(h);
        t.start();
    }

}
