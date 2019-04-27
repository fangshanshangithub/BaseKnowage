package com.base.feibo;

import java.util.HashSet;

/**
 * 斐波那契数列
 */
public class FeiBoDemo {


    public static void main(String[] args) {
        System.out.println(sameString("211143243332214321424", "24211134433322149999"));

    }

    public static int feiBo_1(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        int a = 1,b = 1, c = 0;
        for(int i = 0; i < n-2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;

    }

    public static int feibo_2(int n) {
        if(n == 1) {
            return 1;
        }
        else if(n == 2) {
            return 2;
        }
        else {
            return feibo_2(n -1) + feibo_2(n - 2);
        }
    }

    /**
     * 阶乘 递归
     * @param n
     * @return
     */
    public static int factorial(int n) {
       if(n <= 1) {
           return 1;
       }
       else {
           return n * factorial(n -1);
       }

    }

    /**
     * 累加 1+2+3+4+ .......
     * @param n
     * @return
     */
    public static long adds(int n) {
        if(n <= 1) {
            return 1;
        }
        else {
            return n + adds(n-1);
        }
    }

    /**
     *  打印 出2个字符串相同的字符
     * @param str
     * @param param
     * @return
     */
    public static HashSet<String> sameString(String str, String param)  {
        HashSet<String> mapset = new HashSet<>();
        int length = str.length();
        for(int i = 0; i < length; i++) {

            for(int j = i+1; j < length; j++) {
                String temp = str.substring(i,j);
                if(param.contains(temp)) {
                    mapset.add(temp);
                }

            }
        }
        System.out.println(mapset.toArray().toString());

        for(String element : mapset) {
            System.out.println(element);
        }

        return mapset;
    }


    /**
     * 最长的相同的 字符串输出
     * @param str
     * @param param
     * @return
     */
    public static String sameStrMaxLength(String str, String param) {

        String temp = "";

        int length = str.length();
        for(int i = 0; i < length; i++) {

            int tLength = temp.length();
            for(int j = i+1; j < length; j++) {
                String pStr = str.substring(i,j);
                if(param.contains(pStr) && tLength < j-i) {
                    temp = pStr;
                }
            }
        }

        return temp;

    }


}
