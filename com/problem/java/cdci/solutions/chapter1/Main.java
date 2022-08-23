package com.problem.java.cdci.solutions.chapter1;

/** Solutions to Arrays and Strings =================================
 * CHAPTER 1.
 */
public class Main {
    /** 
     * 1) Is Unique : Implement an algorithm to determine if a string has all unique characters. What if you-
     * cannot use additional data structures.
     * 
     * You should first ask your interviewer if the String is an ASCII string or a Unicode string. Asking this-
     * question will show an eye for detail and solid foundation in computer science. We'll assume for simpli-
     * city the character set is ASCII. if the assumption is not valid, we would need to increase-
     * the storage size.
     * 
     * One Solution is to create an array of boolean values, where the flag at index i indicates whether chara-
     * cters in the alphabet. After all, you can't form a string of 280 unique characters out of a 128-character-
     * alphabet.
     * 
     * Note: It's also okay to assume 256 characters. this would be the case in extended ACII. You should clarify-
     * your assumptions with your interviewer.
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
    /** Result --
     * The time complexity for this code is O(n), where n is the length of the string. The space complexity is O(1).
     * (You could also argue the time complexity is O(1), since the for loop will never iterate through more than 128-
     * characters). if you didn't want to assume the character set is fixed, you could express the complexity as O(c)
     * space and O(min(c, n)) or O(c) time, where c is the size of the character set.
     */
    
    /**
     * We can reduce our space usage by a factor of eight by using a bit vector. We will assume , in the below code,
     * that the string only uses the lowercase letters a through z. this will allow us to use just a single int.
     */

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
    /** Result --
     * If we can't use additional data structures, we can do the following :
     * 
     * 1. Compare every character of the string to every other character of the string. This will take-
     * O(n^2) time and O(1) space.
     * 
     * 2. If we allowed to modify the input string we could sort the string in O(n log(n)) time and then-
     * linearly check the string for neighboring characters that are identical. Careful, though: many-
     * sorting algorithms take up extra space.
     */

    /** 
     * 2) Check Permutation : Given two strings, write a method to decide if one is a-
     * permutation of the others.
     * 
     * Like in many questions, we should confirm some details with our interviewer. We should understand-
     * if the permutation comparison is case sensitive. That is: is God permutation of dog? Additionally,
     * we should ask if whitespace is significant. We will assume for this problem that the comparison is-
     * case sensitive and whitespace is significant. So, "god   " is different from "dog".
     * 
     * Observe first that strings of different lengths cannot be permutations of each other. There are two-
     * easy ways to solve this problemm, both of which use this optimization.
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
         * if the paremeter s and t not the same length then it will return false.
         * if it have the same length then it will return true.
         */
        if (s.length() != t.length()) return false;
        return sort(s).equals(sort(t));
    }

    /** Method 2 --------------------------------------------------------
     * make your own permutation definition function.
     * @param s
     * @param t
     * @return
     */
    static boolean definitionPermutation(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] letters = new int[128]; // assumption

        char[] s_array = s.toCharArray();
        // count number of each char in s.
        for(char c : s_array) letters[c]++;

        for(int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            letters[c]--;
            if (letters[c] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // problem 1 - Is Unique
        System.out.println(isUniqueChars("abcdefg"));
        System.out.println(reducedIsUniqueChars("abcdefg"));
        // problem 2 - Check Permutation
        System.out.println(permutation("scorpio", "virgo"));
        System.out.println(permutation("scorpio", "scorpio"));

        System.out.println(definitionPermutation("scorpio", "virgo"));
        System.out.println(definitionPermutation("scorpio", "scorpio"));
    }
}