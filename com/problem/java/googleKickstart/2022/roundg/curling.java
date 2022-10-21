import java.util.*;

public class Solution {
  static Scanner sc = new Scanner(System.in);
  static void solve() {
    int s_red, s_yellow = 0;
    int rh, rs;
    int[] x = new int[10];
    int[] y = new int[10];

    for (int i = 1; i <= N; i++) {
      s_red += (x[i] * x[i] + y[i] * y[i]) <= (rh + rs) * (rh + rs);
    }
  }
  public static void main(String[] args) {
    int T = sc.nextInt();
    for (int t=1; t<=T; ++t) {
      System.out.println("Case #"+t+": ");
      solve();
    }
  }
}

