package com.base.java.threads.yield;


public class YieldMain {

    public static void main(String[] args){
        Thread t1 = new Thread(new YieldMain().new YieldThread("ZS"));
        Thread t2 = new Thread(new YieldMain().new YieldThread("LS"));

        t1.setPriority(1);
        t2.setPriority(5);

        t1.start();
        t2.start();


    }


    class YieldThread implements Runnable {

        private String name;

        public YieldThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            int i = 0;
            while(true) {
                System.out.println("线程:" + name +" --- " + i++);
            }

        }
    }

}
