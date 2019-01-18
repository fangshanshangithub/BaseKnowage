package com.base.java.threads.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 线程池
 */
public class ExecutorsTest {

    public static void main(String[] args) {
        //test1();

        ExecutorService threadPool = Executors.newCachedThreadPool();

        List<Future<String>> futureList = new ArrayList<>();
        for (int i = 0; i<10; i++) {
            Future<String> future = threadPool.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return "ssssssssss";
                }
            });

            futureList.add(future);
        }


        for(int i = 0;i<futureList.size();i++){
            System.out.println(futureList.get(i).toString());
        }



    }


    private static void test1() {
        // newFixedThreadPool 创建一个固定的大小的线程池
        ExecutorService threadPool =  Executors.newFixedThreadPool(3);

        ThreadTwo two = new ThreadTwo();
        for (int i = 0; i < 30; i++) {
            threadPool.execute(two);
        }

        //threadPool.shutdownNow();// 立即把池子中所有线程干掉，无论任务是否干完
        threadPool.shutdown(); // 现等待池子中的线程运行完，再干掉，（关掉空闲状态的线程）
    }

}



