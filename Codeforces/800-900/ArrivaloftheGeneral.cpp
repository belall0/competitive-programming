/*
 * url: https://vjudge.net/solution/58957026/DxGNweZPWRPqCVBYjHpI
 * date: 07 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits/stdc++.h>
using namespace std;

void solution()
{
  int n{};
  cin >> n;

  vector<int> a(n);
  for (int i = 0; i < n; i++)
    cin >> a[i];

  int max_indx{0};
  for (int i = 1; i < n; i++)
    if (a[i] > a[max_indx])
      max_indx = i;

  int min_indx{0};
  for (int i = 1; i < n; i++)
    if (a[i] <= a[min_indx])
      min_indx = i;

  int res{max_indx + (n - 1 - min_indx)};

  if (min_indx < max_indx)
    res--;

  cout << res << "\n";
}

int main()
{
  solution();

  return 0;
}