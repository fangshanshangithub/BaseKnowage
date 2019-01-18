package com.base.java.threads.synchronizeds;

import java.util.TreeMap;

/**
 * 多线程经典问题 -- 生产者，消费者问题
 */
public class ProducterConsumerThread {

    public static int productCount; //产品数量

    // 生产者生产产品 -- 使用synchronized 方法是由于productCount共享资源 不能同时被生产者+，消费者-，2者要互斥
    public synchronized void createProduct() {

        if(productCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            productCount ++;
            System.out.println("生产者生产1件产品，当前产品有：" + productCount);
            notifyAll();
        }

    }

    // 消费者消费产品
    public synchronized void useProduct() {

        if(productCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            productCount --;
            System.out.println("消费者消费1件产品，当前产品有：" + productCount);
            notifyAll();
        }


    }

    public static void main(String[] args) {

        // 该线程触发多个生产者线程去生产产品
        ProducterConsumerThread pcer = new ProducterConsumerThread();


        new Thread(new Producter(pcer)).start();

        new Thread(new Consumer(pcer)).start();


    }


}


// 生产者线程
class Producter implements Runnable {

    ProducterConsumerThread pcer;

    public Producter(ProducterConsumerThread pct) {
        pcer = pct;
    }

    @Override
    public void run() {
        pcer.createProduct();
    }
}

// 生产者线程
class Consumer implements Runnable {

    ProducterConsumerThread pcer;

    public Consumer(ProducterConsumerThread pct) {
        this.pcer = pct;
    }

    @Override
    public void run() {
        for(int i = 1; i < 50; i++) {
                pcer.useProduct();

        }
    }
}
