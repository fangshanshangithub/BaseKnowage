package com.base.java.threads.join;


public class ThreadsTests {

    public static void main(String[] args) {
        RunableThread runableThread1 = new RunableThread(5);
        RunableThread runableThread2 = new RunableThread(5);

        Thread thread = new Thread(runableThread1);
        thread.start();
        thread.setPriority(1);
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread1 = new Thread(runableThread2);
        thread1.start();
        thread1.setPriority(7);
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}

class RunableThread  implements Runnable {

    private int i;

    public RunableThread(int i) {
        this.i = i;
    }


    @Override
    public void run() {
        while (i  > 0) {
            System.out.println("当前运行的线程是:" + Thread.currentThread().getName() + " -- " + i + ";优先级为：" + Thread.currentThread().getPriority() + "; " );
            i--;
        }
    }
}
