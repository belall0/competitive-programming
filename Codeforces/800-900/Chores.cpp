/*
 * url: https://vjudge.net/solution/58988085/4XW09vXBsadD6IZtiZeW
 * date: 08 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

int main()
{
  int n{}, k{}, x{};
  cin >> n >> k >> x;

  vector<int> v(n);
  for (int i = 0; i < n; i++)
    cin >> v[i];

  int res{};
  for (int i = n - 1; i >= 0; i--)
  {
    if (k-- > 0)
    {
      res += x;
      continue;
    }

    res += v[i];
  }

  cout << res << "\n";

  return 0;
}