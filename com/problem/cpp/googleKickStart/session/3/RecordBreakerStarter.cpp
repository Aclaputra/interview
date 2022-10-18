#include <bits/stdc++.h>

using namespace std;

int NumberOFRecordBreakingDays(int numberOfDays, vector<int> visitors)
{
  int recordBreakersCount = 0;
  int previousRecord = 0;

  for (int j = 0; j < visitors.size(); ++j)
  {
    bool greaterThanPreviousDays = j == 0 || visitors[j] > previousRecord;
    bool greaterThanNextDays = j == visitors.size() - 1 || visitors[j] > visitors[j + 1];

    if (greaterThanPreviousDays && greaterThanNextDays)
    {
      recordBreakersCount++;
      previousRecord = max(previousRecord, visitors[j]);
    }
  }
  return recordBreakersCount;
}

int main()
{
  int T;
  cin >> T;
  for (int tc = 1; tc <= T; ++tc)
  {
    int N;
    cin >> N;
    vector<int> V(N);
    for (int i = 0; i < N; ++i)
    {
      cin >> V[i];
    }
    cout << "Case #" << tc << ": " << NumberOFRecordBreakingDays(N,V) << endl;
  }
  return 0;
}
