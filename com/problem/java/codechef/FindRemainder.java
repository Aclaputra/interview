import java.util.*;
import java.io.*;

public class Solution {
  public static PrintStream out = System.out;
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    int t = sc.nextInt();
    while(t-->0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(a%b);
    }
  }
}
