import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution
{
  public static void main(String[] args)
  {
    solve();
  }

  public static int solve()
  {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    if (T > 10 || T < 1) {
      return -1;
    }

    int ngb;
    for (int t = 1; t <= T; t++)
    {
      HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
      ngb = scanner.nextInt();

      for (int i = 1; i <= ngb; i++)
      {
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(scanner.nextInt());
        pair.add(scanner.nextInt());
        map.put(i, pair);
      }
      
      int nc = scanner.nextInt();
      int cc = 0;
      int c;
      System.out.print("Case #" + t + ":");

      while(cc != nc)
      {
        ArrayList<Integer> y = new ArrayList<>();
        int src = 0;

        c = scanner.nextInt();

        for (int k : map.keySet())
        {
          if (c >= map.get(k).get(0) && (c <= map.get(k).get(1))) {
            src++;
          }
        }

        y.add(src);
        for (int i : y) System.out.print(" " + i);
        cc++;

      }
      System.out.println();
      String s = scanner.nextLine();
    }
    return 0;
  }
}
