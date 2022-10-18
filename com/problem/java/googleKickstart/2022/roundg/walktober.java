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

    // put all scores to scoreBoard hashMap function
    for (int i = 1; i <= N; ++i) {
      ArrayList<Integer> score = new ArrayList<>();
      for (int j = 1; j <= M; ++j) {
        int S = sc.nextInt();
        score.add(S);
        scoreBoard.put(i, score);
      }
    }

    // get john scores
    for (int j = 0; j < M; ++j) {
      john.add(scoreBoard.get(P).get(j));
    }
    
    // find maximum scores each day
    for (int k = 0; k < M; ++k) { 
      int max = 0;
      for (int i : scoreBoard.keySet()) {
        if (scoreBoard.get(i).get(k) > max) {
          max = scoreBoard.get(i).get(k);
        }
      }
      maxScores.add(max);
    }

    // get the different number for john to compete
    for (int i = 0; i < M; ++i) {
      int diff = 0;
      if (john.get(i) < maxScores.get(i)) {
        diff = maxScores.get(i) - john.get(i);
      }
      if (diff > 0) ans += diff;
      System.out.println("diff : " + diff);
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

