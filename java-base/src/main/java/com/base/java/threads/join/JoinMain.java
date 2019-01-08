package com.base.java.threads.join;

/**
 * join 是主线程等待子线程执行完再继续执行主线程
 */
public class JoinMain {
    public static void main(String[] args) {
        System.out.println("JoinMain.main ---- start");
        JoninEntity entity = new JoninEntity(12, "A");
        System.out.println("JoinMain.main1111" + entity.toString());
        Thread th1 = new Thread(new JoinThread(entity));

        th1.start();
        System.out.println("JoinMain.main2222" + entity.toString());

       /* try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("JoinMain.main3333" + entity.toString());
        System.out.println("JoinMain.main ---- end");
    }
}
