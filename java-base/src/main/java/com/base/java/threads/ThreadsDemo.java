package com.base.java.threads;

public class ThreadsDemo extends Thread{

    private String name;

    private int n;

    public ThreadsDemo(String name, int n) {
        this.name = name;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println(name + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
