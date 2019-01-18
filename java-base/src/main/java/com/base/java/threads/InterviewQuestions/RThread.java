package com.base.java.threads.InterviewQuestions;

public class RThread implements  Runnable{
    private String name;

    private int count = 0;

    public RThread (String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 0; i < count; i++ ) {
            System.out.println(name + " 线程正在运行，第 " + i + " 次运行");
        }
    }
}
