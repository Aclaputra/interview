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
      // N equals number of days
      N = sc.nextInt();
      // visitors per day
      int[] n = new int[N];
      // get all input visitor perday
      for (int j = 0; j < N; j++)
      {
        n[j] = sc.nextInt();
      }

      for (int l = 0; l < N; l++)
      {
        // greater than previous day
        boolean gpd = l == 0 || n[l] > p;
        // greater than after day
        boolean gfd = l == N - 1 || n[l] > n[l + 1];
        // if both true then increment the count (answer)
        if (gpd && gfd)
        {
          count++;
        }
        // find maximum number between p and visitor by day
        p = Math.max(p, n[l]);
      }
      System.out.printf("Case #%d: %d\n", i, count);
    }
  }
}
