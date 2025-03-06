/*
 * url: https://vjudge.net/solution/58908578/NXD3NIWkEEMIkWq0hLLb
 * date: 05 - 03 - 2025
 * category: sorting & two pointers
 * complexity: O(nlogn)
 */

#include <bits/stdc++.h>
using namespace std;

int main()
{
  int n{}, m{};
  cin >> n >> m;

  vector<int> f(m);
  for (int i = 0; i < m; i++)
    cin >> f[i];

  sort(f.begin(), f.end());

  set<int> sm;
  int first = 0;
  int second = first + n - 1;
  while (second < m)
  {
    sm.insert(f[second] - f[first++]);
    second = first + n - 1;
  }

  cout << *sm.begin() << "\n";

  return 0;
}