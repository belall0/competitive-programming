/*
 * url: https://vjudge.net/solution/58803317/aXU0nK13uTERSMo8FSvN
 * date: 02 - 03 - 2025
 * category: binary search
 * complexity: O(n * logn)
 */

#include <bits/stdc++.h>
using namespace std;

// Calculates the maximum number of consecutive books that can be read starting from a given index within the time constraint
int getMaxConsecutiveBooks(int availableTime, int startIndex, const vector<int> &prefixSum)
{
  // calculate the total available time for reading books starting from the given index
  int total_available_time = prefixSum[startIndex - 1] + availableTime;

  // find the position where the total available time is exceeded
  auto it = upper_bound(prefixSum.begin() + startIndex, prefixSum.end(), total_available_time);

  // get the index of the book that exceeds the total available time
  int exceeding_indx = it - prefixSum.begin();

  // calculate the number of books that can be read within the time constraint starting from the given index
  int result_index = exceeding_indx - startIndex;
  return result_index;
}

void solution()
{
  int n{}, t{};
  cin >> n >> t;

  vector<int> cum(n + 1, 0);
  for (int i = 1; i <= n; i++)
  {
    int num{};
    cin >> num;
    cum[i] = cum[i - 1] + num;
  }

  int res = -1;
  for (int i = 1; i <= n; i++)
    res = max(res, getMaxConsecutiveBooks(t, i, cum));

  cout << res << "\n";
}

int main()
{
  solution();

  return 0;
}