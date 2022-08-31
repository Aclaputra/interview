import java.io.*;
import java.util.*;

public class Solution {

  private static int[] endPosition(int N, int R, int C, int Sr, int Sc, String instructions) {
    // TODO: implement this method to return the row and column where the robot
    // finishes.
    return new int[] {0, 0};
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int t = 1; t <= T; ++t) {
      int N = in.nextInt();
      int R = in.nextInt();
      int C = in.nextInt();
      int Sr = in.nextInt();
      int Sc = in.nextInt();
      String instructions = in.next();
      int[] ans = endPosition(N, R, C, Sr, Sc, instructions);
      System.out.println("Case #" + t + ": " + ans[0] + " " + ans[1]);
    }
  }
}
