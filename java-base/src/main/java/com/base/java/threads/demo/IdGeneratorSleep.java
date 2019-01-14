package com.base.java.threads.demo;

public class IdGeneratorSleep {

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 1000; i++) {
            Thread t = new Thread(new IdGeneratorThread());


            t.setName("「线程」-"+ i);
            t.start();
            Thread.sleep(1000);

        }

    }

}

class IdGeneratorThread implements Runnable {

    private static int i = 0;

    @Override
    public void run() {
        if(i ==15) { // 线程15 sleep 5秒之后或导致之后的一些线程顺序乱掉
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        i++;
        System.out.println(Thread.currentThread().getName() + ": IdGeneratorThread.run---" + new IdGenerator().getNext() + ";  i = " + i);

    }
}


class IdGenerator {
    public static int i = 0;

    public int getNext() {
        return i++;
    }
}