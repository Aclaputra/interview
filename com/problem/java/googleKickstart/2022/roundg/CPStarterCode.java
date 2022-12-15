import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
  static final PrintStream out = System.out;
  static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  static Scanner sc = new Scanner(System.in);

  HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

  static void lines() {
    ArrayList<Integer> list = new ArrayList<>();
    try {
      while(sc.hasNext()) 
        out.println(sc.next());
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  static void solve() {
    ArrayList<Integer> list = new ArrayList<>();

    lines();
    out.println(in.lines().collect(Collectors.toList()));
  }

  public static void main(String $[]) {
    int T = sc.nextInt();
    for (int t = 1; t <= T; ++t) 
      //out.println("Case #"+t+": "); 
      solve();
  }
}

