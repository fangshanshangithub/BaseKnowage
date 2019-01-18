package com.base.java.threads.executors;

public class ThreadTwo implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("##### ThreadTwo 线程 " + Thread.currentThread().getName());
    }
}
