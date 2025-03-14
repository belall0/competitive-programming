/*
 * url: https://vjudge.net/solution/58906022/CpJEAXJWnKyXFROem0rD
 * date: 05 - 03 - 2025
 * category: sorting
 * complexity: O(nlogn)
 */

#include <bits/stdc++.h>
using namespace std;

int main()
{
  int n{};
  cin >> n;

  int *arr = new int[n];
  for (int i = 0; i < n; i++)
    cin >> arr[i];

  sort(arr, arr + n);
  for (int i = 0; i < n; i++)
    cout << arr[i] << " ";

  cout << "\n";

  return 0;
}