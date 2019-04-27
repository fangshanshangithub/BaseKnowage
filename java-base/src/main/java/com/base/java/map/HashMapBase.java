package com.base.java.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapBase {

    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("1", "aaaaaaaa");
        map.put(null, "aaaaaaaa");
        map.put("2", null);

        System.out.println("HashMapBase.main -- 1"  + map.get(null));

        map.put(null, null);

        System.out.println("HashMapBase.main -- 2" + map.get(null));


        List list = new ArrayList();

        list.add(null);

    }
}
