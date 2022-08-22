package com.problem.java.test;

/**
 * TestDoubleForLoops
 */
public class TestDoubleForLoops {
    static void forLoops(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println("a = " + i);
            for(int j = 0; j < n; j++) {
                System.out.println("b = " + j);
            }
        }
    }

    public static void main(String[] args) {
        forLoops(11);
        forLoops(20);    
    }
}
