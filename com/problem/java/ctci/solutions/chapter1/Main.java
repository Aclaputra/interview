package com.problem.java.ctci.solutions.chapter1;

/** Solutions to Arrays and Strings.
 * CHAPTER 1 
 **/
public class Main {

    public static void main(String[] args) {
        IsUnique iu = new IsUnique();
        CheckPermutation cp = new CheckPermutation();

        // problem 1 - Is Unique
        System.out.println(iu.isUniqueChars("abcdefg")); //true
        System.out.println(iu.reducedIsUniqueChars("abcdefg")); //true
        // problem 2 - Check Permutation
        System.out.println(cp.permutation("scorpio", "virgo")); //false
        System.out.println(cp.permutation("scorpio", "scorpio")); //true

        System.out.println(cp.definitionPermutation("scorpio", "virgo")); //false
        System.out.println(cp.definitionPermutation("scorpio", "scorpio")); //true
    }
}
