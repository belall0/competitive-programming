/*
 * url: https://vjudge.net/solution/59206701/32ENEFCx6r2K68erMW19
 * date: 15 - 03 - 2025
 * category: implementation
 * complexity: o(n)
 */

#include <bits/stdc++.h>
using namespace std;

void solution()
{
  int n{};
  cin >> n;

  vector<int> v1, v2, v3;
  for (int i = 0; i < n; i++)
  {
    int num{};
    cin >> num;

    if (num == 1)
      v1.push_back(i + 1);
    else if (num == 2)
      v2.push_back(i + 1);
    else
      v3.push_back(i + 1);
  }

  auto min_size{min({v1.size(), v2.size(), v3.size()})};
  cout << min_size << "\n";

  for (int i = 0; i < min_size; i++)
    cout << v1[i] << " " << v2[i] << " " << v3[i] << "\n";
}

int main()
{

  solution();

  return 0;
}