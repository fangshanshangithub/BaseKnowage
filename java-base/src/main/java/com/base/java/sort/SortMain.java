package com.base.java.sort;

import java.util.Arrays;

/**
 *
 */
public class SortMain {
    public static void main(String[] args) {
        int[] values = {12,32,53,22,35,21,56,3,6,324};
        System.out.println("排序后" + Arrays.toString(values));

        //bubbleSort(values);
        //selectionSort(values);
        insertSort(values);


        System.out.println("排序后" + Arrays.toString(values));


    }

    /**
     * 插入排序
     * 最佳情况：T(n) = O(n)   最坏情况：T(n) = O(n^2)   平均情况：T(n) = O(n^2)
     * @param values
     */
    private static void insertSort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) { // 这里length-1 是因为第length-1 比较时，就用到了最后一个元素
            int temp = values[i + 1]; // 拿到第i+1的元素

            int j = i; // 排列好的数组下标
            while (j >= 0 && temp < values[j]) { // 排列好的元素 从后往前比较
                values[j+1] = values[j];  // 数组往后 移动
                j--; // 元素下表减1
            }

            values[j+1] = temp;

        }

    }

    /**
     * 选择排序
     * T(n) = O(n^2)  最差情况：T(n) = O(n^2)  平均情况：T(n) = O(n^2)
     * @param values
     */
    private static void selectionSort(int[] values) {
        for(int i = 0; i < values.length; i++) { // 第一次循环

            int minIndex = i; // 记录第二次循环得到的下标
            for(int j = i; j < values.length; j ++) {
                if(values[j] > values[minIndex]) {
                    minIndex = j;
                }
            }
            int temp;
            temp = values[i];
            values[i] = values[minIndex];
            values[minIndex] = temp;


        }

    }


    /**
     * 冒泡排序
     * 最佳情况：T(n) = O(n)   最差情况：T(n) = O(n^2)   平均情况：T(n) = O(n^2)
     */
    private static void bubbleSort(int[] values) {

        System.out.println("SortMain.sortOne: 冒泡排序");

        for(int i = 0; i < values.length; i++) { // 第一个循环 比较 n-1 次

            int tme;
            for(int j = 0 ; j < values.length - i -1; j++) { // 第二个循环表n-i-1次

                if(values[j] > values[j+1]) { // 相邻元素比较，交换位置
                    tme = values[j];
                    values[j] = values[j+1];
                    values[j+1] = tme;

                }

            }

        }
    }

}
