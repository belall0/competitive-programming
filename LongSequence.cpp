/*
 * url:
 * date: 09 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

void solution()
{
  int n{};
  cin >> n;
  vector<int> v(n);

  long long sum{};
  for (long long i = 0; i < n; i++)
  {
    cin >> v[i];
    sum += v[i];
  }

  long long x{};
  cin >> x;

  long long full_cycles{x / sum};
  long long remaining_sum{x % sum};

  if (remaining_sum == 0)
  {
    cout << full_cycles * n << "\n";
    return;
  }

  int k{};
  long long current_sum{};
  for (int i = 0; i < n; i++)
  {
    current_sum += v[i];

    if (current_sum >= remaining_sum)
    {
      k = i + 1;
      break;
    }
  }

  k += full_cycles * (long long)n;
  cout << k << "\n";
}

int main()
{

  solution();

  return 0;
}