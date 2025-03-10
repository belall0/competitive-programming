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
  long long n{};
  cin >> n;
  vector<long long> v(n);
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

  long long current_sum{};
  int k{};
  for (int i = 0; i < n; i++)
  {
    current_sum += v[i];
    if (current_sum >= remaining_sum)
    {
      k = i + 1;
      break;
    }
  }

  k += full_cycles * n;
  cout << k << "\n";

  // long long target{x % sum};
  // long long curr{};
  // long long ans{x / sum * n};

  // if (target == 0)
  // {
  //   cout << ans << "\n";
  //   return;
  // }

  // for (long long i = 0; i < n; i++)
  // {
  //   curr += v[i];
  //   if (curr >= target)
  //   {
  //     ans += i + 1;
  //     break;
  //   }
  // }

  // cout << ans << "\n";
}

int main()
{

  solution();

  return 0;
}