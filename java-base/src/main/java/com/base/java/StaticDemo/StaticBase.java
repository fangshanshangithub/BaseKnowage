package com.base.java.StaticDemo;

public class StaticBase {

    public static void main(String[] args) {
        //testStaticOne();
        testStaticTwo();



    }


    /**
     * 1.static方法只能调用static方法/static变量
     * 2.非static方法可以调用static方法/static变量
     */
    private static void testStaticOne() {
        Dog.run();
        System.out.println(new Dog().start());
    }

    /**
     * static 变量是公用一个内存空间，修改会影响所有共用这个变量的对象
     */
    private static void testStaticTwo() {
        new Dog().method_one();

        new Dog().updateCount();

        new Dog().method_one();
        new Dog().method_one();
        new Dog().method_one();
    }


}

class Dog {

    static String name = "petter"; // 没有修饰符默认 friendly, 当前类和同一包下可以调用

    private int count = 100;

    private static int static_count = 1000;

    public void method_one() {
        System.out.println("Dog.method_one: " + count + " -- " + static_count);
        System.out.println("Dog.method_one: " + this.count + " -- " + this.static_count);

    }

    public void updateCount() {
        count ++;
        static_count ++;

        this.count++;
        this.static_count++;

    }




    String start() {
        return "start()--" + name + say() + count + sing();
    }

    String sing() {
        System.out.println("Dog.sing---");
        return "sing()";
    }

    static String  run() {
        //System.out.println("count:" + count); //static方法不能调用 非static 变量
        //System.out.println("start():" + start()); //static方法不能调用 非static 方法

        System.out.println(name + say());

        return "run()";
    }

    static String say() {

        return "say()";
    }



}