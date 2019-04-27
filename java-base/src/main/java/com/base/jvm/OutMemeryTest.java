package com.base.jvm;

import java.util.ArrayList;
import java.util.List;

public class OutMemeryTest {

    List<DataObject> list = new ArrayList<DataObject>();

    public void testOm(){
        for (int i = 0; i < 100000; i++) {
            DataObject data = new DataObject("id&"+i, "des:"+i);
            list.add(data);
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        OutMemeryTest omt = new OutMemeryTest();
        for (int i = 0; i < 2; i++) {
            omt.testOm();
        }
        System.out.println("DOne!");
        try {
            Thread.sleep(100000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
