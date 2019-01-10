package com.base.java.StaticDemo.classes;

public class People {

    private int age = 21;

    private static int heigh = 172;



    public static void main(String[] args) {
        People.Heart people = new People().new Heart();
        people.beat("zhangsan");
        new People().peopleBeat("liSi");

    }


    public void peopleBeat(String name) {
        new Heart().beat(name);

    }




    class Heart {
        public void beat(String name) {
            System.out.println(name + "###Heart.beat" + new People().age);
        }

    }

}
