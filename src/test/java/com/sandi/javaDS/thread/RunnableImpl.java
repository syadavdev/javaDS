package com.sandi.javaDS.thread;

import org.junit.Test;

public class RunnableImpl {

    @Test
    public void shouldRun(){
        System.out.println("Main thread : " + Thread.currentThread().getName());
        Thread t1 = new Thread(new Gmail());
        Thread t2 = new Thread(new Gmail());
        t1.start();
        t2.start();
    }

    @Test
    public void shouldRunOne(){
        final String resource1 = "ratan jaiswal";
        final String resource2 = "vimal jaiswal";
        // t1 tries to lock resource1 then resource2
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try { Thread.sleep(100);} catch (Exception e) {}

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }

    @Test
    public void shouldRunTwo(){
        String resource1 = "ratan jaiswal";
        String resource2 = "vimal jaiswal";
        resource1 = null;
        resource2 = null;
        System.gc();
    }

    {
        String n;
    }

    @Test
    public void shouldRunThree(){
        String s = null;
        String n = null + "apple";
        apple(n);
    }

    void apple(String s){
        System.out.println("String : "+ s);
    }

    void apple(Object s){
        System.out.println("Object : "+ s);
    }

    void apple(Long s){
        System.out.println("Long : "+ s);
    }

    @Test
    public void shouldRunFour(){
        Singleton singleton = Singleton.getInstance();

        Singleton singleton1 = Singleton.getInstance();
        singleton.setName("Sandeep");
        singleton.setName("Yadav");
        System.out.println(singleton.getName());
        System.out.println(singleton1.getName());
    }

    @Test
    public void shouldRunFive(){
        String name = "sandeas";
        StringBuilder stringBuilder = new StringBuilder();

        char[] names = name.toCharArray();

        int size = names.length;
        int i = 0, j = size - 1;
        boolean flag = false;

        while(i != j){
            if(names[i] != names[j]){
                flag = false;
                break;
            }
            flag = true;
            i = i + 1;
            j = j - 1;
        }

        System.out.println(flag);
    }

}

class Singleton {

    public static Singleton instance = null;

    public String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private Singleton(){
        this.name = "Single Name is";
    }

    public static Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }

}

class Gmail implements Runnable {

    public void run(){
        methodA();
        methodB();
    }

    public void methodA(){
        System.out.println("MethodA thread : "+ Thread.currentThread().getName());
        methodC();
    }

    public void methodB(){
        System.out.println("MethodB thread : "+ Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        methodC();
    }

    public void methodC(){
        System.out.println("MethodC thread : "+ Thread.currentThread().getName());
    }

}