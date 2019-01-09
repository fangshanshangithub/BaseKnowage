package com.base.java.threads.abcThreadsDemo;

public class AbcPrint {

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        AbcThread pa = new AbcThread("A", c, a);
        AbcThread pb = new AbcThread("B", a, b);
        AbcThread pc = new AbcThread("C", b, c);


        new Thread(pa).start();
        //Thread.sleep(100);  //确保按顺序A、B、C执行
        new Thread(pb).start();
        //Thread.sleep(100);
        new Thread(pc).start();
        //Thread.sleep(100);
    }
}

class AbcThread implements Runnable {

    private Object pre;

    private Object self;

    private String name;

    public AbcThread(String name, Object pre, Object self) {
        this.name = name;
        this.pre = pre;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 10;

        while(count > 0) {
            synchronized (pre) {
             synchronized (self) {
                 System.out.println(name);
                 count--;
                 self.notify();
             }

                try {
                    pre.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}