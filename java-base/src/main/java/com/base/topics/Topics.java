package com.base.topics;

public class Topics {

    public static void main(String[] args){


        reverses("123456");



   /*     System.out.println("Topics.main  " + factorial(3));

        int c = 34454;
        long a = 34454L;

        short b = 3232;

        String s = strAdd("1321","99999");
        System.out.println(s);

       *//* int i = 14>>2;
        System.out.println("Topics.main i " + i);
*//*

        String str = "ADBDDDDTTTTFGSETAA";
        System.out.println("Topics.main \n" + subRepetition(str));*/


    }

    private static void reverses(String str) {
        StringBuffer sbf = new StringBuffer();
        sbf.append(str);
        String s = sbf.reverse().toString();

        System.out.println(s);

    }


    public static int factorial(int n) {
         if(n == 1) {
             return 1;
         }
         else {
             return n * (n-1);
         }
    }



    /**
     * 字符串去重显示
     * 例如：AAABBBCDSWR  --> ABCDSWR
     * @param charStr
     * @return
     */
    public static String subRepetition(String charStr) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] chars = charStr.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            char chr = chars[i];
            boolean flag = false; // 判断当前元素的值是否被遍历过
            for(int j = 0; j < i; j++) {
                if(chr == chars[j]) // 是遍历过的元素
                    flag = true;
            }
            if(!flag) {
                stringBuffer.append(chr);
            }
        }

        return stringBuffer.toString();
    }

    /**
     * 字符串去重显示
     * 例如：AAABBBCDSWR  --> ABCDSWR
     * @param charStr
     * @return
     */
    public static String subRepetitionSet(String charStr) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] chars = charStr.toCharArray();

        /*List<Character> list = Arrays.asList(chars);
        list.a*/


        for(int i = 0; i < chars.length; i++) {
            char chr = chars[i];
            boolean flag = false; // 判断当前元素的值是否被遍历过
            for(int j = 0; j < i; j++) {
                if(chr == chars[j]) // 是遍历过的元素
                    flag = true;
            }
            if(!flag) {
                stringBuffer.append(chr);
            }
        }

        return stringBuffer.toString();
    }


    /**
     * 数字字符串的相加[不用Integer.Valueof()方法]
     * 例："1243243" + "2343214"
     * @param str1
     * @param str2
     * @return
     */
    public static String strAdd(String str1, String str2) {
        StringBuffer stringBuffer = new StringBuffer();


        int lenA = str1.length();
        int lenB = str2.length();

        if(lenA > lenB) {
            str2 = leftPad(str2, lenA, lenB, "0");
        } else {
            str1 = leftPad(str1, lenB, lenA,"0");
        }

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();


        int heigh = 0;
        int low = 0;
        for(int i = char1.length - 1; i>=0; i--) {
            int t = Integer.valueOf(char1[i]+"") + Integer.valueOf(char2[i]+"") + heigh;

            heigh = t / 10;
            low = t - heigh*10;

            stringBuffer.append(low);

        }
        if(heigh != 0) {
            stringBuffer.append(heigh);
        }
        return stringBuffer.reverse().toString();
    }

    /**
     *
     * @param str2 需要添加0的字符串
     * @param maxLen 改造之后的长度
     * @param len 当前的长度
     * @param s
     * @return
     */
    private static String leftPad(String str2, int maxLen, int len, String s) {
        String str = "";
        for(int i = 0; i < maxLen-len; i++) {
            str += s;
        }
        return str+str2;

    }












}
