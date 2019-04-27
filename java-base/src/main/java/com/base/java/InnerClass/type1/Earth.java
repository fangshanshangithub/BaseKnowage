package com.base.java.InnerClass.type1;

public class Earth {

    private String sky;

    private static String water;


    private class People{

        private String name;

        private Integer age;


        public People() {
            this.name = "fangss";
            this.age = 11;

        }

    }

    public People getPeople() {
        return new People();
    }


    public static void main(String[] args) {
        //内部类 的声明方式 2中方式
        People people = new Earth().getPeople();
        People people1 = new Earth().new People();

        System.out.println("==:" + people.age);
        System.out.println("--" + people1.name);

    }



}
