package com.problem.java.ctci.solutions.chapter1;

/** _____________________________________________________________________________________________________,solution
 * 2) Check Permutation : Given two strings, write a method to decide if one is a-                       |
 * permutation of the others.                                                                            |
 *                                                                                                       |
 * Like in many questions, we should confirm some details with our interviewer. We should understand-    |
 * if the permutation comparison is case sensitive. That is: is God permutation of dog? Additionally,    |
 * we should ask if whitespace is significant. We will assume for this problem that the comparison is-   |
 * case sensitive and whitespace is significant. So, "god   " is different from "dog".                   |
 *                                                                                                       |
 * Observe first that strings of different lengths cannot be permutations of each other. There are two-  |
 * easy ways to solve this problemm, both of which use this optimization.                                |
 * ______________________________________________________________________________________________________|
 */
public class CheckPermutation {

    /** Method 1 ________
     * sort function
     * @param s
     * @return
     */
    String sort(String s) {
        /**____________________________________________________________________________________________________,note
         * s.toCharArray changing char from parameter s into an array. then store it in content array variable.|
         * java.util.Arrays.sort(content) get the library sort to sorting the content array variable.          |
         * after that change the array into String and then return it.                                         |
         * ____________________________________________________________________________________________________|
         */
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    boolean permutation(String s, String t) {
        /**________________________________________________________________________,note
         * if the paremeter s and t not the same length then it will return false. |
         * if it have the same length then it will return true.                    |
         * ________________________________________________________________________|
         */
        if (s.length() != t.length()) return false;
        return sort(s).equals(sort(t));
    }

    /** Method 2 _____________________________________
     * make your own permutation definition function.
     * @param s
     * @param t
     * @return
     */
    boolean definitionPermutation(String s, String t) {
        /**________________________________________________________________________,note
         * if the paremeter s and t not the same length then it will return false. |
         * if it have the same length then it will return true.                    |
         * ________________________________________________________________________|
         */
        if (s.length() != t.length()) return false;
        int[] letters = new int[128]; // assumption

        /**_____________________________________________________________________________________________________,note
         * s.toCharArray changing char from parameter s into an array. then store it in content array variable. |
         * java.util.Arrays.sort(content) get the library sort to sorting the content array variable.           |
         * after that change the array into String and then return it.                                          |
         * _____________________________________________________________________________________________________|
         */
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
}
