package com.base.java.threads.InterviewQuestions;

public class ChildThread implements Runnable {
    @Override
    public void run() {
        System.out.println("ChildThread.run");
        Thread thread = new Thread(new RThread("RTTT", 10));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
