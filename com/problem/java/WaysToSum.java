package com.problem.java;
// Java program for the above approach
// import java.util.*;
 
class WaysToSum{
    // Function to find the total number of
    // ways to represent N as the sum of
    // integers over the range [1, K]
    static int NumberOfways(int N, int K)
    {
        // Initialize a list
        int[] dp = new int[N + 1]; // fkin size of 9 
        // Update dp[0] to 1
        dp[0] = 1;
        // Iterate over the range [1, K + 1]
        for(int row = 1; row < K + 1; row++)
        {
            // Iterate over the range [1, N + 1]
            for(int col = 1; col < N + 1; col++)
            {
                // If col is greater
                // than or equal to row
                if (col >= row)
                    // Update current
                    // dp[col] state
                    dp[col] = dp[col] + dp[col - row];
            }
        }
        // Return the total number of ways
        return(dp[N]);
    }
    
    // Driver code
    public static void main(String[] args)
    {
        // Given inputs
        int N = 8;
        int K = 2;
        System.out.println(NumberOfways(N, K));
    }
}
 