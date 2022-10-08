import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(), ngb;
    for (int t = 1; t <= T; ++t) {
      HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
      ngb = sc.nextInt();

      for (int i = 1; i <= ngb; ++i) {
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(sc.nextInt());
        pair.add(sc.nextInt());
        map.put(i, pair);
      }
      
      int nc = sc.nextInt(),cc = 0 ,c;
      System.out.print("Case #" + t + ":");

      while(cc != nc) {
        ArrayList<Integer> y = new ArrayList<>();
        int src = 0; 
        c = sc.nextInt();

        for (int k : map.keySet()) if (c >= map.get(k).get(0) && (c <= map.get(k).get(1))) src++;
        y.add(src);
        for (int i : y) System.out.print(" " + i);
        cc++;
      }
      System.out.println();
    }
  }
}

