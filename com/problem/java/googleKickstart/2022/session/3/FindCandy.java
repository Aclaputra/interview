import java.util.Scanner;

public class Solution {
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int T;
    T = input.nextInt();

    for(int test_case = 1; test_case <= T; test_case++) {
      System.out.print("Case #" + test_case + ": ");
      solve();
    }
    input.close();
  }

  static void solve() {
    int N, M;
    N = input.nextInt();
    M = input.nextInt();
    int[] C = new int[N];

    for (int i = 0; i < N; i++) {
      C[i] = input.nextInt();
    }

    int totalCandies = 0;
    for(int i = 0; i < N; i++) {
      totalCandies += C[i];
    }

    int leftOutCandies = totalCandies % M;

    System.out.println(leftOutCandies);
  }
}
