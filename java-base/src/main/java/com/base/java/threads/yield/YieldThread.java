package com.base.java.threads.yield;

public class YieldThread extends Thread {

    public void run() {
        for(int i = 0; i < 50; i++) {
            System.out.println("YieldThread.run:  " + this.getName() + "---" + i);
            if(i == 30) {
                Thread.yield();
            }

        }
    }

}
