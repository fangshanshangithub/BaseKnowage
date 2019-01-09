package com.base.java.DesignPattern.CreateType.FactoryPattern.demo1;

public class MainRun {

    public static void main(String[] args) {
        String info = AnimalFactory.getAnimal("Bird").findhuman();
        System.out.println("MainRun.main:" + info);
    }
}
