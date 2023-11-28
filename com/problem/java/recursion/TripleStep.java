import java.util.*;

// triple step / count ways
class TripleStep {

    // O(3^n)
    static int bruteForceRecursive(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        }

        return bruteForceRecursive(n-1) + bruteForceRecursive(n-2) + bruteForceRecursive(n-3);
    }

    static int memoization(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);

        return memoization(n, memo);
    }

    static int memoization(int n, int[] memo) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (memo[n] > -1) {
            return memo[n];
        } 

        memo[n] = memoization(n - 1, memo) + memoization(n - 2, memo) + memoization(n - 3, memo);
        return memo[n];
    }

    public static void main(String[] agrs) {
        int res = bruteForceRecursive(10);
        int memoRes = memoization(10);

        System.out.println(res);
        System.out.println(memoRes);
    }
}