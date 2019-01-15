package com.base.java.threads.synchronizeds;


public class ThreadTest {

    private static int count;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("ThreadTest.main --- start");

        // 这个程序 不是同步的，50个线程去操作 共享资源count
        for(int i = 0; i < 50; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    count++;
                    System.out.println("线程：" + Thread.currentThread().getName() + " 运行count=" + count);
                }
            });

            // join start 前后顺序不影响程序
            thread.start();
            thread.join();

        }

        System.out.println("ThreadTest.main --- end");
    }

}
