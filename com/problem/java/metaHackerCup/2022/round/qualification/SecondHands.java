import java.util.*;
import java.io.*;

public class Solution {
  static Scanner sc = new Scanner(System.in);
  static PrintStream out = System.out;
  static void solve(int N, int K) {
    /**
     * 1. get all the products put in an array
     * 2. loop through array, check the K exist more than once or not (permutation)
     * 3. create if condition permutation "YES" if not "NO"
     *
     **/

    out.println();
  }

  public static void main(String[] args) {
    int T = sc.nextInt();
    for (int t = 1; t <= T; ++t) {
      int N = sc.nextInt();
      int K = sc.nextInt();
      out.print("Case #"+t+": ");
      solve(N, K);
    }
  }
}
