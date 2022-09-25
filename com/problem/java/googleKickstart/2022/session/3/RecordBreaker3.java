import java.io.*;
import java.util.*;

public class Solution 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

    int t;
    t = sc.nextInt();
    int N;

    for (int i = 0; i < t; i++)
    {
      N = sc.nextInt();
      int[] n = new int[N];

      for (int j = 0; j < N; j++)
      {
        n[j] = sc.nextInt();
      }

      int ans = 0;
      int max = -1;
      
      if (N == 1)
      {
        ans = 1;
      }
      else
      {
        for (int j = 0; j < N -1; j++)
        {
          if (n[j] > max)
          {
            max = n[j];
            if (n[j] > n[j+1])
            {
              ans++;
            }
          }
        }
      }
      if (n[N-1] > max)
      {
        ans++;
      }
      System.out.printf("Case #%d: %d\n", i + 1, ans);
    }
  }
}
