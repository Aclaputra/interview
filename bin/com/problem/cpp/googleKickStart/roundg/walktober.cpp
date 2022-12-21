#include <bits/stdc++.h>
#include <vector>

using namespace std;

int main() {
  int T;
  cin >> T;

  for (int t = 1; t <= T; t++) {
    int N, M, P, ans = 0;
    cin >> N;
    cin >> M;
    cin >> P;

    vector<vector<int>> scoreBoard;
    for (int i = 0; i <= N; i++) {
      vector<int> score;
      for (int j = 0; i <= M; i++) {
        int S;
        cin >> S;
        score.push_back(S);
      }
      scoreBoard.push_back(score);
    }

    for (int i = 0; i <= scoreBoard.size(); i++) {
      cout << scoreBoard[i][0] << endl;
    }
    /*
    cout << score.size() << endl;
    for (int i = 0; i <= score.size(); i++) {
      cout << score[i] << endl;
    }
    */
  }
}
