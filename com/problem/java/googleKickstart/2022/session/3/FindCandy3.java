import java.util.*;
import java.io.*;

public class Solution {
  static Scanner sc = new Scanner(System.in);
  static PrintStream out = System.out;
  static void solve(int numOfDays, int totalKids) {
    /**
     * constant time not using array or arraylist
     * 1. sum all of the bags of candy
     * 2. divide and find the remaining
     **/

    int total = 0;
    for (int i = 0; i < numOfDays; ++i) {
      total += sc.nextInt();
    }

    out.println(total % totalKids);
  }

  public static void main(String[] args) {
    int T = sc.nextInt();

    for (int t = 1; t <= T; ++t) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      out.print("Case #"+t+": ");
      solve(N, M);
    }
    sc.close();
  }
}
