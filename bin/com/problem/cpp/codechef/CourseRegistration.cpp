#include <iostream>
using namespace std;

void solve(int n, int m, int k) {
    int courseLeft = m - k;
    if (n > courseLeft) cout << "No" << endl;
    else if (n <= courseLeft) cout << "Yes" << endl;
    else cout << "Yes" << endl;
}

int main() {
    int k = (cin >> k, k);
    for (int i = 1; i <= k; i++) {
        int n, m, k = (cin >> n >> m >> k,n,m,k);   
        solve(n, m, k);
    }
}