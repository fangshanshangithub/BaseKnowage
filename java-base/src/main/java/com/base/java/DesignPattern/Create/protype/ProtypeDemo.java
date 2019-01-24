package com.base.java.DesignPattern.Create.protype;

public class ProtypeDemo{


    public static void main(String[] args) {
        Student student = new Student("FangSS", 100);
        //Student stn = (Student) student.clone();

    }

}

class Student implements Cloneable {

    private String name;

    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}