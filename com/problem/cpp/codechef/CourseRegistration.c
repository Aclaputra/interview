#include <stdio.h>

void solve(int n, int m, int k) {
    int courseLeft = m - k;
    if (n > courseLeft) printf("No\n");
    else if (n <= courseLeft) printf("Yes\n");
}

int main(void) {
    int k;
    scanf("%d", &k);
    for (int t=1; t <= k; t++) {
        int n, m, k;
        scanf("%d%d%d", &n, &m, &k);
        solve(n,m,k);
    }
    return 0;
}
