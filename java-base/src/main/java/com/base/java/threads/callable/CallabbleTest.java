package com.base.java.threads.callable;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class CallabbleTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*FutureTask<Long> futureTask = new FutureTask<>(new SumTask());
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(futureTask);
        while(futureTask.isDone()) {

            System.out.println("1111");
            futureTask.cancel(true);

        }

        System.out.println(futureTask.get());*/

        /*FutureTask<Long> futureTask = new FutureTask<>(new SumTask());

        Thread thread = new Thread(futureTask);
        thread.start();*/


        FutureTask<Long> futureTask = new FutureTask<>(new SumTask());

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(futureTask);

        System.out.println(futureTask.get());

        executorService.shutdown();



    }




}

class SumTask implements Callable<Long> {

    @Override
    public Long call() throws Exception {
        long sum = 0;

        for(int i = 0; i < 100; i++) {
            sum += i;
        }

        Thread.sleep(9000);
        return sum;
    }
}