import java.util.*;

class Solution {
  static Scanner sc = new Scanner(System.in);
  static void solve() {
    int N = sc.nextInt();
    int M = sc.nextInt();
    int P = sc.nextInt();
    int ans = 0;

    HashMap<Integer, ArrayList<Integer>> scoreBoard = new HashMap<>();
    ArrayList<Integer> maxScores = new ArrayList<>();
    ArrayList<Integer> john = new ArrayList<>();

    for (int i = 1; i <= N; ++i) {
      ArrayList<Integer> score = new ArrayList<>();
      for (int j = 1; j <= M; ++j) {
        int S = sc.nextInt();
        score.add(S);
        scoreBoard.put(i, score);
      }
    }

    for (int k = 0; k < M; ++k) { 
      int max = 0, diff = 0;

      for (int i : scoreBoard.keySet()) {
        if (scoreBoard.get(i).get(k) > max) max = scoreBoard.get(i).get(k);
      }
      maxScores.add(max);
      john.add(scoreBoard.get(P).get(k));

      if (john.get(k) < maxScores.get(k)) diff = maxScores.get(k) - john.get(k);
      System.out.println("diff " + diff);
      if (diff > 0) ans += diff;
    }

    System.out.println(ans);
  }

  public static void main(String[] args) {
    int T = sc.nextInt();
    for (int t = 1; t <= T; ++t) {
      System.out.print("Case #"+ t +": ");
      solve();
    }
    sc.close();
  }
}


