package com.base.java.threads;

public class MainDemo {

    public static void main(String[] args) throws InterruptedException {

        ThreadsDemo th1 = new ThreadsDemo("AA", 10);

        th1.start();
        th1.join();
        try {
            th1.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //threadInfo();

        //mainPrint();
        //thread3();
        //thread2();
        //thread1();
    }

    private static void threadInfo() {
        System.out.println("MainDemo.threadInfo: " + Thread.currentThread().getName());



    }

    public static void mainPrint() {
        System.out.println("MainDemo.mainPrint------start");
        Thread th1 = new Thread(new RunableDemo("C", 5));
        th1.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("MainDemo打印： " + i);
            if(i == 3) {

            }
        }



        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("MainDemo.mainPrint------end");

    }
    public static void thread3() {
        new Thread(new RunableDemo("C", 5)).start();
        new Thread(new RunableDemo("D", 5)).start();
    }

    public static void thread2() {
        ThreadsDemo th1 = new ThreadsDemo("A", 5);
        ThreadsDemo th2 = th1;

        th1.start();
        th2.start();
    }


    public static void thread1() {
        ThreadsDemo th1 = new ThreadsDemo("A", 5);
        ThreadsDemo th2 = new ThreadsDemo("B", 5);

        th1.start();
        th2.start();
    }
}
