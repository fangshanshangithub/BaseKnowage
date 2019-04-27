package com.base.java.threads.join;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Test1.main--- 1111");
        Thread th1 = new Thread(new Test1().getThread("th1"));
        Thread th2 = new Thread(new Test1().getThread("th2"));

        th1.start();
        th2.start();

        th1.setPriority(1);

        //th1.join(2000);
        //th2.join(2000);

        //th3.join(2000);
        System.out.println("Test1.main--- 33333");

    }



    public RunableTest1 getThread(String name) {
        return new RunableTest1(name);
    }




    class RunableTest1 implements Runnable {

        private String name;

        public RunableTest1(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            if("th2".equals(name)) {
                try {
                    //System.out.println("th2 开始睡觉");
                    Thread.sleep(10000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for(int i = 0; i < 20; i++) {
                System.out.println("RunableTest1.run " + Thread.currentThread().getName());
            }


        }
    }
}
