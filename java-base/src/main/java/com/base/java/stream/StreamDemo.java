package com.base.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class  StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Stream<String> stream = list.stream();


    }
}
