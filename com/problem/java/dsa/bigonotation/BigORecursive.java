package com.problem.java.dsa.bigonotation;

public class BigORecursive {
    /**
     * used for power a number
     * @param n
     * @return
     */
    static int sum(int n) {
        if(n <= 0) {
            return 0;
        }
        // System.out.println(n);
        /**
         * will be repeated go up decresing by one until it got into 0
         * and it will be sum all the number by decreasing
         */
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(5));
    }
}