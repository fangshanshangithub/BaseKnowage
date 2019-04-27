package com.base;

public class Test {



    public Test() {
        System.out.println("111111111111t");
    }


    public Test(String ss) {
                                 init();
        System.out.println("111111111111t" + ss);
    }


     public Test(int ss) {
         System.out.println("Test.Testssssssss");


     }
      public static void main(String[] args) {
        Test tt = new Test(11);



    }


    public void init() {
        System.out.println("Test.init ---------- ");
    }




























}
