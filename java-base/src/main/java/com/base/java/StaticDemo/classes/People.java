package com.base.java.StaticDemo.classes;

public class People {

    private String name = "初始值";

    private static int age = 21;




    public static void main(String[] args) {
        new People().peopleBeat("liSi");
        System.out.println("=========== 外部类 调用内部类属性 =============");
        System.out.println("new People().getHeart().name : " + new People().getHeart().name);

        System.out.println("new People().getHeart().name : " + new People().new Heart().name);
    }

    public Heart getHeart() {
        return new Heart();
    }


    // 外部类通过方法调用 内部类中的方法
    public void peopleBeat(String name) {
        this.name = name;
        new Heart().beat();

    }

    public String showName() {
        return name;
    }

    public static int showAge() {
        return age;
    }


    class Heart { // 心脏是人的内部类

        private String name = "初始值-Heart"; // 内部类，外部类同名的情况，内部类优先

        //private static int age = 21; // 非静态内部类 不能static修饰


        public void beat() {

            // 内部类默认访问内部类的属性
            System.out.println("内部类可以获取外部类的非静态属性：name = " + name + "【内部类默认访问内部类的属性】；想访问外部类：外部类.this.成员变量/外部类.this.成员方法" + People.this.name);
            System.out.println("内部类可以获取外部类的静态属性：age = " + age);

            System.out.println("内部类可以获取外部类的非静态方法：showName() = " + showName());
            System.out.println("内部类可以获取外部类的静态方法：showAge() = " + showAge());
        }

    }

}
