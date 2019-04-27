package com.base.java.threads.join;

public class RunableDemo {

    public static void main(String[] args) {
        System.out.println("RunableDemo.main -- start");
        Thread thread = new Thread(new RThread());
        thread.start();
        try {
            thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread.join(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("RunableDemo.main -- end");

    }

}

class RThread implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("RThread.run -- " + Thread.currentThread().getName() + " -- " + i);
            if( i == 5) {
                Thread thread = new Thread(new TThread());
                thread.setName("线程二");
                thread.start();
                try {
                    thread.join(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class TThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("TThread.run -- " + Thread.currentThread().getName() + " -- " + i);

        }
    }
}