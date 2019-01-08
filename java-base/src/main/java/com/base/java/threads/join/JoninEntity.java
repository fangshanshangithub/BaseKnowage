package com.base.java.threads.join;

import java.io.Serializable;

public class JoninEntity implements Serializable {

    private Integer i;

    private String name;


    public JoninEntity(Integer i, String name) {
        this.i = i;
        this.name = name;
    }


    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "JoninEntity{" +
                "i=" + i +
                ", name='" + name + '\'' +
                '}';
    }
}
