package com.problem.java.ctci.solutions.chapter1;

/** __________________________________________________________________________________________________________,solution
 * 1) Is Unique : Implement an algorithm to determine if a string has all unique characters. What if you-     |
 * cannot use additional data structures.                                                                     |
 *                                                                                                            |
 * You should first ask your interviewer if the String is an ASCII string or a Unicode string. Asking this-   |
 * question will show an eye for detail and solid foundation in computer science. We'll assume for simpli-    |
 * city the character set is ASCII. if the assumption is not valid, we would need to increase-                |
 * the storage size.                                                                                          |
 *                                                                                                            |
 * One Solution is to create an array of boolean values, where the flag at index i indicates whether chara-   |
 * cters in the alphabet. After all, you can't form a string of 280 unique characters out of a 128-character- |
 * alphabet.                                                                                                  |
 *                                                                                                            |
 * Note: It's also okay to assume 256 characters. this would be the case in extended ACII. You should clarify-|
 * your assumptions with your interviewer.                                                                    |
 * ___________________________________________________________________________________________________________|
 */
public class IsUnique {

    /** Method 1 ________________________________________________________
     * isUniqueChars check if the name already have the same char or not.
     * if it is unique return true if not return false.
     * 
     * Using linkedlist method.
     * 
     * @param str
     * @return
     */
    boolean isUniqueChars(String str) {
        /**___________________________________________________________________________________________________________,note
         * we can also immediately return false if the string length exceeds the number of unique characters in the-  |
         * alphabet. After all, you can't form a string of 280 unique characters out of a 128-character alphabet.     |
         * ___________________________________________________________________________________________________________|
         */
        if (str.length() > 128) return false;

        // make a boolean array with a size of 128-character
        boolean[] char_set = new boolean[128];
        /**_________________________________________________________,note
         * create a loop to iterate all of the str string by index. |
         * _________________________________________________________|
         */
        for (int i = 0; i < str.length(); i++) {
            /*________________________________________________________________,note
             * this str.charAt(i) works like str[i] in JavaScript.            |
             * it will get the current value by the index. like 0,1,2 a,b,c.  |
             * can be checked with -> System.out.println(str.charAt(i));      |
             * _______________________________________________________________|
             */
            int val = str.charAt(i);

            /**____________________________________________________________,note
             * if this array by index 0,1,2 a,b,c equals true or is exist- |
             * in the array then it will immidiately return false.         |
             * ____________________________________________________________|
             */
            if (char_set[val]) { // Already found this char in string.
                return false;
            }
            /**__________________________________________________________,note
             * set the array by index 0,1,2 a,b,c equals true after it-  |
             * looped for the first time.                                |
             * __________________________________________________________|
             */
            char_set[val] = true;
        }
        return true;
    }
    /** Result _______________________________________________________________________________________________________
     * The time complexity for this code is O(n), where n is the length of the string. The space complexity is O(1).
     * (You could also argue the time complexity is O(1), since the for loop will never iterate through more than 128-
     * characters). if you didn't want to assume the character set is fixed, you could express the complexity as O(c)
     * space and O(min(c, n)) or O(c) time, where c is the size of the character set.
     * _______________________________________________________________________________________________________________
     * _______________________________________________________________________________________________________________
     * We can reduce our space usage by a factor of eight by using a bit vector. We will assume , in the below code,
     * that the string only uses the lowercase letters a through z. this will allow us to use just a single int.
     * _______________________________________________________________________________________________________________
     */

    /** Method 2 _______________________________________________
     * reduced or optimized function for isUniqueChars function
     * @param str
     * @return
     */
    boolean reducedIsUniqueChars(String str) {
        int checker = 0;
        /**________________________________________________________,note
         * create a loop to iterate all of the str string by index.|
         * ________________________________________________________|
         */
        for (int i = 0; i < str.length(); i++) {
            /*_______________________________________________________________,note
             * this str.charAt(i) works like str[i] in JavaScript.           |
             * it will get the current value by the index. like 0,1,2 a,b,c. |
             * can be checked with -> System.out.println(str.charAt(i));     |
             * ______________________________________________________________|
             */
            int val = str.charAt(i);
            /**________________________________________,note
             * << left shift array operator            |
             * left shift x by n positions <=> x * 2n  |
             * ________________________________________|
             */
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            /** __________________________________________,note
             * |= it just like += in javascript.          |
             * it can written like |= this too in java.   |
             * << operator still a mystery.               |
             * ___________________________________________|
             */
            checker |= (1 << val);
        }
        return true;
    }
    /** Result ____________________________________________________________________________________________
     * If we can't use additional data structures, we can do the following :
     * 
     * 1. Compare every character of the string to every other character of the string. This will take-
     * O(n^2) time and O(1) space.
     * 
     * 2. If we allowed to modify the input string we could sort the string in O(n log(n)) time and then-
     * linearly check the string for neighboring characters that are identical. Careful, though: many-
     * sorting algorithms take up extra space.
     * ____________________________________________________________________________________________________
     */
}
