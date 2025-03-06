/*
 * url: https://vjudge.net/solution/58923920/WL6ptOwXRmZrHmJP7S8F
 * date: 06 - 03 - 2025
 * category: math
 * complexity: O(1)
 */

#include <bits/stdc++.h>
using namespace std;

int main()
{
  long long n{};
  cin >> n;

  if (n % 2 == 0)
    cout << n / 2 << "\n";
  else
    cout << -(n / 2 + 1) << "\n";

  return 0;
}