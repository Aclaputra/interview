package com.problem.java.cdci.solutions.chapter1;

/** Solutions to Arrays and Strings =================================
 * CHAPTER 1.
 */
public class Main {
    /** 
     * 1. Is Unique : Implement an algorithm to determine if a string has all unique characters. What if you-
     * cannot use additional data structures.
     * 
     * You should first ask your interviewer if the String is an ASCII string or a Unicode string. Asking this-
     * question will show an eye for detail and solid foundation in computer science. We'll assume for simpli-
     * city the character set is ASCII. if the assumption is not valid, we would need to increase-
     * the storage size.
     * 
     * One Solution is to create an array of boolean values, where the flag at index i indicates whether chara-
     * cters in the alphabet. After all, you can't form a string
     */

    /** Method 1 --------------------------------------------------------
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
    /** Method 2 --------------------------------------------------------
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

    /** 
     * 2. Check Permutation : Given two strings, write a method to decide if one is a-
     * permutation of the others.
     */

    /** Method 1 --------------------------------------------------------
     * sort function
     * @param s
     * @return
     */
    static String sort(String s) {
        /**
         * s.toCharArray changing char from parameter s into an array. then store it in content array variable.
         * java.util.Arrays.sort(content) get the library sort to sorting the content array variable.
         * after that change the array into String and then return it.
         */
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    static boolean permutation(String s, String t) {
        /**
         * 
         */
        if (s.length() != t.length()) return false;
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args) {
        System.out.println(isUniqueChars("abcdefg"));
        System.out.println(reducedIsUniqueChars("abcdefg"));
    }
}