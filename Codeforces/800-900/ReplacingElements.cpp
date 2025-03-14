/*
 * url: https://vjudge.net/solution/58988421/s0B9aNwIqT9AB9WwxXnL
 * date: 08 - 03 - 2025
 * category: implementation
 * complexity: O(n*log(n))
 */

#include <bits/stdc++.h>
using namespace std;

void solution()
{
  int t{};
  cin >> t;

  while (t--)
  {
    int n{}, d{};
    cin >> n >> d;

    vector<int> v(n);
    for (int i = 0; i < n; i++)
      cin >> v[i];

    sort(v.begin(), v.end());

    if (v[0] + v[1] <= d)
    {
      cout << "YES\n";
      continue;
    }

    bool isValid{true};
    for (int i = 0; i < n; i++)
    {
      if (v[i] > d)
      {
        isValid = false;
        break;
      }
    }

    cout << (isValid ? "YES" : "NO") << "\n";
  }
}

int main()
{

  solution();

  return 0;
}