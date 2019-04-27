package com.base.java.sort;

public class Test {
    public static void main(String[] args) {
        int[] arys = {12,32,44,2,33,10,142};
        selectSort(arys);
    }

    private static void selectSort(int[] arys) {
        for(int i = 0; i < arys.length; i++) {

            int index = i;

            for(int j = i; j < arys.length; j++ ) {
                if(arys[j] < arys[index]) {
                    index = j;
                }
            }



        }
    }
}
