import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
  // starter code
  static final PrintStream out = System.out;
  static Scanner sc = new Scanner(System.in);
  static int A = 1005;
  static int a[][] = new int[A][40];
  
  // function solve
  static void solve() {
    int M = sc.nextInt();
    int N = sc.nextInt();
    int id = sc.nextInt();
    id--;

    // get the rest of input to 2d array
    for (int i = 0; i < M; ++i) {
      for (int j = 0; j < N; ++j) {
        a[i][j] = sc.nextInt();
      }
    }

    // print the 2d array
    /*
    for (int i = 0; i < a.length - 1; ++i) {
      for (int j = 0; j < a[i].length; ++j) {
        //System.out.println("i : "+i+" j : "+j);
        System.out.println(a[i][j]);
      }
    }
    */

    int ans = 0;
    for (int i = 0; i < N; ++i) {
      int maxi = 0;
      for (int j = 0; j < M; ++j) {
        maxi = Math.max(maxi, a[j][i]);
      }
      ans += maxi - a[id][i];
    }

    System.out.println(ans);
  }

  public static void main(String[] args) {
    int T = sc.nextInt();
    for (int t = 1; t <= T; ++t) {
      out.print("Case #"+t+": ");
      solve();
    }
  }
}
