package com.base.java.threads.InterviewQuestions;

public class FatherThread implements Runnable {
    @Override
    public void run() {
        Thread thread = new Thread(new ChildThread());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 线程 Father的调用方法
        for(int i = 0; i < 10; i++) {
            System.out.println("FatherThread.run -- " + i);
        }

    }
}
