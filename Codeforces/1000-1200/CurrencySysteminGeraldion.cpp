/*
 * url: https://vjudge.net/solution/58907615/8OEysuj83mhvEycTRihD
 * date: 05 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

int main()
{
  int n{};
  cin >> n;

  vector<int> v(n);
  for (int i = 0; i < n; i++)
    cin >> v[i];

  bool is_one_present = find(v.begin(), v.end(), 1) != v.end();
  if (is_one_present)
    cout << -1 << endl;
  else
    cout << 1 << endl;

  return 0;
}