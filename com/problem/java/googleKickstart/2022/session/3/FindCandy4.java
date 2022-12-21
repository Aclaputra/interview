import java.util.*;
import java.io.*;

public class Solution {
  static Scanner sc = new Scanner(System.in);
  static PrintStream out = System.out;
  static void solve(int N, int M) {
    /**
     * array method
     * 1. sum all of the candies from bags
     * 2. divide the total of candies, get the remaining (result)
     */
    int total = 0;
    for (int i = 0; i < N; ++i) {
      total += sc.nextInt();
    }

    out.pritln(total % M);
  }
  public static void main(String[] args) {
    int T = sc.nextInt();
    for (int t = 1; t <= T; ++T) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      out.print("Case #"+t+": ");
      solve(N, M);
    }
    sc.close();
  }
}
