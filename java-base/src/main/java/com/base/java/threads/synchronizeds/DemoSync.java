package com.base.java.threads.synchronizeds;

public class DemoSync {

    public static void main(String[] args) {
        ThreadRunable tr = new ThreadRunable();
        Thread th1 = new Thread(new ThreadRunable());
        Thread th2 = new Thread(new ThreadRunable());

        th1.start();
        th2.start();

    }




}


class ThreadRunable implements Runnable {



    private static int count;


    @Override
    public  void run() {// 锁 类
        sysPrint();
    }

    public synchronized static  void  sysPrint() {

        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + count++);
        }

    }

   /* @Override
    public synchronized void run() { // 锁 对象
            for(int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "---" + count++);
            }

    }*/

    /*@Override
    public void run() {
        synchronized(this) { // 锁 对象
            for(int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "---" + count++);
            }
        }

    }*/
}

