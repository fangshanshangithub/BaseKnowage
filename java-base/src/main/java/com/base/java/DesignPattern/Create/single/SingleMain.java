package com.base.java.DesignPattern.Create.single;

public class SingleMain {
}


/**
 * 饿汉式  线程安全
 * 饿汉式单例，在类加载式自行实例化对象。
 * 优点 在于多线程环境下不会出现线程安全问题，因为类只加载一次。
 * 缺点 在于，系统加载时消耗额外资源，如果该实例没有使用的情况会造成资源浪费。
 */
class Single_Two {

    private static Single_Two singleTwo = new Single_Two();

    public Single_Two (){

    }

    public Single_Two getSingleTwo() {
        if(null == singleTwo) {
            singleTwo = new Single_Two();
        }
        return singleTwo;
    }

}


/**
 * 懒汉式
 */
class Single_One {

    private static Single_One  singleOne;

    private static  volatile  Single_One  singleOneFinal;

    public Single_One() {

    }

    /*
      线程不安全的模式
      if(singleTon == null)
      并且java中new是不具有原子性的(涉及到赋值问题)，所以，
      在并发环境下，是可能执行了多次的new操作，造成实例非唯一性。
      "先判断"
     */
    public static Single_One getSingleOne() {
        if(singleOne == null) { // 1
            singleOne = new Single_One(); // 2
        }
        return singleOne;
    }

    /**
     * 线程安全 -- 但是性能不好
     * @return
     */
    public synchronized static Single_One getSingleOneSafe() {
        if(singleOne == null) { // 1
            singleOne = new Single_One(); // 2
        }
        return singleOne;
    }

    /**
     * 线程安全 最好的
     * @return
     */
    public static Single_One getSingleOneSafeFinal() {
        if(null == singleOneFinal) {
            synchronized (Single_One.class) { // 锁对象
                if(singleOneFinal == null) {
                    singleOneFinal = new Single_One();
                }
            }
        }
        return singleOneFinal;
    }
}