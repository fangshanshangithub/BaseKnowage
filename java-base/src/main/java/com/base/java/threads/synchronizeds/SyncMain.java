package com.base.java.threads.synchronizeds;

public class SyncMain {


    public static void main(String[] args) {
        int i = test();
        System.out.println("SyncMain.main " + i);
    }

    private static int test() {
        int i = 0;
        try {
            i++;
            return i;
        }catch (Exception e) {

        }
        finally {
             ++i;
            System.out.println("SyncMain.test" + i);
        }
        return i;
    }

}
