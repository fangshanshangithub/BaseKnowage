package com.base.java.threads.synchronizeds;


/**
 * synchronized 控制范围
 */
public class SynchronizedRange {

    public static void main(String[] args) {

        //Persion persion = new Persion();

        for(int i = 0; i < 5; i++) {
            Persion persion = new Persion();
            Thread thread = new Thread(new SynRunable(persion));
            thread.start();
        }
    }
}


class SynRunable implements Runnable {

    private Persion persion;


    public SynRunable(Persion persion) {
        this.persion = persion;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            persion.say_01(Thread.currentThread().getName());
        }

    }
}



class Persion {

    static int ID; // 共享资源

    /**
     * 同步范围是 对象
     */
    public void say_01(String name) {
        synchronized (this) {
            ID++;
            System.out.println(name + " -- say_01[对象]" + ID);
        }

    }

    public synchronized void say_02(String name) {
        ID++;
        System.out.println(name + " -- say_02 " + ID);
    }

}