#include<bits/stdc++.h>
using namespace std;

const int N = 1005;
int a[N][40];

void solve() {
  int m, n, id;
  cin >> m >> n >> id;
  id--; // id start from one, decrease it by 1

  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      cin >> a[i][j];
    }
  }
  int ans = 0;
  for (int i = 0; i < n; i++) {
    int maxi = 0;
    for (int j = 0; j < m; j++) {
      maxi = max(maxi, a[j][i]);
    }
    ans += maxi - a[id][i];
  }

  cout << ans << endl;
}

int main() {
  int t;
  cin >> t;
  for (int tt = 1; tt <= t; tt++) {
    cout << "Case #" << tt << ": ";
    solve();
  }
}
