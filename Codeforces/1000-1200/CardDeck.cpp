/*
 * url: https://vjudge.net/solution/59283491/yx4YJ6TWHLopyt49VewZ
 * date: 17 - 03 - 2025
 * category: greedy
 * complexity: O(nlogn)
 */

#include <bits/stdc++.h>
using namespace std;

void solution()
{
  int n{};
  cin >> n;

  vector<int> v(n);
  for (int i = 0; i < n; i++)
    cin >> v[i];

  set<int, greater<int>> st;
  st.insert(v.begin(), v.end());

  vector<int> nums;
  for (int i = n - 1; i >= 0; i--)
  {
    if (v[i] == *st.begin())
    {
      nums.push_back(v[i]);
      for (int j = nums.size() - 1; j >= 0; j--)
      {
        st.erase(nums[j]);
        cout << nums[j] << " ";
      }

      nums.clear();
    }
    else
      nums.push_back(v[i]);
  }
  cout << "\n";
}

int main()
{
  ios::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);

  int t{1};
  cin >> t;
  while (t--)
    solution();

  return 0;
}