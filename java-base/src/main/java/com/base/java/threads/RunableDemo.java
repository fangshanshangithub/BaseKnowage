package com.base.java.threads;

public class RunableDemo implements Runnable{
    private int n;

    private String name;

    public RunableDemo(String name, int n) {
        this.name = name;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println(name + i);
        }
    }
}
