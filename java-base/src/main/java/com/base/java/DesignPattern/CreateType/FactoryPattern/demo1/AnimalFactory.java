package com.base.java.DesignPattern.CreateType.FactoryPattern.demo1;

public class AnimalFactory {

    public static Animal getAnimal(String type) {
        if("Bird".equals(type)) {
            return new Bird();
        }
        else if ("Rabbit".equals(type)) {
            return new Rabbit();
        }
        return null;
    }
}
