package com.problem.java.hackerrank;
// package io.github.jiangdequan;
// import java.io.*;

/**
 * Time Complexity: O(100)
 * Auxiliary Space: O(1)
 */
public class OptimizedFizzBuzz {
    public static void main(String[] args) {
        String s = "";
        int c3 = 0, c5 = 0;
        for (int i = 1; i <= 100; i++) {
            c3++;
            c5++;
            if (c3 == 3) {
                s += "fizz";
                c3 = 0;
            }
            if (c5 == 5) {
                s += "buzz";
                c5 = 0;
            }
            if (s.length() == 0)
                System.out.println(i);
            else
                System.out.println(s);
            s = "";
        }
    }
}