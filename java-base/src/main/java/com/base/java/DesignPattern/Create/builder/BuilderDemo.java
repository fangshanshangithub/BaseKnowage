package com.base.java.DesignPattern.Create.builder;

/**
 * 建造者模式 -- 主要是构造初始化赋值的时候用到
 */
public class BuilderDemo {

    public static void main(String[] args) {
        String a  = new Student.StudentBuilder().setAge(13).setName("LiHua").build().toString();
        System.out.println("BuilderDemo.main ---  " + a);

    }

}

class Student {
    private String name;

    private int age;

    // 构造方法 赋值， 传递的是建造者类
    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }


    static class StudentBuilder {
        private String name;

        private int age;


        public StudentBuilder setName(String name) {
            this.name  = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age  = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

