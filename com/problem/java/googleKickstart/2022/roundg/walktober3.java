import java.io.PrintStream;
import java.util.*;
import java.util.stream.IntStream;

public class Solution {
  static final PrintStream out = System.out;
  static Scanner sc = new Scanner(System.in);
  static void solve() {
    int N = sc.nextInt();
    int M = sc.nextInt();
    int P = sc.nextInt();
    int ans = 0;

    HashMap<Integer, ArrayList<Integer>> scoreBoard = new HashMap<>();
    for (int i = 1; i <= N; ++i) 
    {
      ArrayList<Integer> score = new ArrayList<>();
      for (int j = 1; j <= M; ++j) 
      {
        int S = sc.nextInt();
        score.add(S);
      }
      scoreBoard.put(i, score);
    }

    ArrayList<Integer> john = new ArrayList<>();
    for (int i = 0; i < N; i++) 
    {
      john.add(scoreBoard.get(P).get(i));


    }

    out.println(ans);
  }

  public static void main(String[] args) {
    int T = sc.nextInt();

    for (int t = 1; t <= T; ++t) {
      //out.println("Case #"+t+": ");
      solve();
    }

  }
}
