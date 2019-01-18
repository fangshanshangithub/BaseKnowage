package com.base.java.threads.priority;

/**
 *  线程优先级
 *  1.线程的优先级有继承关系，比如A线程中创建了B线程，那么B将和A具有相同的优先级
 *
 */
public class PriorityThreadDemo {

    public static void main(String[] args) {
        System.out.println("主线程：" + Thread.currentThread().getName() + " -- 优先级：" + Thread.currentThread().getPriority()); //默认优先级为Thread.NORM_PRIORITY  即 5

        // priorityTest1();
        priorityTest2();

    }

    private static void priorityTest1() {
        // 在线程类 run()方法 之外指定优先级
        Thread thread = new Thread(new PriorityThreadDemo().new PriorityThread1());
        thread.start();
        thread.setPriority(Thread.MAX_PRIORITY);
    }


    private static void priorityTest2() {
        // 在线程类 run()方法 中指定优先级
        Thread thread = new Thread(new PriorityThreadDemo().new PriorityThread2());
        thread.start();
        System.out.println("主方法中thread线程优先级别： " + thread.getPriority());
    }


    // 线程类1
    class PriorityThread1 implements Runnable {
        @Override
        public void run() {
            System.out.println("线程：" + Thread.currentThread().getName() + " --- is start" + " -- 优先级【线程类run()方法中】：" + Thread.currentThread().getPriority());
        }
    }

    // 线程类2
    class PriorityThread2 implements Runnable {
        @Override
        public void run() {
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // run 方法中设置线程优先级
            System.out.println("线程：" + Thread.currentThread().getName() + " --- is start" + " -- 优先级【线程类run()方法中】：" + Thread.currentThread().getPriority());
        }
    }

}
