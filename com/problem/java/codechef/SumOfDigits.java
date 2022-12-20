import java.util.*;
import java.io.*;

public class Solution {
  static Scanner sc = new Scanner(System.in);
  static PrintStream out = System.out;
  public static void main(String[] args) {
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int a = sc.nextInt();
      int sum = 0;
      while(a > 0) {
        int temp = a % 10;
        sum += temp;
        a /= 10;
      }
      out.println(sum);
    }
  }
}
