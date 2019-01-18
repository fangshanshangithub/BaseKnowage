package com.base.java.threads.InterviewQuestions;


import java.util.concurrent.locks.Lock;

/**
 * 线程运行顺序 T1之后T2，T2之后T3，T3之后T4
 *
 * T1 --> T2 --> T3 --> T4
 * */
public class Question1 {


    public static void main(String[] args) throws InterruptedException {
        //firstMethod();
        secondMethod();
    }

    /**
     * 线程嵌套调用，join()方法
     */
    private static void secondMethod() {
        new Thread(new FatherThread()).start();

    }


    /**
     * 第一种方法 线程之间不存在调用关系，平级的
     * @throws InterruptedException
     */
    private static void firstMethod() throws InterruptedException {
        Thread t1 = new Thread(new RThread("T1", 10));
        Thread t2 = new Thread(new RThread("####T2", 10));

        Thread t3 = new Thread(new RThread("*****T3", 10));

        t1.start();
        t2.start();
        t3.start();

        // join() 方法要在 start() 方法之后，否则无效，join() 方法也要有顺序，否则也会控制不住
        t2.join();
        t3.join();

        t1.join();
    }
}
