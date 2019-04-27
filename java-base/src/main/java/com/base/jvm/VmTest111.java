package com.base.jvm;

public class VmTest111 {

    public static void main(String[] args) {
        new VTestOne1111().running();
    }

}

class VTestOne1111 {

    private int i;

    public void running() {
        while(1 > 0) {
            new AAA();
        }

    }

}

class AAA {
    private  int i = 11;

    public void say() {
        System.out.println("AAA.say");
    }
}