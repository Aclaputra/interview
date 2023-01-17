#include <bits/stdc++.h>
using namespace std;

const int N = 1005;
int a[N][40];

int solve(int m, int n, int id) {
  id--;
  for (int i=0; i<m; i++) {
    for (int j=0; j<n; j++) {
      cin >> a[i][j];
    }
  }
  int ans = 0;
  for (int i=0; i<n; i++) {
    int maxi=0;
    for (int j=0; j<m; i++) {
      maxi = max(maxi, a[j][i]);
    }
    ans += maxi - a[id][i];
  }
  return ans;
}

int main() {
  int T;
  cin >> T;
  for (int t=1; t<=T; t++) {
    int m, n, id;
    cin >> n >> m >> id;
    printf("Case #%d: %d\n",t,solve(m,n,id));
  }
}
