package com.base.java.runTime;

import java.util.HashMap;
import java.util.Map;

public class RuntimeMain {

    public static void main(String[] args) {

        HashMap map = new HashMap<String, String>(12, 1);
        map.put("a","aaaaaa");

        map.get("a");

        int i = 0;
        while (true) {
            System.out.println("RuntimeMain.main" + i);
            if(i == 20) {
                System.exit(0);
            }
            i++;

        }

    }


}
