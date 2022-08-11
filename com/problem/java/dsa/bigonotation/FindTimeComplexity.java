package com.problem.java.dsa.bigonotation;

public class FindTimeComplexity {

    /**
     * Explanation : 
        First Loop runs N Time whereas Second Loop runs M Time. The calculation takes O(1)times.
        So by adding them the time complexity will be O ( N + M + 1) = O( N + M).

        Time Complexity : O( N + M)
     * @param args
     */
    public static void main(String[] args) {
        //declare variable
        int a = 0, b = 0;
        //declare size 
        int N = 5, M = 5;
        // This loop runs for N time
        for (int i = 0; i < N; i++) {
            a = a + 5;
        }
        // This loop runs for M time
        for (int i = 0; i < M; i++) {
            b = b + 10;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}