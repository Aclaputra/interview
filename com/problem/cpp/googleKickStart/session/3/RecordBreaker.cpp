#include <bits/stdc++.h>

using namespace std;

int main() 
{
  int t;
  cin >> t;
  int n;
  
  for (int i = 0; i < t; i++)
  {
    cin >> n;
    int arr[n];
    for (int j = 0; j < n; j++)
    {
      cin >> arr[j];
    }
    int ans = 0;
    int max = -1;
    if (n == 1) 
    {
      ans = 1;
    }
    else
    {
      for (int j = 0; j < n -1; j++) 
      {
        if (arr[j] > max)
        {
          max = arr[j];
          if (arr[j] > arr[j+1])
          {
            ans++;
          }
        }
      }
      if (arr[n - 1] > max)
      {
        ans++;
      }
    }
    cout << "Case #" << i + 1 << ": " << ans << endl;
  }
}
