import java.util.Scanner;

/** Starter Code for Sherlock and Watson Gym Secrets.* */
public class Solution {
  /** Complete the countPairs function */
  static int countPairs(int a, int b, long n, int k) {
    int pairs = 0;
    // TODO: Add logic to count the number of pairs modulo 10^9+7 (1000000007)
    return pairs;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Read the number of test cases.
    int testCaseCount = scanner.nextInt();
    for (int caseIndex = 1; caseIndex <= testCaseCount; caseIndex++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      long n = scanner.nextLong();
      int k = scanner.nextInt();

      int pairs = countPairs(a, b, n, k);
      System.out.println("Case #" + caseIndex + ": " + pairs);
    }
  }
}
