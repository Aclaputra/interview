package com.problem.java.cdci.solutions.chapter1;

public class Main {
    /** Solutions to Arrays and Strings =================================
     * 
     * isUniqueChars check if the name already have the same char or not.
     * if it is unique return true if not return false.
     * 
     * Using linkedlist method.
     * 
     * @param str
     * @return
     */
    static boolean isUniqueChars(String str) {
        /**
         * we can also immediately return false if the string length exceeds the number of unique characters in the-
         * alphabet. After all, you can't form a string of 280 unique characters out of a 128-character alphabet.
         */
        if (str.length() > 128) return false;

        // make a boolean array with a size of 128-character
        boolean[] char_set = new boolean[128];
        /**
         * create a loop to iterate all of the str string by index.
         */
        for (int i = 0; i < str.length(); i++) {
            /*
             * this str.charAt(i) works like str[i] in JavaScript. 
             * it will get the current value by the index. like 0,1,2 a,b,c.
             * can be checked with -> System.out.println(str.charAt(i));
             */
            int val = str.charAt(i);

            /**
             * if this array by index 0,1,2 a,b,c equals true or is exist-
             * in the array then it will immidiately return false.
             */
            if (char_set[val]) { // Already found this char in string.
                return false;
            }
            /**
             * set the array by index 0,1,2 a,b,c equals true after it-
             * looped for the first time.
             */
            char_set[val] = true;
        }
        return true;
    }
    /**
     * reduced or optimized function for isUniqueChars function
     * @param str
     * @return
     */
    static boolean reducedIsUniqueChars(String str) {
        int checker = 0;
        /**
         * create a loop to iterate all of the str string by index.
         */
        for (int i = 0; i < str.length(); i++) {
            /*
             * this str.charAt(i) works like str[i] in JavaScript. 
             * it will get the current value by the index. like 0,1,2 a,b,c.
             * can be checked with -> System.out.println(str.charAt(i));
             */
            int val = str.charAt(i);
            /**
             * << operator still a mystery.
             */
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            /**
             * |= it just like += in javascript.
             * it can written like |= this too in java.
             * << operator still a mystery.
             */
            checker |= (1 << val);
        }
        return true;
    }

    

    public static void main(String[] args) {
        System.out.println(isUniqueChars("abcdefg"));
        System.out.println(reducedIsUniqueChars("abcdefg"));
    }
}