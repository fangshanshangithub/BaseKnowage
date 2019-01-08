package com.base.java.threads.yield;

public class YieldMain {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("YieldMain.main------start-----" + Thread.currentThread().isDaemon());
        YieldThread th1 = new YieldThread();
        YieldThread th2 = new YieldThread();
        System.out.println("th1.getName" + th1.getName());
        System.out.println("th2.getName" + th2.getName());
        th1.start();

        th1.wait(10000);

        th2.start();
        System.out.println("YieldMain.main------end");
    }

}
