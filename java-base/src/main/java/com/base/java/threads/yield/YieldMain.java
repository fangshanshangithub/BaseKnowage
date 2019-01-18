package com.base.java.threads.yield;


public class YieldMain {

    public static void main(String[] args){
        Thread t1 = new Thread(new YieldMain().new YieldThread("ZS"));
        Thread t2 = new Thread(new YieldMain().new YieldThread("LS"));


        /**/
        t1.setPriority(2);
        t2.setPriority(3);

        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("YieldMain.main -- 主线程结束");
    }


    class YieldThread implements Runnable {

        private String name;

        public YieldThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 30; i++) {
                if(i == 15) {
                    System.out.println("线程：" + name + "YieldThread.run -- 线程让出cpu");
                    Thread.yield();
                }
                System.out.println("线程：" + name +" 第" + i +"次开始运行 -- 当前线程数" + Thread.activeCount());
            }

        }
    }

}
