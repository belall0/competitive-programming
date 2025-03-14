/*
 * url: https://vjudge.net/solution/59175189/SYqU2hww4cZw00PndbA4
 * date: 14 - 03 - 2025
 * category: implementation
 * complexity: O(n)
 */

#include <bits / stdc++.h>
using namespace std;

int main()
{
  int n{}, d{};
  cin >> n >> d;

  vector<int> vec(n);
  for (int i = 0; i < n; i++)
    cin >> vec[i];

  vector<int> res;

  res.insert(res.begin(), vec.begin() + d, vec.end());
  res.insert(res.end(), vec.begin(), vec.begin() + d);

  for (const int &i : res)
    cout << i << " ";
  cout << "\n";

  return 0;
}