import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = sc.nextInt();
    
    for (int i = 1; i <= t; i++)
    {
      int N, p = 0, count = 0;
      N = sc.nextInt();
      int[] n = new int[N];

      for (int j = 0; j < N; j++)
      {
        n[j] = sc.nextInt();
      }

      for (int l = 0; l < N; l++)
      {
        boolean gpd = l == 0 || n[l] > p;
        boolean gfd = l == N - 1 || n[l] > n[l + 1];
        if (gpd && gfd)
        {
          count++;
        }
        p = Math.max(p, n[l]);
      }
      System.out.printf("Case #%d: %d\n", i, count);
    }
  }
}
