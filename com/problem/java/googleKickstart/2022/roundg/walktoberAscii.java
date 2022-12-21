import java.io.PrintStream;
import java.util.Scanner;

class Solution {
  static PrintStream out = System.out;
  static Scanner sc = new Scanner(System.in);

  static void solve() {

    out.println("Hello world");
  }

  public static void main(String[] args) {
    int T = sc.nextInt();
    for (int t = 1; t <= T; ++t) {
      out.print("Case #"+t+": ");
      solve();
    }
    sc.close();
  }
}
