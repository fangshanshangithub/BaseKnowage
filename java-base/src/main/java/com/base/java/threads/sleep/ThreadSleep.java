package com.base.java.threads.sleep;

public class ThreadSleep implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("ThreadSleep.main -- start");

        Thread thread = new Thread(new ThreadSleep());
        thread.setName("sleep 测试线程");

        thread.start();
        //thread.join();
        thread.wait(10000);

        System.out.println("ThreadSleep.main -- end");
    }


    @Override
    public void run() {
       /* try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println(Thread.currentThread().getName() + " -- run" );
    }
}
