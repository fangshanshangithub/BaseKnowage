package com.base.java.map.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bean2MapKey {

    public static void main(String[] args) {

        //Test1();

        List<Persion> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            Persion persion = new Persion();
            persion.setId(i);
            persion.setMark(i + i + "");

            int num = (int) (Math.random() * 3);
            String name = "";
            for(int j = 0; j < num; j++) {
                name += "a";
            }

            persion.setName(name);

            list.add(persion);

        }
        System.out.println(list.toString());

        Collections.sort(list);
        System.out.println("Bean2MapKey.main" + list.toString());



    }

    private static void Test1() {
        List<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(2);
        list.add(3454);
        list.add(132);
        list.add(45);

        //Collections.sort(list);
        System.out.println("Bean2MapKey.main " + list.toString());
        /*for(Integer ee : list) {
            System.out.println("11 -- " + ee);
        }*/
    }


    public static class Persion implements Comparable<Persion>{
        private int id;

        private String name;

        private String mark;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMark() {
            return mark;
        }

        public void setMark(String mark) {
            this.mark = mark;
        }

        @Override
        public int compareTo(Persion o) {
            return this.name.length() - o.getName().length();
        }

        @Override
        public String toString() {
            return "Persion{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", mark='" + mark + '\'' +
                    '}' + "\n";
        }
    }

}
