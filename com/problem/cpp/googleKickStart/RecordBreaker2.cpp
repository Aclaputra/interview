#include <bits/stdc++.h>
using namespace std;

int main()
{
  int t, n;
  cin >> t;

  for (int i = 1; i <= t; i++)
  {
    cin >> n;
    int arr[n], ans = 0, p = 0;

    for (int j = 0; j < n; j++)
    {
      cin >> arr[j];
    }

    for (int j = 0; j < n; j++)
    {
      bool gpd = j == 0 || arr[j] > p;
      bool gnd = j == n - 1 || arr[j] > arr[j + 1];
      
      if (gpd && gnd)
      {
        ans++;
      }
        p = max(p, arr[j]);
    }

    printf("Case #%d: %d\n",i,ans);
  }
}
